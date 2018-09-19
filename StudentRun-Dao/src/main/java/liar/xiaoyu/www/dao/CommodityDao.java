package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.Commodity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityDao {
    @Insert("INSERT INTO commodity(name,img,price,type,status) VALUES(#{name},#{img},#{price},#{type},#{status});")
    Integer insertCommodity(Commodity commodity);
    @Delete("DELETE FROM commodity WHERE id = ${id};")
    Integer deleteCommodityByID(@Param("id")Integer id);
    @Update("UPDATE commodity SET name=#{name},img=#{img},price=#{price},type=#{type}," +
            "status=#{status} WHERE id = #{id};")
    Integer updateCommodityByID(Commodity commodity);
    @Select("SELECT * FROM commodity WHERE id = ${id}")
    Commodity selectCommodityByID(@Param("id")Integer id);
    @Select("SELECT * FROM commodity")
    List<Commodity> selectAllCommodity();
}
