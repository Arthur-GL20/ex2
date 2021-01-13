package application;

import java.util.Scanner;

import entities.salary;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		salary  x = new salary();
		System.out.println("Your Name:");
		x.name = sc.nextLine();
		System.out.println("Gross Salary:");
		x.GrossSalary = sc.nextDouble();
		System.out.println("Tax:");
		x.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + x);
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		
		System.out.println("Updated data: " + x);
		
		
		sc.close();
		
	}

}
