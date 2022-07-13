package com.briddgelabz.day8;

public class EmployeeWageComputation {
	EmployeeWageComputation(int x){
		int empRatePerHrs=20;
		int empHrs=8;
		int salary;
		if (x==1) {
			salary = empRatePerHrs*empHrs;
			System.out.println("Employee Daily Wage is "+salary);
		}
		else {
			System.out.println("Employee Daily Wage is 0");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int empCheck = (int)Math.floor(Math.random()*10%2);
		EmployeeWageComputation obj = new EmployeeWageComputation(empCheck);
	}
}
