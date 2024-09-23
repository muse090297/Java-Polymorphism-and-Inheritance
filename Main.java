package com.generation;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		HashMap<Integer, SalesRep> salesTeam1 = new HashMap<>();
		SalesManager salesManager = new SalesManager("Esmeralda", "Santos", 15001, 27, 1004, 10, 18000, 5, 16000, salesTeam1);
		
		//firtsName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade
		SalesRep Esmeralda = new SalesRep("Esmeralda", "Santos", 15001, 27, 194, 10, 18000, 5, 16000);
		SalesRep Sofia = new SalesRep("Sofia", "Hernandez", 15002, 22, 50, 2, 14000, 0, 2500);
		SalesRep Braulio = new SalesRep("Braulio", "Baeza", 15003, 31, 104, 18, 21000, 7, 63000);
		SalesRep Antonio = new SalesRep("Antonio", "Fernandez", 15004, 38, 233, 16, 24000, 10, 73400);
	
		/*System.out.println(Sofia);
		System.out.println(Esmeralda);
		System.out.println(Braulio);
		System.out.println(Antonio);*/
		
		//timeToRetirement
		System.out.println("El tiempo para que" + Antonio.getFirtsName() + " se pueda retirar es: " + Antonio.timeToRetirement() + " años");
		
		//vacationTimeLeft
		System.out.println( Sofia.getFirtsName() + " tienes " + Esmeralda.vacationTimeLeft() + " dias restantes de vacaciones");
		
		//calculateComissionRep
		System.out.println("La comision de: " + Braulio.getFirtsName() + " es " + Braulio.calculateComissionRep());
		
		//CalculateBonus
		System.out.println("El bonus de " + Antonio.getFirtsName() + " es " +  Antonio.calculateBonus());
		
		//Agregamos los SalesRep a SalesManager
		salesManager.setSalesTeam(1, Esmeralda);
		salesManager.setSalesTeam(2, Sofia);
		
		System.out.println("La comision del equipo es: " + salesManager.calculateComissionTeam());
	}
}
