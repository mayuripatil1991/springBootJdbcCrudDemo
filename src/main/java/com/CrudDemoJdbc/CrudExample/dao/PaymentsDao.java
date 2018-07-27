package com.CrudDemoJdbc.CrudExample.dao;

import com.CrudDemoJdbc.CrudExample.repo.Payments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class PaymentsDao implements Payments {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createPayment(){
        String sql = "insert into Payments (custId,paymentDate,amount) values(4,'2018/07/30',1000),(3,'2018/12/06',500)";
        jdbcTemplate.update(sql);
        System.out.println("Payment created successfully");
    }

    @Override
    public List<Map<String,Object>> getAllPayments(){
        String sql = "select * from Payments";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public void updatePayment(){
        System.out.println("Payment created successfully");
    }

    @Override
    public void deletePayment(){
        System.out.println("Payment created successfully");
    }

    @Override
    public List<Map<String,Object>> getPaymentByCustomerId(){
        String sql = "select id,customerName,phone,address,paymentDate,amount from Customers inner join Payments on Customers.id=Payments.custId";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public List<Map<String,Object>> getPaymentByCustomerLeftJoin(){
        String sql = "select id,customerName,phone,address,paymentDate,amount from Customers left join Payments on Customers.id=Payments.custId";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public List<Map<String,Object>> getPaymentByCustomerRightJoin(){
        String sql = "select id,customerName,phone,address,paymentDate,amount from Customers right join Payments on Customers.id=Payments.custId";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public List<Map<String,Object>> getPaymentByCustomerFullJoin(){
        String sql = "select id,customerName,phone,address,paymentDate,amount from Customers full join Payments on Customers.id=Payments.custId";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

}
