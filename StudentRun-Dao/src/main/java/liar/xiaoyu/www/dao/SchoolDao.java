package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.School;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SchoolDao {
    /**
     * 功能：增加学校
     * 参数：学校类
     * @param school
     * 返回值：增加行数
     * @return
     */
    @Insert("INSERT INTO school(name) VALUES(#{name});")
    Integer addSchool(School school);
    /**
     * 功能：删除学校
     * 参数：学校id
     * @param id
     * 返回值：删除行数
     * @return
     */
    @Delete("DELETE FROM school WHERE id = ${id};")
    Integer deleteSchoolByID(@Param("id")Integer id);
    /**
     * 功能：更新学校
     * 参数：学校类
     * @param school
     * 返回值：更新行数
     * @return
     */
    @Update("UPDATE school SET school=#{name} WHERE id = #{id};")
    Integer updateSchoolByID(School school);

    /**
     * 功能：查询学校
     * 参数：学校id
     * @param id
     * 返回值：学校类
     * @return
     */
    @Select("SELECT * FROM school WHERE id = ${id};")
    School selectSchoolByID(@Param("id")Integer id);

    /**
     * 功能：查询所有学校
     * 参数：无
     * 返回值：学校集合
     * @return
     */
    @Select("SELECT * FROM school")
    List<School> selectAllSchool();
}
