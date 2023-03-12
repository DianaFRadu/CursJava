package Curs5;

import java.util.Scanner;

public class H5EX2Vocale {

	public static void main(String[] args) {
	ForRez();

	}
	
	public static void ForRez() {
	System.out.println("Please enter a text :");
	Scanner scan = new Scanner(System.in);
	String text =  scan.next().toUpperCase();
	
	int counter = 0;
	
	for(int i=0;i<text.length();i++ ) {
		char ch = text.charAt(i);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':	
		case 'u':	
			
			
			
		}
		
		counter ++;
		
}
	System.out.println("Vocale :" + counter);
	
	//nu imi dau seama de ce imi spune ca am doar 2 vocale
}
	
}
