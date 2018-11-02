package cn.org.zhixiang.service;


import cn.org.zhixiang.domain.Order;

import java.util.List;

public interface OrderService {
    //生成订单
    int add(Order order);

    //更新订单
    void update(Order order);


    //通过商品id删除订单
    void delete(int productId);

    //通过id查询订单
    Order findItemById(int orderId);
    //查找全部订单
    List<Order> findAll();

}