package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.OrderLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderLogDao {
    @Results(id = "OrderLogTable",value = {
            @Result(property = "id",column = "id"),
            @Result(property = "orderUuid",column = "order_uuid"),
            @Result(property = "commodity",column = "commodity"),
            @Result(property = "money",column = "money"),
            @Result(property = "number",column = "number"),
    })

    @Insert("INSERT INTO order_log(order_uuid,commodity,money,number) " +
            "VALUES(#{orderUuid},#{commodity},#{money},#{number});")
    Integer addOrderLog(OrderLog orderLog);

    @Delete("DELETE FROM order_log WHERE id = ${id}")
    Integer deleteOrderLogByID(@Param("id") Integer id);

    @Delete("DELETE FROM order_log WHERE order_uuid = ${uuid}")
    Integer deleteOrderLogByUUID(@Param("uuid")String uuid);

    @Update("UPDATE order_log SET order_uuid=#{orderUuid},commodity=#{commodity}," +
            "money=#{money},number=#{number} WHERE id = #{id};")
    Integer updateOrderLogByID(OrderLog orderLog);

    @Select("SELECT * FROM order_log WHERE id = ${id}")
    @ResultMap("OrderLogTable")
    OrderLog selectOrderLogByID(@Param("id")Integer id);

    @Select("SELECT * FROM order_log WHERE id = ${uuid}")
    @ResultMap("OrderLogTable")
    List<OrderLog> selectOrderLogByUUID(@Param("uuid")String uuid);

    @Select("SELECT * FROM order_log")
    @ResultMap("OrderLogTable")
    List<OrderLog> selectAllOrderLog();
}
