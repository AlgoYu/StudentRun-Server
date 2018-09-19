package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.Staff;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StaffDao {
    @Insert("INSERT INTO staff(phone,name,sex,password,portrait,school,status,level)" +
            " VALUES(NULL,#{phone},#{name},#{sex},#{password},#{portrait},#{school},#{status},#{level});")
    Integer insertStaff(Staff staff);
    @Delete("DELETE FROM staff WHERE id = ${id};")
    Integer deleteStaffByID(@Param("id")Integer id);
    @Update("UPDATE staff SET phone=#{phone},name=#{name},sex=#{sex}," +
            "password=#{password},portrait=#{portrait},school=#{school}," +
            "status=#{status},level=#{level} WHERE id=#{id};")
    Integer updateStaffByID(Staff staff);
    @Select("SELECT * FROM staff WHERE id = ${id};")
    Staff selectStaffByID(@Param("id")Integer id);
    @Select("SELECT * FROM staff")
    List<Staff> selectAllStaff();
}
