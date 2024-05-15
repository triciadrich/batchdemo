package com.example.batchdemo.Repositories;

import com.example.batchdemo.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
