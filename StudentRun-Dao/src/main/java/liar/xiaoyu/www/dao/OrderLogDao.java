package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.OrderLog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OrderLogDao {
    @Insert("INSERT INTO order_log(order_uuid,commodity,money,number) " +
            "VALUES(#{orderUuid},#{commodity},#{money},#{number});")
    Integer addOrderLog(OrderLog orderLog);
    @Delete("DELETE FROM order_log WHERE order_uuid = ${uuid}")
    Integer deleteOrderLogByUUID(@Param("uuid")String uuid);
    @Update("")
    Integer updateOrderLogByID();
    OrderLog selectOrderLogByID();
    List<OrderLog> selectOrderLogByUUID();
    List<OrderLog> selectAllOrderLog();
}
