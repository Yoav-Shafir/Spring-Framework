package com.springframework.springframework.features.employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee emp);
    List<Employee> findAll();
    Employee findOne(Long empid);
    void delete(Employee emp);
}
