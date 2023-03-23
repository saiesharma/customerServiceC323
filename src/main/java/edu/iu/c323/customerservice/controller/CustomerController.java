package edu.iu.c323.customerservice.controller;

import java.util.*;
import edu.iu.c323.customerservice.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")

public class CustomerController {
    @GetMapping
    public List<Customer> findAll()
    {
        return null;
    }
    @PostMapping
    public int create(Customer customer)
    {
        return 0;
    }
}
