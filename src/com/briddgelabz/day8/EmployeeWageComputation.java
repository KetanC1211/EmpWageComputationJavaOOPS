package com.briddgelabz.day8;

public class EmployeeWageComputation {
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	EmployeeWageComputation(int x){
		int empRatePerHrs=20;
		int salary;
		int empHrs;
		switch(x)	{
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs =0;
		}
		salary = empRatePerHrs*empHrs;
		System.out.println("Daily Wage is "+ salary);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int empCheck = (int)Math.floor(Math.random()*10%3);
		EmployeeWageComputation obj = new EmployeeWageComputation(empCheck);
	}
}
