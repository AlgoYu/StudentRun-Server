package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.OrderLog;

import java.util.List;

public interface OrderLogService {
    Integer addOrderLog(OrderLog orderLog);

    Integer deleteOrderLogByID(Integer id);

    Integer updateOrderLogByID(OrderLog orderLog);

    OrderLog getOrderLogByID(Integer id);

    List<OrderLog> getOrderLogByUUID(String uuid);

    List<OrderLog> getAllOrderLog();
}
