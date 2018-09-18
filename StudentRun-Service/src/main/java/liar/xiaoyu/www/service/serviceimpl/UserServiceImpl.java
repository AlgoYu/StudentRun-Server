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
    public ResponseMessage<Integer> addUser(User user) {
        ResponseMessage<Integer> message = new ResponseMessage<>();
        Integer result = userDao.validationPhone(user.getPhone());
        if(result==0){
            Integer integer = userDao.insertUser(user);
            if(integer > 0){
                message.setSucces(true);
                message.setData(integer);
                message.setMessage("注册成功！");
            }
        }else{
            message.setMessage("该手机号码已经被注册！");
        }
        return message;
    }

    @Override
    public ResponseMessage<Integer> deleteUserByID(Integer id) {
        ResponseMessage<Integer> message = new ResponseMessage<>();
        Integer integer = userDao.deleteUserByID(id);
        if(integer > 0){
            message.setSucces(true);
            message.setData(integer);
            message.setMessage("插入成功！");
        }
        return message;
    }

    @Override
    public ResponseMessage<Integer> deleteUserByList(List<Integer> ids) {
        ResponseMessage<Integer> message = new ResponseMessage<>();
        Integer integer = 0;
        for (Integer id:ids) {
            try {
                if(0 <userDao.deleteUserByID(id)){
                    integer++;
                }
            }catch (Exception e){
                integer = 0;
                message.setMessage("批量删除错误！");
                break;
            }
        }
        if(integer > 0){
            message.setSucces(true);
            message.setData(integer);
            message.setMessage("插入成功！");
        }
        return message;
    }

    @Override
    public ResponseMessage<Integer> updateUserByID(User user) {
        ResponseMessage<Integer> message = new ResponseMessage<>();
        if(userDao.validationPhone(user.getPhone())>0){
            message.setMessage("已存在的手机号码！");
        }else{
            Integer integer = userDao.updateUserByID(user);
            if(integer > 0){
                message.setSucces(true);
                message.setMessage("更新成功！");
                message.setData(integer);
            }else {
                message.setMessage("没有找到这个ID的用户！");
            }
        }
        return message;
    }

    @Override
    public ResponseMessage<User> getUserByID(Integer id) {
        ResponseMessage<User> message = new ResponseMessage<>();
        User user = userDao.selectUserByID(id);
        if(user!=null){
            message.setSucces(true);
            message.setMessage("查询成功！");
            message.setData(user);
        }else {
            message.setMessage("没有查到这个id用户！");
        }
        return message;
    }

    @Override
    public ResponseMessage<List<User>> getAllUser() {
        ResponseMessage<List<User>> message = new ResponseMessage<>();
        List<User> users = userDao.selectAllUser();
        if(users != null && users.size() > 0){
            message.setSucces(true);
            message.setMessage("所有用户信息！");
            message.setData(users);
        }else {
            message.setMessage("未知错误！");
        }
        return message;
    }

    @Override
    public ResponseMessage<Integer> validationPhone(String phone) {
        ResponseMessage<Integer> message = new ResponseMessage<>();
        Integer result = userDao.validationPhone(phone);
        if(result == 0){
            message.setSucces(true);
            message.setData(result);
            message.setMessage("该手机号码还未注册！");
        }else{
            message.setSucces(false);
            message.setData(result);
            message.setMessage("该手机号码已经存在！");
        }
        System.out.println(message.toString());
        return message;
    }

    @Override
    public ResponseMessage<User> validationLogin(String phone, String password) {
        ResponseMessage<User> message = new ResponseMessage<>();
        User user = userDao.selectUserByPhone(phone);
        if(user != null){
            password = MD5Util.XMD5(password);
            if(user.getPassword().equals(password)){
                message.setSucces(true);
                message.setMessage("验证成功！");
                message.setData(user);
            }
        }else{
            message.setMessage("验证失败！");
        }
        return message;
    }
}
