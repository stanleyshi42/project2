package com.example.project2.service;

import com.example.project2.entity.Customer;
import com.example.project2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repo;

    public Customer addCusomter(Customer cust){
        return repo.save(cust);
    }

    public List<Customer> getAllCustomers(){
        return repo.findAll();
    }

    public Customer getCustomerById(long id){
        return repo.findById(id).orElse(null);
    }

    public Customer updateCustomer(Customer cust){
        return repo.save(cust);
    }

    public void deleteCustomerById(long id){
        repo.deleteById(id);
    }
}
