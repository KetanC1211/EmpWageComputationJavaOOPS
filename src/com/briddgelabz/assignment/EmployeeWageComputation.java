package com.briddgelabz.assignment;

public class EmployeeWageComputation {
	//Constants
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	//Instance Variable
	private String companyName;
	private int empRatePerHour;
	private int numOfWorkingDays;
	private int maxHoursPerMonth;
	private int totalEmpWage;

	public EmployeeWageComputation(String companyName, int empRatePerHour , int numOfWorkingDays, int maxHoursPerMonth){
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	} 
	
	public int computeEmpWage() {
		int empHour = 0, totalEmpHours = 0, totalWorkingDays = 0;
		while(totalEmpHours <=maxHoursPerMonth && totalWorkingDays< numOfWorkingDays){ 
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			switch(empCheck)	{
				case IS_FULL_TIME:
					empHour = 8;
					break;
				case IS_PART_TIME:
					empHour = 4;
					break;
				default:
					empHour =0;
			}
			totalEmpHours = totalEmpHours + empHour;
			totalWorkingDays++;
			System.out.println("Day : "+totalWorkingDays+" Emp Hours: "+empHour);
		}
		totalEmpWage = totalEmpHours * empRatePerHour;
		//System.out.println("Total Emp Wage for Company: "+companyName+" is:"+totalEmpWage);
		return totalEmpWage; 
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWageComputation dominos = new EmployeeWageComputation("Dominos", 15, 25, 100);
		EmployeeWageComputation pizzaHut = new EmployeeWageComputation("PizzaHut", 20, 20, 100);
		dominos.computeEmpWage();
		System.out.println("Dominos Emp salary "+dominos.totalEmpWage);//saving salary
		pizzaHut.computeEmpWage();
		System.out.println("PizzaHut Emp salary "+pizzaHut.totalEmpWage);//saving salary
		
	}
}
