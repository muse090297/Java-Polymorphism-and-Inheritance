package com.generation;
public class SalesRep extends Employee {

	private double salesMade;

	public SalesRep(String firtsName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firtsName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	} //Constructor
	
	public double calculateComissionRep(){
	      // comission = 0.1 * salesMade
		double comission;
		comission = 0.1 * salesMade;
		return comission;
	   }//calculateComission

	public double getSalesMade() {
		return salesMade;
	}//getSalesMade

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}//setSalesMade

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", calculateComission()=" + calculateComissionRep()
				+ ", timeToRetirement()=" + timeToRetirement() + ", vacationTimeLeft()=" + vacationTimeLeft()
				+ ", calculateBonus()=" + calculateBonus() + ", getFirtsName()=" + getFirtsName() + ", getLastName()="
				+ getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + "]";
	}//toString

	

	

	
	
}// Clase Representante de ventas
