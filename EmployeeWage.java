package com.employee.wage;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation program");

		// created object for company bigbazar
		EmployeeWage bigBazar = new EmployeeWage("BigBazar", 20, 2, 10);
		System.out.println("Total Employee Wage for Company " + bigBazar.company + " is: " + bigBazar.computeEmpWage());
		// created object for company realince
		EmployeeWage tata = new EmployeeWage("tata", 10, 2, 20);
		System.out.println("Total Employee Wage for Company " + tata.company + " is: " + tata.computeEmpWage());
	}

	// constants
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int maxHoursPerMonth;
	private final int numOfWorkingDays;

	public EmployeeWage(String company, int empRatePerHour, int maxHoursPerMonth, int numOfWorkingDays) {
		// constructor
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;
	}

	private int computeEmpWage()
	// decleartion
	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// check the condition that max working hrs per month and no.of workong days

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int attendance = (int) (Math.random() * 3);
			switch (attendance) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs = (totalEmpHrs + empHrs);
			System.out.println("Days= " + totalWorkingDays + " Emp Hr: " + empHrs);
		}

		return totalEmpHrs * empRatePerHour;

	}

}