package com.kaviya.assignment.utilities;

import com.kaviya.assignment.employee.Employee;

	public class EmployeeUtilities {

		 public static void increaseSalary(Employee employee, double percentage) {
	

		        employee.increaseSalary(percentage);

		        System.out.println("After Salary Increase:");
		        employee.displayEmployeeInfo();
		        System.out.println("---------------------------------");
		    }
		 public static void printEmployeeDetails(Employee employee) {
		        employee.displayEmployeeInfo();
		    }
	}