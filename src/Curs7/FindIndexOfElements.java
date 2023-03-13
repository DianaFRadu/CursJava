package Curs7;

public class FindIndexOfElements {

	/*
	 * Avem un Arrau de tip Integer
	 * Vreau sa printam care este indexul unui anumit element
	 * Ex: Index pentru elementul 6 este 3
	 * rezolvare cu for si rezolvare cu for each
	 */
	
	static int[] number = { 3, 4, 5, 6, 8, 9, 6};
	
	public static void main(String[] args) {

		rezolvareCuFor();
		
		
	}

	
	public static void rezolvareCuFor() {
		
		for(int i = 0; i<number.length; i++) {
			
			if(number[i] == 6) {
				System.out.println("index pentru elementul 6 este " + i);
			}
		}
	}
	
	
	public static void rezolvareCuForEach() {
		
		//static int[] number = { 3, 4, 5, 6, 8, 9};
		
		int i= 0;
		
		for(int element : number) {
			
			if(element == 6) {
				System.out.println("index pentru elementul 6 este " + i);

			}
			i++;
		}
		
	}
	
	
}