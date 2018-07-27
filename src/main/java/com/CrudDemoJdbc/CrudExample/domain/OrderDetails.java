package com.CrudDemoJdbc.CrudExample.domain;

import org.springframework.stereotype.Service;

@Service
public class OrderDetails {
    Integer id;
    Integer productCode;
    Integer quantityOrdered;
    Integer price;

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", productCode=" + productCode +
                ", quantityOrdered=" + quantityOrdered +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public Integer getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Integer quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
