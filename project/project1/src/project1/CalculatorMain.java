package project1;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c= new Calculator();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double num1=sc.nextDouble();

		System.out.println("Enter second number: ");
		double num2=sc.nextDouble();
		
		System.out.println("chooes operation (+,-,*,/)");
		char operator=sc.next().charAt(0);
		
		double result=0;
		
		switch(operator) {
			case '+':
				result=c.add(num1,num2);
				break;
			
			case '-':
				result=c.subtract(num1,num2);
				break;
			
			case '*':
				result=c.mul(num1,num2);
				break;
				
			case '/':
				result=c.div(num1,num2);
				break;
			
			default:
				System.out.println();
				sc.close();
		}
		System.out.println("Result: "+result);
		sc.close();
	}
}

