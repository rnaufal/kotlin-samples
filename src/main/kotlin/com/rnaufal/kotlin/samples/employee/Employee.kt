package com.rnaufal.kotlin.samples.employee

/**
 * Created by rnaufal on 18/10/2017.
 */
data class Employee(val name: String, val department: String)

class Employees(private val employees: List<Employee>) {

    fun byDepartment(): Map<String, List<Employee>> {
        return employees.groupBy { it.department }
    }
}

fun List<Employee>.byDepartment(): Map<String, List<Employee>> {
    return this.groupBy { it.department }
}

fun main(args: Array<String>) {
    val mark = Employee("Mark", "Accounting")
    val john = Employee("John", "Management")
    val smith = Employee("Smith", "Administrative")
    val paul = Employee("Paul", "Accounting")

    val employees = Employees(listOf(mark, john, smith, paul))

    val newEmployees = listOf(mark, john, smith, paul)

    println(employees.byDepartment())
    println(newEmployees.byDepartment())
}