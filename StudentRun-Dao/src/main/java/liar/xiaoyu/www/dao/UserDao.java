package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {
    @Insert("INSERT INTO user(phone,username,sex,password,portrait,school,address,status) " +
            "VALUES(#{phone},#{username},#{sex},#{password},#{portrait},#{school},#{address},#{status});")
    Integer insertUser(User user);

    @Delete("DELETE FROM user WHERE id = ${value}")
    Integer deleteUserByID(Integer id);

    @Update("UPDATE user SET " +
            "phone=#{phone},username=#{username},sex=#{sex},password=#{password}," +
            "portrait=#{portrait},school=#{school},address=#{address},status=#{status} " +
            "WHERE id = ${id};")
    Integer updateUserByID(@Param("id") Integer id, User user);

    @Select("SELECT * FROM `user` WHERE id = ${value};")
    User selectUserByID(Integer id);
}
