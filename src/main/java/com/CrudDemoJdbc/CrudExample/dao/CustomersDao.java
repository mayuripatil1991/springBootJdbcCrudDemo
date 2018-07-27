package com.CrudDemoJdbc.CrudExample.dao;

import com.CrudDemoJdbc.CrudExample.repo.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class CustomersDao implements Customers {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CustomersDao customersDao;

    @Override
    public void createCustomer(){
        String sql = "insert into Customers (id,customerName,phone,address) values(2,'akash',9850914481,'hadapsar'),(3,'akshay',8888888888,'vadgaon'),(4,'shilpa',4545454545,'warje')";
        jdbcTemplate.update(sql);
        System.out.print("Customer Created successfully");
    }

    @Override
    public List<Map<String,Object>> getAllCustomers(){
        String sql = "select * from Customers";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public void updateCustomer(){
        String sql= "update Customers set phone=9999999999 where id=2";
        jdbcTemplate.update(sql);
        System.out.print("Customer updated successfully");
    }

    @Override
    public void deleteCustomer(){
        String sql = "delete from Customers where id=2";
        jdbcTemplate.update(sql);
        System.out.print("Customer deleted successfully");
    }
}
