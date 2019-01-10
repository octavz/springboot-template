package com.example.demo.customer.services;

import com.example.demo.customer.models.Customer;

import java.util.List;

public interface CustomerService {
    void insert(Customer cus);
    void insertBatch(List<Customer> customers);
    void loadAllCustomer();
    Customer getCustomerById(long cust_id);
    void getCustomerNameById(long cust_id);
    void getTotalNumerCustomer();
}
