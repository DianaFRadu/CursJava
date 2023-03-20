package Curs8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//String[] array = new String[5];
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Maria");
		list.add("Ion");
		list.add("Maria");
		
		System.out.println(list.get(2));
		
		//daca imi permite sa iau, imi permite sa si adaug :
		
		list.add(1, "George"); //l a adaugat pe George pe index 1 si l a dus pe George pe index 2
		
		for (String nume : list) {
			System.out.println(nume);
		}
		list.remove(0); //o sa o stearga pe ioana
		list.remove("Ioana"); // acelasi lucru, doar ca nu ne folosim de index ci direct de variabila
		
		System.out.println("-------------");
		
		for (String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println(list.contains("Maria")); //vreau sa vad daca val asta exista in codul meu
		
		//sau String text = "Maria";  
		//sysout(list.contains(text));
		
		list.set(0,  "Oana");
	
		System.out.println("-------------------------");
		for(String nume : list) {
			System.out.println(nume);
		}
		
		list.add("Ioana");
		list.add("Marian");
		
		System.out.println("------------BEFORE-------------");

		for(String nume : list) {
			System.out.println(nume);
		}
		
	/*	Oana -> 0
		Ion -> 1
		Maria -> 2 (inclus)
		Ioana -> 3
		Marian -> 4 (exclus)
	*/	
		list.subList(2, 4).clear();
		
		System.out.println("------------After-------------");

		for(String nume : list) {
			System.out.println(nume);
		}
		
		
	}
	

}
