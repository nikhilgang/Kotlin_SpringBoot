package com.javainterviewpoint.service

import com.javainterviewpoint.bean.Employee

interface EmployeeService {


    fun saveEmployee(employee: Employee): Employee


    fun getEmployee(id: Long): Employee


    fun getAllEmployees(): MutableIterable<Employee>


    fun updateEmployee(employee: Employee):String


    fun deleteEmployee(id: Long):String
}