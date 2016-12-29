package com.ECL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECL.Domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
