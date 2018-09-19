package liar.xiaoyu.www.service;

import liar.xiaoyu.www.entity.UserOrder;

import java.util.List;

public interface UserOrderService {
    Integer addUserOrder(UserOrder userOrder);

    Integer deleteUserOrderByID(Integer id);

    Integer updateUserOrder(UserOrder userOrder);

    UserOrder getUserOrderByID(Integer id);

    UserOrder getUserOrderByUUID(String uuid);

    List<UserOrder> getAllUserOrder();
}
