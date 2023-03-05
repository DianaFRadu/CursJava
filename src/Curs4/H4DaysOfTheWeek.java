package Curs4;

import java.util.Scanner;

public class H4DaysOfTheWeek {

	int num;

	//nu imi dau seama cum sa o fac incat sa nu repet cod, nu imi iese ca exemplul facut la curs. O sa mai incerc o data cand o sa fac tema de la cursul 5
	
	public void AskTheUser () {
		System.out.println("Write a number");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
	}
		public void ZileleSapt (){
			
		switch(num) {
		case "1":
			System.out.println("Luni");
			break;
		case "2":
			System.out.println("Marti");
			break;
		case "3":
			System.out.println("Miercuri");
			break;
		case "4":
			System.out.println("Joi");
			break;
		case "5":
			System.out.println("Vineri");
			break;
		case "6":
			System.out.println("Sambata");
			break;
		case "7":
			System.out.println("Duminica");
			break;
		}
		
	

	}

}
