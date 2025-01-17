package com.pms.service;

import com.pms.exceptions.InvalidEntityException;
import com.pms.model.Employee;
import com.pms.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeById(int id) throws InvalidEntityException {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new InvalidEntityException("Employee with ID " + id + " not found."));
    }
}
