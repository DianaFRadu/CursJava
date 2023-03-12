package Curs5;

public class H5EX1Fibonacci {

	public static void main(String[] args) {
		RezCuFor();
	
	}
		public static void RezCuFor() {
			int number = 9, firstnum = 0, secondnum = 1;
			
	
			System.out.println("Seria Fibonacci pentru" + number + "numere");
			
			for (int i = 0; i <= number; i++) {
				System.out.println(firstnum + "," );

				// nu stiu cum sa fac ca sa calculeze primul nr cu al doilea, apoi suma cu al treilea si tot asa
				//as fi facut aici o alta variabila de ex int serie = firstnum + secondnum
				
			}
			
		

	}
		
		public static void RezCuWhile() {
			int number = 9, firstnum = 0, secondnum = 1;
			System.out.println("Seria Fibonacci pentru" + number + "numere");
			
			while(i <= number) {
				System.out.println(firstnum + "," );
				//acelasi com ca sus :(
				
				i ++;
			}
		}

}
