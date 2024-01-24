package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class exercise1 {
	public static void main(String[] args) {
	
		
	Retangle retangle = new Retangle();
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter rectangle width and height: ");
	retangle.altura = sc.nextDouble();
	retangle.largura = sc.nextDouble();
	
	
	System.out.printf("AREA = %.2f\n", retangle.area());
	System.out.printf("PERIMETER = %.2f\n", retangle.perimeter());
	System.out.printf("DIAGONAL = %.2f\n", retangle.diagonal());
	sc.close();
	}
}
