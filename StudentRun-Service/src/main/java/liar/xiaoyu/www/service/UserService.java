package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.AbstractResponseMessage;
import liar.xiaoyu.www.entity.User;

import java.util.List;


public interface UserService<T extends AbstractResponseMessage>{
    /**
     * 功能：增加用户
     * 参数：用户
     * @param user
     * 返回值：返回类
     * @return
     */
    T addUser(User user);
    /**
     * 功能：通过ID删除用户
     * 参数：用户id
     * @param id
     * 返回值：返回类
     * @return
     */
    T deleteUserByID(Integer id);
    /**
     * 功能：批量删除用户
     * 参数：
     * @param ids
     * 返回值：返回类
     * @return
     */
    T deleteUserByList(List<Integer> ids);
    /**
     * 功能：通过ID更新User
     * 参数：
     * @param user
     * 返回值：返回类
     * @return
     */
    T updateUserByID(User user);
    /**
     * 功能：
     * 参数：
     * @param id
     * 返回值：返回类
     * @return
     */
    T getUserByID(Integer id);
    /**
     * 功能：得到所有用户
     * 参数：无
     * 返回值：返回类
     * @return
     */
    T getAllUser();
}
