package com.example.demo.customer.services.impl;

import com.example.demo.customer.dao.CustomerDao;
import com.example.demo.customer.models.Customer;
import com.example.demo.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public void insert(Customer cus) {
        customerDao.insert(cus);
    }

    @Override
    public void insertBatch(List<Customer> customers) {
        customerDao.inserBatch(customers);
    }

    public void loadAllCustomer(){
        List<Customer> listCust = customerDao.loadAllCustomer();
        for(Customer cus: listCust){
            System.out.println(cus.toString());
        }
    }

    @Override
    public Customer getCustomerById(long cust_id) {
        return customerDao.findCustomerById(cust_id);
    }

    @Override
    public void getCustomerNameById(long cust_id) {
        String name = customerDao.findNameById(cust_id);
        System.out.println("Customer's name = " + name);
    }

    @Override
    public void getTotalNumerCustomer() {
        int totalNumberCustomer = customerDao.getTotalNumberCustomer();
        System.out.println("Total Number Customer is: " + totalNumberCustomer);
    }

}