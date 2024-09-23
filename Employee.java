package com.generation;

public abstract class Employee {

	private String FirtsName;
	private String LastName;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationDaysTaken;
	private double salary;
	private int yearsWorked;

	public Employee(String firtsName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		this.FirtsName = firtsName;
		this.LastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	} // constructor

	public int timeToRetirement() {
		// time to retirement = min(60 - age, 40 - yearsWorked)
		int TimeRetirement;
		TimeRetirement = Math.min((60-this.age),(40-this.yearsWorked));
		return TimeRetirement;
	}

	public double vacationTimeLeft() {
		// vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
		double VacationTimeLeftVar;
		double a = (double)this.daysWorked/360;
		int b = 30 - this.vacationDaysTaken;
		VacationTimeLeftVar =(double) a*b;
		return VacationTimeLeftVar;
	}

	public int calculateBonus() {
		// bonus = 2.2*salary
		int Bonus;
		Bonus= (int) ((2.2)*salary);
		return Bonus;
	}//calculateBonus


	public String getFirtsName() {
		return FirtsName;
	}//getFirtsName


	public void setFirtsName(String firtsName) {
		FirtsName = firtsName;
	}//setFirtsName


	public String getLastName() {
		return LastName;
	}//getLastName


	public void setLastName(String lastName) {
		LastName = lastName;
	}//setLastName


	public int getRegistration() {
		return registration;
	}//getRegistration


	public void setRegistration(int registration) {
		this.registration = registration;
	}//setRegistration


	public int getAge() {
		return age;
	}//getAge


	public void setAge(int age) {
		this.age = age;
	}//getAge


	public int getDaysWorked() {
		return daysWorked;
	}//getDaysWorked


	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}//setDaysWorked


	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}//getVacationDaysTaken


	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}//setVacationDaysTaken


	public double getSalary() {
		return salary;
	}//getSalary


	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary


	public int getYearsWorked() {
		return yearsWorked;
	}//getYearsWorked


	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}//setYearsWorked


	@Override
	public String toString() {
		return "Employee [FirtsName=" + FirtsName + ", LastName=" + LastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	}//toString
}
