package com.javainterviewpoint.controller

import com.javainterviewpoint.service.EmployeeServiceImpl
import com.javainterviewpoint.bean.Employee
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employee")
class EmployeeController(val employeeService: EmployeeServiceImpl)
{
    @PostMapping("/create")
    fun saveEmployee(@RequestBody employee: Employee): Employee
    {
        return employeeService.saveEmployee(employee)
    }

    @GetMapping("/{id}")
    fun getEmployee(@PathVariable id: Long): Employee
    {
        return employeeService.getEmployee(id)
    }

    @GetMapping("/getAll")
    fun getAllEmployees(): MutableIterable<Employee>
    {
        return employeeService.getAllEmployees()
    }

    @PutMapping("/update")
    fun updateEmployee(@RequestBody employee: Employee): String
    {
        return employeeService.updateEmployee(employee)

    }

    @DeleteMapping("/delete/{id}")
    fun deleteEmployee(@PathVariable id: Long):String
    {
        return employeeService.deleteEmployee(id)
    }
}