package com.CrudDemoJdbc.CrudExample.repo;

import java.util.List;
import java.util.Map;

public interface OrderDetails {

    void createOrderDetails();
    List<Map<String,Map>> getAllOrderDetails();
    void updateOrderDetails();
    void deleteOrderDetails();
}
