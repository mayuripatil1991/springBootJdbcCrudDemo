package com.CrudDemoJdbc.CrudExample;

import com.CrudDemoJdbc.CrudExample.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/CrudOperations")
public class CrudOperationsController {

    @Autowired
    private CustomersDao customersDao;

    @Autowired
    private OrderDetailsDao orderDetailsDao;

    @Autowired
    private OrdersDao ordersDao;

    @Autowired
    private PaymentsDao paymentsDao;

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/createCustomer")
    public String createCustomerData(){
        customersDao.createCustomer();
        return "Customer created successfully";
    }

    @RequestMapping("/getAllCustomers")
    public List<Map<String,Object>> getAllCustomerData(){
        List<Map<String,Object>> list = customersDao.getAllCustomers();
        return list;
    }

    @RequestMapping("/updateCustomer")
    public String updateCustomerData(){
        customersDao.updateCustomer();
        return "Customer updated successfully";
    }

    @RequestMapping("/deleteCustomer")
    public String deleteCustomerData(){
        customersDao.deleteCustomer();
        return "Customer deleted successfully";
    }

    @RequestMapping("/createOrder")
    public String createOrderData(){
        ordersDao.createOrder();
        return "Order created successfully";
    }

    @RequestMapping("/getAllOrders")
    public List<Map<String,Object>> getAllOrderData(){
        List<Map<String,Object>> list = ordersDao.getAllOrders();
        return list;
    }

   /* @RequestMapping("/updateCustomer")
    public String updateCustomerData(){
        customersDao.updateCustomer();
        return "Customer updated successfully";
    }

    @RequestMapping("/deleteCustomer")
    public String deleteCustomerData(){
        customersDao.deleteCustomer();
        return "Customer deleted successfully";
    }*/

    @RequestMapping("/createPayment")
    public String createPaymentData(){
        paymentsDao.createPayment();
        return "Payment created successfully";
    }

    @RequestMapping("/getAllPayments")
    public List<Map<String,Object>> getAllPaymentData(){
        List<Map<String,Object>> list = paymentsDao.getAllPayments();
        return list;
    }

    /*@RequestMapping("/updateCustomer")
    public String updateCustomerData(){
        customersDao.updateCustomer();
        return "Customer updated successfully";
    }

    @RequestMapping("/deleteCustomer")
    public String deleteCustomerData(){
        customersDao.deleteCustomer();
        return "Customer deleted successfully";
    }*/

    @RequestMapping("/getOrderByCustomer")
    public List<Map<String,Object>> getPaymentByCustomer(){
        List<Map<String,Object>> list = paymentsDao.getPaymentByCustomerId();
        return list;
    }

    @RequestMapping("/getOrderByCustomerLeftJoin")
    public List<Map<String,Object>> getPaymentByCustomerLeftJoin(){
        List<Map<String,Object>> list = paymentsDao.getPaymentByCustomerLeftJoin();
        return list;
    }

    @RequestMapping("/getPaymentByCustomerRightJoin")
    public List<Map<String,Object>> getPaymentByCustomerRightJoin(){
        List<Map<String,Object>> list = paymentsDao.getPaymentByCustomerRightJoin();
        return list;
    }

    @RequestMapping("/getPaymentByCustomerFullJoin")
    public List<Map<String,Object>> getPaymentByCustomerFullJoin(){
        List<Map<String,Object>> list = paymentsDao.getPaymentByCustomerFullJoin();
        return list;
    }


}
