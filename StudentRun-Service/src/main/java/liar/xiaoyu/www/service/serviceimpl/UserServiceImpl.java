package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.UserDao;
import liar.xiaoyu.www.entity.ResponseMessage;
import liar.xiaoyu.www.entity.User;
import liar.xiaoyu.www.service.UserService;
import liar.xiaoyu.www.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public ResponseMessage<Integer> addUser(@NotNull User user) {
        ResponseMessage<Integer> message = new ResponseMessage<>();

        Integer result = userDao.validationPhone(user.getPhone());
        if(result==0){
            Integer integer = userDao.insertUser(user);
            if(integer > 0){
                message.setSUCCESS(true);
                message.setDATA(integer);
                message.setMESSAGE("注册成功！");
            }
        }else{
            message.setMESSAGE("未知错误！请检查您的格式！");
        }
        return message;
    }

    @Override
    public ResponseMessage<Integer> deleteUserByID(@NotNull Integer id) {
        ResponseMessage<Integer> message = new ResponseMessage<>();
        Integer integer = userDao.deleteUserByID(id);
        if(integer > 0){
            message.setSUCCESS(true);
            message.setDATA(integer);
            message.setMESSAGE("插入成功！");
        }
        return message;
    }

    @Override
    public ResponseMessage<Integer> deleteUserByList(@NotEmpty List<Integer> ids) {
        ResponseMessage<Integer> message = new ResponseMessage<>();
        Integer integer = 0;
        for (Integer id:ids) {
            try {
                if(0 <userDao.deleteUserByID(id)){
                    integer++;
                }
            }catch (Exception e){
                integer = 0;
                message.setMESSAGE("批量删除错误！");
                break;
            }
        }
        if(integer > 0){
            message.setSUCCESS(true);
            message.setDATA(integer);
            message.setMESSAGE("插入成功！");
        }
        return message;
    }

    @Override
    public ResponseMessage<Integer> updateUserByID(User user) {
        ResponseMessage<Integer> message = new ResponseMessage<>();
        Integer integer = userDao.updateUserByID(user);
        if(integer > 0){
            message.setSUCCESS(true);
            message.setMESSAGE("更新成功！");
            message.setDATA(integer);
        }else {
            message.setMESSAGE("更新失败！");
        }
        return message;
    }

    @Override
    public ResponseMessage<User> getUserByID(Integer id) {
        ResponseMessage<User> message = new ResponseMessage<>();
        User user = userDao.selectUserByID(id);
        if(user!=null){
            message.setSUCCESS(true);
            message.setMESSAGE("查询成功！");
            message.setDATA(user);
        }else {
            message.setMESSAGE("没有查到这个id用户！");
        }
        return message;
    }

    @Override
    public ResponseMessage<List<User>> getAllUser() {
        ResponseMessage<List<User>> message = new ResponseMessage<>();
        List<User> users = userDao.selectAllUser();
        if(users != null && users.size() > 0){
            message.setSUCCESS(true);
            message.setMESSAGE("所有用户信息！");
            message.setDATA(users);
        }else {
            message.setMESSAGE("未知错误！");
        }
        return message;
    }

    @Override
    public ResponseMessage<Integer> validationPhone(String phone) {
        ResponseMessage<Integer> message = new ResponseMessage<>();
        Integer result = userDao.validationPhone(phone);
        if(result == 0){
            message.setSUCCESS(true);
            message.setDATA(result);
            message.setMESSAGE("该手机号码还未注册！");
        }else{
            message.setSUCCESS(false);
            message.setDATA(result);
            message.setMESSAGE("该手机号码已经存在！");
        }
        return message;
    }

    @Override
    public ResponseMessage<User> validationLogin(String phone, String password) {
        ResponseMessage<User> message = new ResponseMessage<>();
        User user = userDao.selectUserByPhone(phone);
        if(user != null){
            password = MD5Util.XMD5(password);
            if(user.getPassword().equals(password)){
                message.setSUCCESS(true);
                message.setMESSAGE("验证成功！");
                message.setDATA(user);
            }
        }else{
            message.setMESSAGE("验证失败！");
        }
        return message;
    }
}
