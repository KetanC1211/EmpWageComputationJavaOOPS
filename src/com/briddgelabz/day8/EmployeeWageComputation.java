package com.briddgelabz.day8;

public class EmployeeWageComputation {
	EmployeeWageComputation(int x){
		if (x==0) {
			System.out.println("Employee is Absent");
		}
		else {
			System.out.println("Employee is Present");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int empCheck = (int)Math.floor(Math.random()*10%2);
		EmployeeWageComputation obj = new EmployeeWageComputation(empCheck);
	}

}
