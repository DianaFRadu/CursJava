package Curs1;

public class FirstClass {
	// variabila de instanta -> are nevoie de un obiect al clasei pt a fi utilizata 
	String nume = "Ioana";
	int varsta = 25;
	
	public static void main(String[] args) {
		// metoda main- este metoda principala de executie
		System.out.println("Test");
		
		FirstClass obiect = new FirstClass();
		
		// este o variabila locala
		String prenume = "Ana";
		System.out.println(prenume);
		
		System.out.println(obiect.nume);
	}

}
