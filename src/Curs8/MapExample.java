package Curs8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		/*Presupunem ca am un test automat care imi citeste numele produselor
		 * Vreau sa fac o sortare dupa Fruits And Veg.
		 * Eu am o singura valoare per produs, iar val care ma intereseaza este numele, asa ca le pun pe toate intr un set sau intr un array list
		 * Vreau sa iau pt fiecare profus pretul --> nu mai am un singur element ci 2, produs si pretul produsului, deci nu mai pot pune intr un set
		 * Trebuie sa asociez Coconat si 19$ -- unde cheia este ceva ce definim noi 
		 * De retinut ca daca avem 3 elemente pe care vreau sa le asociez, nu le pute pune intr o map, ex: Conocat, 19$ si fresh --> in cazul asta ma duc catre un json file:
		 * { produs:
		 * 			pret: 4
		 * 			descriere: coconut
		 * 			stock: true --> deci e un fisier in afara Java si de care ma folosesc
		 */

	}
	
		Map<String, String> map = new HashMap<>();
		
	
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("PM", "ProductManager");
		
		
		for(String key : map.keySet()) {
			System.out.println(key);
			
		}
		
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println(map);
		
		System.out.println(map.get("T"));
		System.out.println(map.get("Tester"));//nu merge pt ca parametrul trebuie sa fie key
		
		System.out.println(map.containsValue("Support"));
		System.out.println(map.containsKey("D"));
		
	}
