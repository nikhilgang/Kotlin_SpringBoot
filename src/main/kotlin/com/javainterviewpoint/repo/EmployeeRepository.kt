package com.javainterviewpoint.repo

import com.javainterviewpoint.bean.Employee
import org.springframework.data.repository.CrudRepository

interface EmployeeRepository : CrudRepository<Employee, Long>
{

}