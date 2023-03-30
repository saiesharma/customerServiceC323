package edu.iu.c323.customerservice.controller;

import java.util.*;
import edu.iu.c323.customerservice.model.Customer;
import edu.iu.c323.customerservice.repository.CustomerRespository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")

public class CustomerController {
    private CustomerRespository repository;
    public CustomerController(CustomerRespository repository)
    {
        this.repository = repository;
    }
    @GetMapping
    public List<Customer> findAll()
    {
        return repository.findAll();
    }
    @PostMapping
    public int create(@Valid @RequestBody Customer customer)
    {
        Customer newCustomer =  repository.save(customer);
        return newCustomer.getId();
    }
    @PutMapping("/{id}")
    public void update(@Valid @RequestBody Customer customer, @PathVariable int id)
    {
        customer.setId(id);
        repository.save(customer);
    }
    @DeleteMapping("/{id}")

    public void delete(@PathVariable int id)
    {
        Customer c = new Customer();
        c.setId(id);
        repository.delete(c);
    }

}
