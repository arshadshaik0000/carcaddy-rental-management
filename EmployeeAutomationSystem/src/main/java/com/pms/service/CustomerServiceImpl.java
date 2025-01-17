package com.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pms.exceptions.InvalidEntityException;
import com.pms.model.Customer;
import com.pms.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findByCustomerId(int customerId) throws InvalidEntityException {
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new InvalidEntityException("Customer with ID " + customerId + " not found."));
    }

}
