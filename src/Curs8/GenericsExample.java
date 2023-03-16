package Curs8;

public class GenericsExample {

	public static void main(String[] args) {
	
		GenericsExample obj = new GenericsExample();
		obj.printDetails(123); //aici daca aveam doar prima metoda cu string, nu puteam pune un int, asa ca am facut o pe a doua => metoda supraincarcata, nu e ok
		//asa ca ma ajut de generics
		
		obj.printDetails("Text");
		obj.printDetails('c');
		obj.printDetails(12.35);
		
	}
	
	
	//exemplu generic care functioneaza fie cu int fie cu string, cu orice data type
		public <T> void printDetails(T obj) {
		System.out.println("Obiectul meu este :" + obj);
		
	}
}

	/*
	public void printDetails(String text) {
	System.out.println("Obiectul meu este :" + text);
		
	}
	
	public void printDetails(int nr) {
		System.out.println("Obiectul meu este :" + nr);
		
	}
}
*/
