package com.CrudDemoJdbc.CrudExample.repo;

import java.util.List;
import java.util.Map;

public interface Customers {

    void createCustomer();
    List<Map<String,Object>> getAllCustomers();
    void updateCustomer();
    void deleteCustomer();
}
