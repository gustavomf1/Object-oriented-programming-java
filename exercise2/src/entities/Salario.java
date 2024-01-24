package entities;

public class Salario {
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double impost() {
		return grossSalary -= tax;
	}
	
	public void update() {
		
		grossSalary += grossSalary * (percentage / 100);
		
		System.out.printf("Updated data: %s, %.2f", name, grossSalary);
	}
}
