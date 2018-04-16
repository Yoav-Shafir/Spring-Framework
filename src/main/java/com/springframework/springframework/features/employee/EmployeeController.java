package com.springframework.springframework.features.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/company")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /* to save an employee*/
    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee emp) {
        return employeeService.save(emp);
    }

    /*get all employees*/
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    /*get employee by empid*/
    @GetMapping("/employees/{id}")

    // ResponseEntity - Represents an HTTP request or response entity, consisting of headers and body.
    // also adds a HttpStatus status code.
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value="id") Long empid){
        Employee emp = employeeService.findOne(empid);
        if(emp == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(emp);
    }

    /*update an employee by empid*/
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long empid, @Valid @RequestBody Employee empDetails){
        Employee emp = employeeService.findOne(empid);
        if(emp == null) {
            return ResponseEntity.notFound().build();
        }
        emp.setName(empDetails.getName());
        emp.setDesignation(empDetails.getDesignation());
        emp.setExpertise(empDetails.getExpertise());
        Employee updateEmployee = employeeService.save(emp);
        return ResponseEntity.ok().body(updateEmployee);
    }

    /*Delete an employee*/
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable(value="id") Long empid){
        Employee emp = employeeService.findOne(empid);
        if(emp == null) {
            return ResponseEntity.notFound().build();
        }
        employeeService.delete(emp);
        return ResponseEntity.ok().build();


    }
}
