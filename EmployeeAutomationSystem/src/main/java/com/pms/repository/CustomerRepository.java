package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pms.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
