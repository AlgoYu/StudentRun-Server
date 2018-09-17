package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.UserDao;
import liar.xiaoyu.www.entity.ResponseMessageCommon;
import liar.xiaoyu.www.entity.User;
import liar.xiaoyu.www.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class UserServiceImpl implements UserService<ResponseMessageCommon<?>> {
    @Autowired
    UserDao userDao;

    @Override
    public ResponseMessageCommon<Integer> addUser(@NotNull User user) {
        ResponseMessageCommon<Integer> message = new ResponseMessageCommon<>();

        Integer result = userDao.validationPhone(user.getPhone());
        if(result==0){
            Integer integer = userDao.insertUser(user);
            if(integer > 0){
                message.setSUCCESS(true);
                message.setDATA(integer);
                message.setMESSAGE("插入成功！");
            }
        }else{
            message.setErrorCode(2);
            message.setErrorMessage("该手机号码已经被注册了！");
        }
        return message;
    }

    @Override
    public ResponseMessageCommon<Integer> deleteUserByID(@NotNull Integer id) {
        ResponseMessageCommon<Integer> message = new ResponseMessageCommon<>();
        Integer integer = userDao.deleteUserByID(id);
        if(integer > 0){
            message.setSUCCESS(true);
            message.setDATA(integer);
            message.setMESSAGE("插入成功！");
        }
        return message;
    }

    @Override
    public ResponseMessageCommon<Integer> deleteUserByList(@NotEmpty List<Integer> ids) {
        ResponseMessageCommon<Integer> message = new ResponseMessageCommon<>();
        Integer integer = 0;
        for (Integer id:ids) {
            try {
                if(0 <userDao.deleteUserByID(id)){
                    integer++;
                }
            }catch (Exception e){
                integer = 1;
                message.setErrorCode(1);
                message.setErrorMessage("这个集合执行错误:"+e.toString());
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
    public ResponseMessageCommon<Integer> updateUserByID(User user) {
        ResponseMessageCommon<Integer> message = new ResponseMessageCommon<>();
        Integer integer = userDao.updateUserByID(user);
        if(integer > 0){
            message.setSUCCESS(true);
            message.setMESSAGE("更新成功！");
            message.setDATA(integer);
        }
        return message;
    }

    @Override
    public ResponseMessageCommon<User> getUserByID(Integer id) {
        ResponseMessageCommon<User> message = new ResponseMessageCommon<>();
        User user = userDao.selectUserByID(id);
        if(user!=null){
            message.setSUCCESS(true);
            message.setMESSAGE("查询成功！");
            message.setDATA(user);
        }
        return message;
    }

    @Override
    public ResponseMessageCommon<List<User>> getAllUser() {
        ResponseMessageCommon<List<User>> message = new ResponseMessageCommon<>();
        List<User> users = userDao.selectAllUser();
        if(users != null && users.size() > 0){
            message.setSUCCESS(true);
            message.setMESSAGE("所有用户信息！");
            message.setDATA(users);
        }
        return message;
    }

    @Override
    public ResponseMessageCommon<Integer> validationPhone(String phone) {
        ResponseMessageCommon<Integer> message = new ResponseMessageCommon<>();
        Integer result = userDao.validationPhone(phone);
        if(result == 0){
            message.setSUCCESS(true);
            message.setDATA(result);
            message.setMESSAGE("该手机号码还未注册！");
        }else{
            message.setSUCCESS(true);
            message.setDATA(result);
            message.setMESSAGE("该手机号码已经存在！");
        }
        return message;
    }
}
