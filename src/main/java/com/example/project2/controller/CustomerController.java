package com.example.project2.controller;

import com.example.project2.entity.Customer;
import com.example.project2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CustomerController {

    @Autowired
    CustomerService service;

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer cust){
        return service.addCusomter(cust);
    }

    @GetMapping("/customer")
    public ArrayList<Customer> getAllCustomers(){
        return (ArrayList<Customer>) service.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable long id){
        return service.getCustomerById(id);
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer cust){
        return service.updateCustomer(cust);
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomerById(@PathVariable long id){
        service.deleteCustomerById(id);
    }
}
