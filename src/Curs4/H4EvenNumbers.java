package Curs4;

import java.util.Scanner;

public class H4EvenNumbers {

	public static void main(String[] args) {
		
		/*/aici am pus %2 din exemplul ParSiImpar din curs 3, insa nu stiu exact de ce %2 e in regula aici. 
		Pentru ca %2 == 0, din ce am inteles in cursul trecut inseamna verifica daca %2 este echivalent cu 0. Eu am gandit ca face impartirea la 2 si ne afiseaza nr care se impart exact la 2
		*/
		for(int i=0; i<20; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			

		}
	}

}
