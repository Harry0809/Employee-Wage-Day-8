package com.employee.wage;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to employee wage computation");

		int wagePerHour = 20;
		int numberOfHourPerFullDay = 8;
		int numberOfHourPerPartDay = 4;
		int wageOfTheDay = 0;

		int employeeAttendance = (int) (Math.floor(Math.random() * 10)) % 2;
		switch (employeeAttendance) {

		case 1:
			System.out.println("Emoloyee is working full day");
			wageOfTheDay = numberOfHourPerFullDay * wagePerHour;
			System.out.println("full day wage of the employee is" + " " + wageOfTheDay);
			break;

		case 2:
			System.out.println("Employee is working part day");
			wageOfTheDay = numberOfHourPerPartDay * wagePerHour;
			System.out.println("Part time  wage of employee is" + " " + wageOfTheDay);
			break;

		default:
			System.out.println("employee is not working today");
			break;

		}

	}
}