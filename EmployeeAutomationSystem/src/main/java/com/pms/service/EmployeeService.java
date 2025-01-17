package com.pms.service;

import com.pms.exceptions.InvalidEntityException;
import com.pms.model.Employee;

public interface EmployeeService {
    public Employee getEmployeeById(int id) throws InvalidEntityException;
}
