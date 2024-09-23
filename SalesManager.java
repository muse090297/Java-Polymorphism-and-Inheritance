package com.generation;
import java.util.HashMap;

public class SalesManager extends SalesRep {

	private HashMap<Integer, SalesRep> salesTeam = new HashMap<>();

	public SalesManager(String firtsName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade,
			HashMap<Integer, SalesRep> salesTeam) {
		super(firtsName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesTeam = salesTeam;
	} // Constructor
	
	
	public double calculateComissionTeam() {
		// 0.03 * all sales made by team
		int a=salesTeam.size();	
		double TotalSalesTeam=0;
		for(int i = 1; i<=a; i++) {
			SalesRep Team = salesTeam.get(i);
			TotalSalesTeam+=Team.getSalesMade();
		}
		System.out.println("El total de ventas fue: " + TotalSalesTeam);
		return 0.03*TotalSalesTeam;
		// 0.03 * all sales made by team
	} // calculateComission

	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}//getSalesTeam

	public void setSalesTeam(Integer id, SalesRep salesRep) {
		salesTeam.putIfAbsent(id, salesRep);
	}




	@Override
	public String toString() {
		return "SalesManager [salesTeam=" + salesTeam + ", calculateComissionTeam()=" + calculateComissionTeam()
				+ ", getSalesTeam()=" + getSalesTeam() + ", calculateComissionRep()=" + calculateComissionRep()
				+ ", getSalesMade()=" + getSalesMade() + ", timeToRetirement()=" + timeToRetirement()
				+ ", vacationTimeLeft()=" + vacationTimeLeft() + ", calculateBonus()=" + calculateBonus()
				+ ", getFirtsName()=" + getFirtsName() + ", getLastName()=" + getLastName() + ", getRegistration()="
				+ getRegistration() + ", getAge()=" + getAge() + ", getDaysWorked()=" + getDaysWorked()
				+ ", getVacationDaysTaken()=" + getVacationDaysTaken() + ", getSalary()=" + getSalary()
				+ ", getYearsWorked()=" + getYearsWorked() + "]";
	}

	




	

}//SalesManager
