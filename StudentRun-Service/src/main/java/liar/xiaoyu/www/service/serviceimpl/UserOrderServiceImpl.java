package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.UserOrderDao;
import liar.xiaoyu.www.entity.UserOrder;
import liar.xiaoyu.www.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserOrderServiceImpl implements UserOrderService {
    @Autowired
    UserOrderDao userOrderDao;

    @Override
    public Integer addUserOrder(UserOrder userOrder) {
        return userOrderDao.insertOrder(userOrder);
    }

    @Override
    public Integer deleteUserOrderByID(Integer id) {
        return userOrderDao.deleteOrderByID(id);
    }

    @Override
    public Integer updateUserOrder(UserOrder userOrder) {
        return userOrderDao.updateOrderByID(userOrder);
    }

    @Override
    public UserOrder getUserOrderByID(Integer id) {
        return userOrderDao.selectOrderByID(id);
    }

    @Override
    public UserOrder getUserOrderByUUID(String uuid) {
        return userOrderDao.selectOrderByUUID(uuid);
    }

    @Override
    public List<UserOrder> getAllUserOrder() {
        return userOrderDao.selectAllOrder();
    }
}
