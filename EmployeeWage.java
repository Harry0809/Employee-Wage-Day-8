package com.employee.wage;

import java.util.ArrayList;
import java.util.Iterator;

//Interface
interface ComputeEmpWage {
	public void addCompanyEmpWage(String company, int wagePerhour, int working_DayperMonth, int fullDayhour);

	public void computeEmpWage();

	public int getTotalWage(String company);
}

public class EmployeeWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private int maxhours_inMonth = 100;
	private ArrayList<CompanyEmpWage> list;

	public EmployeeWage() {
		list = new ArrayList<>();
	}

	private void addCompanyEmpWage(String company, int wagePerhour, int working_DayperMonth, int fullDayhour) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, wagePerhour, working_DayperMonth, fullDayhour);
		list.add(companyEmpWage);
	}

	private void computeEmpWage() {
		for (int i = 0; i < list.size(); i++) {
			CompanyEmpWage companyEmpWage = list.get(i);
			companyEmpWage.settotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int totalWorkinghour = 0;
		int days = 0;
		int empHrs = 0;
		int dailyEmpWage = 0;
		System.out.println();
		System.out.println(companyEmpWage.company);
		while (totalWorkinghour <= maxhours_inMonth && days < companyEmpWage.working_DayperMonth) {
			days = days + 1;
			int attendance = (int) (Math.random() * 10) % 3;
			switch (attendance) {

			case IS_PART_TIME:
				empHrs = 4;
				dailyEmpWage = companyEmpWage.wagePerhour * empHrs;
				System.out.println("Part Time Employee wages :" + "\nWages Per Hour :\t" + companyEmpWage.wagePerhour
						+ "\nWorking Days   :\t" + companyEmpWage.working_DayperMonth + "\nWorking Hour   :\t" + empHrs
						+ "\nDaily Wage of an Employee : " + dailyEmpWage);
				break;

			case IS_FULL_TIME:
				empHrs = 8;
				dailyEmpWage = companyEmpWage.wagePerhour * empHrs;
				System.out.println("Full Time Employee wages :" + "\nWages Per Hour :\t" + companyEmpWage.wagePerhour
						+ "\nWorking Days   :\t" + companyEmpWage.working_DayperMonth + "\nWorking Hour   :\t" + empHrs
						+ "\nDaily Wage of an Employee : " + dailyEmpWage);

				break;

			default:
				empHrs = 0;
				System.out.println("Employee wage is zero");
			}
			totalWorkinghour = totalWorkinghour + empHrs;
			System.out.println("");
		}
		return totalWorkinghour * companyEmpWage.wagePerhour;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation ");
		EmployeeWage empWage = new EmployeeWage();
		empWage.addCompanyEmpWage("Reliance", 100, 20, 8);
		empWage.addCompanyEmpWage("Dmart", 200, 20, 8);
		empWage.computeEmpWage();
	}

}
