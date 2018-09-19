package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.Feedback;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FeedBackDao {
    @Insert("INSERT INTO feedback(uuid,type,content,status,reply) " +
            "VALUES(#{uuid},#{type},#{content},#{status},#{reply});")
    Integer addFeedBack(Feedback feedback);

    @Delete("DELETE FROM feedback WHERE id = ${id}")
    Integer deleteFeedBackByID(@Param("id") Integer id);

    @Update("UPDATE feedback SET uuid=#{uuid},type=#{type},content=#{content}," +
            "status=#{status},reply=#{reply} WHERE id = #{id}")
    Integer updateFeedBackByID(Feedback feedback);

    @Select("SELECT * FROM feedback WHERE id = ${id}")
    Feedback selectFeedBackByID(@Param("id") Integer id);

    @Select("SELECT * FROM feedback")
    List<Feedback> selectAllFeedBack();
}
