package com.example.demo.customer.services.impl;

import com.example.demo.customer.models.Customer;
import com.example.demo.customer.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stub")
public class CustomerServiceStubImpl implements CustomerService {

    private Logger logger = LoggerFactory.getLogger(CustomerServiceStubImpl.class);

    @Override
    public void insert(Customer cus) {
        System.out.printf("Inserting customer %s.\n", cus.getName());
    }

    @Override
    public void insertBatch(List<Customer> customers) {
        System.out.printf("Inserting %d customers.\n", customers.size());
    }

    public void loadAllCustomer() {
        System.out.println("Loading customers.\n");
    }

    @Override
    public Customer getCustomerById(long customerId) {
        logger.info("Getting customer by id {}", customerId);
        return new Customer(1, "John", 34);
    }

    @Override
    public void getCustomerNameById(long customerId) {
        logger.info("Getting customer by name {}", customerId);
        Customer customer = new Customer(customerId, "John", 34);
        System.out.println("Customer's name = " + customer.getName());
    }

    @Override
    public void getTotalNumberCustomer() {
        System.out.println("Total Number Customer is: " + 42);
    }

}