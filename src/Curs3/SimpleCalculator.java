package Curs3;

import java.util.Scanner;

/**
 * Facem un calculator simplu pentru operatiile de baza : + (adunare) * (inmultire) -(scadere) /(impartire)
 * Intrebam userul primul numar 
 * Intrebam userul operatia pe care vrea sa o faca
 * Intrebam userul al doilea numar 
 * Printam rezultatul sub forma "Ex : 4 + 4 = 8"
 * 
 */

public class SimpleCalculator {

	int num1;
	int num2;
	char operation;
	
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number");
		num1 = scan.nextInt();
		System.out.println("Please enter the operation");
		operation = scan.next().charAt(0);
		System.out.println("Please enter the second number");
		num2 = scan.nextInt();
	}
	
	public void calculator() {
		if(operation == '+') {
			result = num1+num2;
			printResult();
		} else if(operation == '-');{
			result = num1-num2;
			printResult();
		}
			else if(operation == '*');{
				result = num1*num2;
				printResult();
		}else if(operation == '*');{
			result = num1/num2;
			printResult();
	}
	
	public void print result() {
		System.out.println(num1 + " " + operation + " " +num2 " = "+ result);
	}
}
}