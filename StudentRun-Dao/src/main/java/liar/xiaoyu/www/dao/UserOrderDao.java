package liar.xiaoyu.www.dao;

import liar.xiaoyu.www.entity.UserOrder;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserOrderDao {
    @Results(id = "UserOrderTable", value = {
            @Result(property = "id",column = "id"),
            @Result(property = "orderUuid",column = "order_uuid"),
            @Result(property = "userId",column = "user_id"),
            @Result(property = "money",column = "money"),
            @Result(property = "staff",column = "staff"),
            @Result(property = "info",column = "info"),
            @Result(property = "status",column = "status"),
            @Result(property = "datetime",column = "datetime")
    })

    @Insert("INSERT INTO user_order(order_uuid,user_id,money,staff,info,status) " +
            "VALUES(#{orderUuid},#{userId},#{money},#{staff},#{info},#{status});")
    Integer addOrder();

    @Delete("DELETE FROM user_order WHERE id = ${id}")
    Integer deleteOrderByID(@Param("id")Integer id);

    @Update("UPDATE user_order SET order_uuid=#{orderUuid},user_id=#{userId},money=#{money}," +
            "staff=#{staff},info=#{info},status=#{status},datetime=#{datetime}" +
            " WHERE id = #{id};")
    Integer updateOrderByID(UserOrder userOrder);

    @Select("SELECT * FROM user_order WHERE id = ${id}")
    @ResultMap("UserOrderTable")
    UserOrder selectOrderByID(@Param("id")Integer id);

    @Select("SELECT * FROM user_order WHERE order_uuid = ${uuid}")
    @ResultMap("UserOrderTable")
    UserOrder selectOrderByUUID(@Param("uuid")String uuid);
    @Select("SELECT * FROM user_order")
    @ResultMap("UserOrderTable")
    List<UserOrder> selectAllOrder();
}
