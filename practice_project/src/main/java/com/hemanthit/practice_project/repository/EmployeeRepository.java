package com.hemanthit.practice_project.repository;

import com.hemanthit.practice_project.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //------------------- searchFilters-------------------
    public List<Employee> findByEmpCodeStartingWith(String empCode);
    public List<Employee> findByEmpCodeEndingWith(String empCode);
    public List<Employee> findByEmpCodeContaining(String empCode);
    public List<Employee> findByEmpCodeNotContaining(String empCode);
    public List<Employee> findByEmpCode(String empCode);
    public List<Employee> findByEmpCodeNot(String empCode);
}
