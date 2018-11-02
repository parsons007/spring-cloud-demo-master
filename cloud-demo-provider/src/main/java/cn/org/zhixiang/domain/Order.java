package cn.org.zhixiang.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    //订单id
    private int orderId;
    //商品id
    private int productId;
    //商品名称
    private String productName;
    //商品状态
    private boolean status;

    public Order() {

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {

        this.orderId = orderId;
    }

    public int getProductId() {

        return productId;
    }

    public void setProductId(int productId) {

        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", status=" + status +
                '}';
    }

}