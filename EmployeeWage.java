package com.employee.wage;

public class EmployeeWage {

	private String company;
	private int wagePerhour;
	private int working_DayperMonth = 0;
	private int fullDayhour;
	private int totalEmpWage;

	public EmployeeWage(String company, int wagePerhour, int working_DayperMonth, int fullDayhour) {
		this.company = company;
		this.wagePerhour = wagePerhour;
		this.working_DayperMonth = working_DayperMonth;
		this.fullDayhour = fullDayhour;
	}

	public void computeEmpWage() {
		int totalWorkinghour = 0;
		int days = 0;
		System.out.println(company);
		while (totalWorkinghour <= 100 && days < 20) {
			days = days + 1;
			int attendance = (int) (Math.random() * 10) % 2;
			switch (attendance) {

			case 0:
				calculateEmployeeWage();
				break;

			case 1:
				int partTimehour = fullDayhour / 2;
				int partTimeWage = partTimehour * wagePerhour * working_DayperMonth;
				System.out.println("Wage Per Hour\t:" + wagePerhour + "\nWorking Days \t:" + working_DayperMonth
						+ "\nWorking Hour \t:" + partTimehour + "\nPartime Employee wage is : " + partTimeWage);

				break;

			default:
				System.out.println("Employee Wage = 0");
			}
			totalWorkinghour = totalWorkinghour + 1;
			System.out.println();
		}
		int totalEmpWage = totalWorkinghour * wagePerhour * working_DayperMonth;
		System.out.println("Total Full time Employee Wage for " + company + " is:" + totalEmpWage);
	}

	public void calculateEmployeeWage() {
		int dailyWage = wagePerhour * fullDayhour * working_DayperMonth;
		System.out.println("Wage Per Hour\t:" + wagePerhour + "\nWorking Days \t:" + working_DayperMonth
				+ "\nWorking Hour \t:" + fullDayhour + "\nEmployee wage is : " + dailyWage);
	}

	public static void main(String[] args) {

		System.out.println(" Welcome to Employee Wage Computation ");
		EmployeeWage dmart = new EmployeeWage("Dmart", 200, 2, 20);
		dmart.computeEmpWage();
		EmployeeWage reliance = new EmployeeWage("Reliance", 100, 4, 20);
		reliance.computeEmpWage();
	}

}
