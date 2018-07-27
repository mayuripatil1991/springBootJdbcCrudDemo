package com.CrudDemoJdbc.CrudExample.domain;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Orders {

    Integer orderId;
    Date orderDate;
    String customerName;
    Date shippedDate;
    String status;

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", customerName='" + customerName + '\'' +
                ", shippedDate=" + shippedDate +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
