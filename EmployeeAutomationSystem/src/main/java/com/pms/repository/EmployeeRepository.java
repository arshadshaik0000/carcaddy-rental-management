package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pms.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
