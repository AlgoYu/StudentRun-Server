package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.CommodityType;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityTypeDao {
    /**
     * 功能：增加商品类型
     * 参数：商品类型姓名
     * @param name
     * 返回值：增加行数
     * @return
     */
    @Insert("INSERT INTO commodity_type VALUES(NULL,'${name}');")
    Integer addCommodityType(@Param("name")String name);
    /**
     * 功能：删除商品类型
     * 参数：商品类型id
     * @param id
     * 返回值：删除行数
     * @return
     */
    @Delete("DELETE FROM commodity_type WHERE id = ${id};")
    Integer deleteCommodityTypeByID(@Param("id")Integer id);
    /**
     * 功能：更新商品类型
     * 参数：商品类型id,姓名
     * 返回值：更新行数
     * @return
     */
    @Update("UPDATE commodity_type SET name=#{name} WHERE id = #{id};")
    Integer updateCommodityTypeByID(CommodityType commodityType);

    /**
     * 功能：查询商品类型
     * 参数：商品类型id
     * @param id
     * 返回值：商品类型类
     * @return
     */
    @Select("SELECT * FROM commodity_type WHERE id = ${id};")
    CommodityType selectCommodityTypeByID(@Param("id")Integer id);

    /**
     * 功能：查询所有商品类型
     * 参数：无
     * 返回值：商品类型类集合
     * @return
     */
    @Select("SELECT * FROM commodity_type")
    List<CommodityType> selectAllCommodityType();
}
