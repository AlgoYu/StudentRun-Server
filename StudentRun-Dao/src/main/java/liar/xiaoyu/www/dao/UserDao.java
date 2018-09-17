package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * 功能：插入用户
     * 参数：用户
     * @param user
     * 返回值：插入行数
     * @return
     */
    @Insert("INSERT INTO user(phone,username,sex,password,portrait,school,address,status) " +
            "VALUES(#{phone},#{username},#{sex},#{password},#{portrait},#{school},#{address},#{status});")
    Integer insertUser(User user);

    /**
     * 功能：通过id删除用户
     * 参数：用户ID
     * @param id
     * 返回值：受到更改的行数
     * @return
     */
    @Delete("DELETE FROM user WHERE id = ${value}")
    Integer deleteUserByID(Integer id);

    /**
     * 功能：更新用户的信息
     * 参数：用户
     * @param user
     * 返回值：受到更改的行数
     * @return
     */
    @Update("UPDATE user SET " +
            "phone=#{phone},username=#{username},sex=#{sex},password=#{password}," +
            "portrait=#{portrait},school=#{school},address=#{address},status=#{status} " +
            "WHERE id = #{id};")
    Integer updateUserByID(User user);

    /**
     * 功能：通过
     * 参数：用户ID
     * @param id
     * 返回值：用户
     * @return
     */
    @Select("SELECT * FROM `user` WHERE id = ${value};")
    User selectUserByID(Integer id);

    /**
     * 功能：通过手机号码查找用户
     * 参数：手机号码
     * @param phone
     * 返回值：用户
     * @return
     */
    @Select("SELECT * FROM `user` WHERE phone = ${phone};")
    User selectUserByPhone(String phone);

    /**
     * 功能：得到所有用户信息
     * 参数：无
     * 返回值：所有用户
     * @return
     */
    @Select("SELECT * FROM `user`")
    List<User> selectAllUser();

    /**
     * 功能：校验手机号码是否已存在
     * 参数：手机号码
     * 返回值：记录总数
     * @return
     */
    @Select("SELECT COUNT(*) FROM `user` WHERE phone = '${phone}';")
    Integer validationPhone(String phone);
}
