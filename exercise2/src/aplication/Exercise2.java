package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Exercise2 {
	public static void main(String[] args) {
		
		Salario salario = new Salario();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name, gross salary and tax: ");
		salario.name = sc.nextLine();
		salario.grossSalary = sc.nextDouble();
		salario.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f", salario.name, salario.impost());
		
		System.out.println("Which percentage to increase salary? ");
		salario.percentage = sc.nextDouble();
		
		salario.update();
		
		sc.close();
	}
}
