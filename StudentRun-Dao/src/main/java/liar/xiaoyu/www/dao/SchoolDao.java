package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.School;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SchoolDao {
    /**
     * 功能：增加学校
     * 参数：学校姓名
     * @param name
     * 返回值：增加行数
     * @return
     */
    @Insert("INSERT INTO school VALUES(NULL,'${name}');")
    Integer addSchool(@Param("name")String name);
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
     * 参数：学校id,姓名
     * @param id
     * @param name
     * 返回值：更新行数
     * @return
     */
    @Update("UPDATE school SET `school`='${name}' WHERE id = ${id};")
    Integer updateSchoolByID(@Param("id")Integer id,@Param("name")String name);

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
