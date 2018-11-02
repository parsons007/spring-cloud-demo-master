package cn.org.zhixiang.service;

import cn.org.zhixiang.dao.OrderDao;
import cn.org.zhixiang.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceimp implements OrderService {
    @Autowired
    private OrderDao orderDao;


    //生成订单
    public int add(Order order) {
        return orderDao.addOrder(order);
    }

    //更新订单
    public void update(Order order) {
        orderDao.updateOrder(order);
    }

    //通过商品id删除订单
    public void delete(int productId) {
        orderDao.deleteOrder(productId);
    }

    //通过id查询订单
    public Order findItemById(int orderId) {
        return orderDao.findByorderId(orderId);
    }

    //查找全部订单
    public List<Order> findAll() {
        return orderDao.findAll();
    }
}

