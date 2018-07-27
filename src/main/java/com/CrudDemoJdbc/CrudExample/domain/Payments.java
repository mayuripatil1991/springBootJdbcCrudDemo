package com.CrudDemoJdbc.CrudExample.domain;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Payments {
    Integer custId;
    Date paymentDate;
    Integer amount;

    @Override
    public String toString() {
        return "Payments{" +
                "custId=" + custId +
                ", paymentDate=" + paymentDate +
                ", amount=" + amount +
                '}';
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
