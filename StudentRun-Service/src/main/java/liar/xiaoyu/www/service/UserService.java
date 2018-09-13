package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.User;

public interface UserService {
    Integer addUser(User user);
    Integer deleteUserByID(Integer id);
    Integer updateUserByID(Integer id, User user);
    User getUserByID(Integer id);
}
