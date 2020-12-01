package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double porcenta) {
		grossSalary += grossSalary * porcenta / 100.0;
	}
		
	
	public String toString() {
		return "Employee: " 
				+ name 
				+ ", $" 
				+ String.format("%.2f%n",NetSalary()); 
	}
	


}
