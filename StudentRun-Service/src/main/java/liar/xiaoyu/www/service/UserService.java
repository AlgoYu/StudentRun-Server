package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.User;
import java.util.List;


public interface UserService{
    /**
     * 功能：增加用户
     * 参数：用户
     * @param user
     * 返回值：返回类
     * @return
     */
    Integer addUser(User user);
    /**
     * 功能：通过ID删除用户
     * 参数：用户id
     * @param id
     * 返回值：返回类
     * @return
     */
    Integer deleteUserByID(Integer id);
    /**
     * 功能：通过ID更新User
     * 参数：
     * @param user
     * 返回值：返回类
     * @return
     */
    Integer updateUserByID(User user);
    /**
     * 功能：
     * 参数：
     * @param id
     * 返回值：返回类
     * @return
     */
    User getUserByID(Integer id);
    /**
     * 功能：得到所有用户信息
     * 参数：无
     * 返回值：返回类
     * @return
     */
    List<User> getAllUser();

    /**
     * 功能：校验手机号码是否已存在
     * 参数：手机号码
     * 返回值：返回类
     * @return
     */
    Integer validationPhone(String phone);
    /**
     * 功能：校验登陆
     * 参数：手机号码、密码
     * @param phone
     * @param password
     * 返回值：返回类
     * @return
     */
    Boolean validationLogin(String phone,String password);
}
