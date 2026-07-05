package com.hemanthit.practice_project.controller;

import com.hemanthit.practice_project.model.Employee;
import com.hemanthit.practice_project.serviceImpl.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "employee")
@AllArgsConstructor
public class EmployeeController {

    EmployeeService service;

    @PostMapping("saveEmp")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee savedEmp =service.saveEmployee(employee);
        return new ResponseEntity<>(savedEmp, HttpStatus.CREATED);
    }

    @GetMapping("sortEmployee")
    public ResponseEntity<List<Employee>> sortEmployee(@RequestParam String orderType,@RequestParam String proprty){
        java.util.List<Employee> sortEmpList =service.sortEmployee(orderType,proprty);
        return new ResponseEntity<>(sortEmpList,HttpStatus.OK);
    }

    @GetMapping("searchFilters")
    public ResponseEntity<List<Employee>> filterEmployees(@RequestParam String empCode,@RequestParam String filter){
        List<Employee> empList =service.filterEmployee(empCode,filter);
        return new ResponseEntity<>(empList,HttpStatus.OK);
    }

    @GetMapping("searchEmp/{searchTerm}")
    public ResponseEntity<List<Employee>> searchEmployee(@PathVariable String searchTerm){
        java.util.List<Employee> searchEmp =service.searchEmployee(searchTerm);
        return new ResponseEntity<>(searchEmp,HttpStatus.OK);
    }

    @GetMapping("getEmployee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id){
        Employee getEmp=service.getEmployee(id);
        return new ResponseEntity<>(getEmp,HttpStatus.OK);
    }


}
