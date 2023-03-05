package Curs4;

import java.util.Scanner;

public class H4SumOfTheNumbers {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int sum = 0; 
		 
        for (int i = 0; i < 10; i++) { 
            System.out.print("Please enter number1"); 
            int number1 = scan.nextInt(); 
            sum += number1; 
            System.out.print("Please enter number2"); 
            int number2 = scan.nextInt(); 
            sum += number2;
            System.out.print("Please enter number3"); 
            int number3 = scan.nextInt(); 
            sum += number3; 
            System.out.print("Please enter number4"); 
            int number4 = scan.nextInt(); 
            sum += number4;
            System.out.print("Please enter number5"); 
            int number5 = scan.nextInt(); 
            sum += number5; 
            System.out.print("Please enter number6"); 
            int number6 = scan.nextInt(); 
            sum += number6;
            System.out.print("Please enter number7"); 
            int number7 = scan.nextInt(); 
            sum += number7; 
            System.out.print("Please enter number8"); 
            int number8 = scan.nextInt(); 
            sum += number8;
            System.out.print("Please enter number9"); 
            int number9 = scan.nextInt(); 
            sum += number9; 
            System.out.print("Please enter number10"); 
            int number10 = scan.nextInt(); 
            sum += number10;
            break;
            
        } 
 //nu stiu cum sa fac incat sa introduc numarul de la tastatura pe randul de jos, nu in continuarea textului "Please enter number1"
        System.out.println("The sum of the numbers is: " + sum); 
    } 
}
