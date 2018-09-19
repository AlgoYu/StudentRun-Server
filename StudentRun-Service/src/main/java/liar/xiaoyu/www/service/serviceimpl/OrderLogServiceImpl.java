package liar.xiaoyu.www.service.serviceimpl;

import liar.xiaoyu.www.dao.OrderLogDao;
import liar.xiaoyu.www.entity.OrderLog;
import liar.xiaoyu.www.service.OrderLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLogServiceImpl implements OrderLogService {
    @Autowired
    OrderLogDao orderLogDao;

    @Override
    public Integer addOrderLog(OrderLog orderLog) {
        return orderLogDao.addOrderLog(orderLog);
    }

    @Override
    public Integer deleteOrderLogByID(Integer id) {
        return orderLogDao.deleteOrderLogByID(id);
    }

    @Override
    public Integer updateOrderLogByID(OrderLog orderLog) {
        return orderLogDao.updateOrderLogByID(orderLog);
    }

    @Override
    public OrderLog getOrderLogByID(Integer id) {
        return orderLogDao.selectOrderLogByID(id);
    }

    @Override
    public List<OrderLog> getOrderLogByUUID(String uuid) {
        return orderLogDao.selectOrderLogByUUID(uuid);
    }

    @Override
    public List<OrderLog> getAllOrderLog() {
        return orderLogDao.selectAllOrderLog();
    }
}
