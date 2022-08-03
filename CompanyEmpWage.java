package com.employee.wage;

import java.util.Iterator;

public class CompanyEmpWage {

	public String company;
	public int wagePerhour;
	public int working_DayperMonth;
	public int fullDayhour;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int wagePerhour, int working_DayperMonth, int fullDayhour) {
		this.company = company;
		this.wagePerhour = wagePerhour;
		this.working_DayperMonth = working_DayperMonth;
		this.fullDayhour = fullDayhour;
	}

	public void settotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public String toString() {
		return "Employee Wage for Company" + company + "is: " + totalEmpWage;

	}

}