package com.CrudDemoJdbc.CrudExample.domain;

import org.springframework.stereotype.Service;

@Service
public class Customers {
    Integer id;
    String customerName;
    Long phone;
    String address;

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
