package com.CrudDemoJdbc.CrudExample.repo;

import java.util.List;
import java.util.Map;

public interface Orders {

    void  createOrder();
    List<Map<String,Object>> getAllOrders();
    void updateOrder();
    void deleteOrder();
}
