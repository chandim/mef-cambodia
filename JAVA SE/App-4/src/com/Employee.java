package com;

public class Employee { // POJO class

	private int empId;
	private String empName;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		// verify user name/passwords
		//if(empName.equals("Praveen")) { // DB
		this.salary = salary;
		//}else {
		//	return;
		//}
	}

	public void calculateSalary() {

	}

	public void display() {
		System.out.println("EMployee Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("------------------------------------");
	}

}
