package com.CrudDemoJdbc.CrudExample.dao;

import com.CrudDemoJdbc.CrudExample.repo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class OrdersDao implements Orders {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void  createOrder(){
        String sql = "insert into Orders (orderId,orderDate,customerName,shippedDate,status) values(1,'2018/12/03','akshay','0000/00/00','accepted'),(1,'2018/12/04','akshay','0000/00/00','picked')";
        jdbcTemplate.update(sql);
        System.out.println("order created successfully");
    }

    @Override
    public List<Map<String,Object>> getAllOrders(){
        String sql = "select orderId,orderDate,customerName,status from Orders";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public void updateOrder(){
        System.out.println("order updated successfully");
    }

    @Override
    public void deleteOrder(){
        System.out.println("order deleted successfully");
    }


}
