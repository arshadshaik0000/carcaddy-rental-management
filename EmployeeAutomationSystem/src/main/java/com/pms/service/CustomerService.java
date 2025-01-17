package com.pms.service;

import com.pms.model.Customer;
import com.pms.exceptions.InvalidEntityException;

public interface CustomerService {
    public Customer findByCustomerId(int customerId) throws InvalidEntityException;
}
