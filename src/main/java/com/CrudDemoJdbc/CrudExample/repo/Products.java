package com.CrudDemoJdbc.CrudExample.repo;

import java.util.List;
import java.util.Map;

public interface Products {

    void createProduct();
    List<Map<String,Object>> getAllProducts();
    void updateProduct();
    void deleteProduct();
}
