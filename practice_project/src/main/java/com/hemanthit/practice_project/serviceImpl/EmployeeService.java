package com.hemanthit.practice_project.serviceImpl;

import com.hemanthit.practice_project.constants.SearchFilters;
import com.hemanthit.practice_project.model.Employee;
import com.hemanthit.practice_project.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        //Business logic
        employee.setFullName(employee.getFirstName().concat(" "+employee.getLastName()));
        return repository.save(employee);
    }

    public List<Employee> sortEmployee(String orderType, String proprty) {


            return repository.findAll(Sort.by(proprty));
    }

    public List<Employee> filterEmployee(String empCode, String filter) {

        List<Employee> list = null;

        switch(filter) {
            case SearchFilters.STARTS_WITH:
                list = repository.findByEmpCodeStartingWith(empCode);
                break;
            case SearchFilters.ENDS_WITH:
                list = repository.findByEmpCodeEndingWith(empCode);
                break;
            case SearchFilters.CONTAINS:
                list = repository.findByEmpCodeContaining(empCode);
                break;
            case SearchFilters.NOT_CONTAINS:
                list = repository.findByEmpCodeNotContaining(empCode);
                break;
            case SearchFilters.EQUALS:
                list = repository.findByEmpCode(empCode);
                break;
            case SearchFilters.NOT_EQUALS:
                list = repository.findByEmpCodeNot(empCode);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return list;
    }
}
