package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.UserDao;
import liar.xiaoyu.www.entity.User;
import liar.xiaoyu.www.service.UserService;
import liar.xiaoyu.www.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public Integer addUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public Integer deleteUserByID(Integer id) {
        return userDao.deleteUserByID(id);
    }

    @Override
    public Integer updateUserByID(User user) {
        return userDao.updateUserByID(user);
    }

    @Override
    public User getUserByID(Integer id) {
        return userDao.selectUserByID(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public Integer validationPhone(String phone) {
        return userDao.selectCountByPhone(phone);
    }

    @Override
    public Boolean validationLogin(String phone, String password) {
        Boolean flag = false;
        User user = userDao.selectUserByPhone(phone);
        if(user != null && user.getPassword().equals(MD5Util.XMD5(password))){
            flag = true;
        }
        return flag;
    }
}
