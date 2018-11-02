package cn.org.zhixiang.dao;

import cn.org.zhixiang.domain.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderDao {

    //添加商品订单
    @Insert("insert into order_(orderId,productId,productName,status)values(#{orderId},#{productId},#{productName},#{status})")
    public int addOrder(Order order);

    //更新商品订单
    @Update("update order_ set  productId=#{productId},productName=#{productName} where orderId=#{orderId}")
    void updateOrder(Order order);


    // 商品订单删除
    @Delete("delete from order_ where orderId=#{orderId}")
    void deleteOrder(int orderId);
    //查询全部订单
    @Select("select * from order_")
    List<Order> findAll();

    //根据商品ID查询商品信息
    @Select("SELECT orderId,productId,productName,status FROM order_ where orderId=#{orderId}")
    Order findByorderId(@Param("orderId") int orderId);

}