package com.employee.wage;

public class EmployeeWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWage() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(String company, int wagePerhour, int working_DayperMonth, int fullDayhour) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, wagePerhour, working_DayperMonth, fullDayhour);
		numOfCompany++;
	}

	private void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].settotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int totalWorkinghour = 0;
		int days = 0;
		int empHrs = 0;
		while (totalWorkinghour <= companyEmpWage.wagePerhour && days < companyEmpWage.working_DayperMonth) {
			days = days + 1;
			int attendance = (int) (Math.random() * 10) % 2;
			switch (attendance) {

			case IS_PART_TIME:
				empHrs = 4;
				break;

			case IS_FULL_TIME:
				empHrs = 8;
				break;

			default:
				empHrs = 0;
			}
			totalWorkinghour = totalWorkinghour + empHrs;
			System.out.println("Day : " + days + " Emp hrs :" + empHrs);
		}
		return totalWorkinghour * companyEmpWage.working_DayperMonth;
	}

	public static void main(String[] args) {

		System.out.println(" Welcome to Employee Wage Computation ");
		EmployeeWage empWage = new EmployeeWage();
		empWage.addCompanyEmpWage("Reliance", 100, 4, 20);
		empWage.addCompanyEmpWage("Dmart", 200, 4, 20);
		empWage.computeEmpWage();
	}

}
