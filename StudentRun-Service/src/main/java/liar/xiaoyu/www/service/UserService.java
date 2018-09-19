package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.ResponseMessage;
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
    ResponseMessage addUser(User user);
    /**
     * 功能：通过ID删除用户
     * 参数：用户id
     * @param id
     * 返回值：返回类
     * @return
     */
    ResponseMessage deleteUserByID(Integer id);
    /**
     * 功能：批量删除用户
     * 参数：
     * @param ids
     * 返回值：返回类
     * @return
     */
    ResponseMessage deleteUserByList(List<Integer> ids);
    /**
     * 功能：通过ID更新User
     * 参数：
     * @param user
     * 返回值：返回类
     * @return
     */
    ResponseMessage updateUserByID(User user);
    /**
     * 功能：
     * 参数：
     * @param id
     * 返回值：返回类
     * @return
     */
    ResponseMessage getUserByID(Integer id);
    /**
     * 功能：得到所有用户信息
     * 参数：无
     * 返回值：返回类
     * @return
     */
    ResponseMessage getAllUser();

    /**
     * 功能：校验手机号码是否已存在
     * 参数：手机号码
     * 返回值：返回类
     * @return
     */
    ResponseMessage validationPhone(String phone);
    /**
     * 功能：校验登陆
     * 参数：手机号码、密码
     * @param phone
     * @param password
     * 返回值：返回类
     * @return
     */
    ResponseMessage validationLogin(String phone,String password);
}
