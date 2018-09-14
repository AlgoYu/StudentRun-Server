package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.UserDao;
import liar.xiaoyu.www.entity.User;
import liar.xiaoyu.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

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
}
