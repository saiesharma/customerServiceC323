package edu.iu.c323.customerservice.repository;

import edu.iu.c323.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRespository extends JpaRepository<Customer,Integer> {


}
