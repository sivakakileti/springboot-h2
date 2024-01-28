package com.database.h2demo.service;

import com.database.h2demo.model.Employee;
import com.database.h2demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee saveEmployee(Employee employee){
     return employeeRepo.save(employee);
    }
}
