package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee empregado = new Employee();
		System.out.print("Name: ");
		empregado.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		empregado.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		empregado.tax = sc.nextDouble();
		
		empregado.NetSalary();
		System.out.println(empregado);
		System.out.println("Witch Percentage to Increase salary: ");
		double percent = sc.nextDouble();
		empregado.increaseSalary(percent);
		System.out.println(empregado);
		
		
		sc.close();

	}

}
