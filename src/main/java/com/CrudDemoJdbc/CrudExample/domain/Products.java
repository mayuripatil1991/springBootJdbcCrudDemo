package com.CrudDemoJdbc.CrudExample.domain;

import org.springframework.stereotype.Service;

@Service
public class Products {
    Integer productCode;
    String productName;
    Integer buyPrice;

    @Override
    public String toString() {
        return "Products{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", buyPrice=" + buyPrice +
                '}';
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Integer buyPrice) {
        this.buyPrice = buyPrice;
    }
}
