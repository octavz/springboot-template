package com.example.demo.controllers;

import com.example.demo.customer.models.Customer;
import com.example.demo.customer.services.CustomerService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CustomerController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    CustomerService customerService;

    @RequestMapping("/")
    public String index() {
        Customer c = new Customer(1L, "John Doe", 25);
        customerService.insert(c);
        Customer dbCustomer = customerService.getCustomerById(1L);
        return "Greetings from Spring Boot! " + dbCustomer.getName() ;
    }

}
