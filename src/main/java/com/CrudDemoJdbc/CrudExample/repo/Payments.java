package com.CrudDemoJdbc.CrudExample.repo;

import java.util.List;
import java.util.Map;

public interface Payments {

    void createPayment();
    List<Map<String,Object>> getAllPayments();
    void updatePayment();
    void deletePayment();
    List<Map<String,Object>> getPaymentByCustomerId();
    List<Map<String,Object>> getPaymentByCustomerLeftJoin();
    List<Map<String,Object>> getPaymentByCustomerRightJoin();
    List<Map<String,Object>> getPaymentByCustomerFullJoin();
}
