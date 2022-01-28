package com.javainterviewpoint.service

import com.javainterviewpoint.bean.Employee
import com.javainterviewpoint.repo.EmployeeRepository
import com.javainterviewpoint.service.EmployeeService
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl(val employeeRepository: EmployeeRepository) : EmployeeService {
    override fun saveEmployee(employee: Employee): Employee {
        return employeeRepository.save(employee)
    }

    override fun getEmployee(id: Long): Employee {
        return employeeRepository.findOne(id)
    }

    override fun getAllEmployees(): MutableIterable<Employee> {
        return employeeRepository.findAll()
    }

    override fun updateEmployee(employee: Employee):String {
        employeeRepository.save(employee)
        return "Updated Successfully"
    }

    override fun deleteEmployee(id: Long):String {
        employeeRepository.delete(id)
        return "Deleted Successfully"
    }
}