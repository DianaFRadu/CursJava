package TemeC6C7C8;

import java.util.Scanner;

public class H7Ex1 {

	public static void main(String[] args) {
        String[] luni = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
        Scanner input = new Scanner(System.in);
        int nr_luna;
        
        do {
            System.out.println("Introduceti un numar intre 1 si 12: ");
            nr_luna = input.nextInt();
            if(nr_luna < 1 || nr_luna > 12) {
                System.out.println("Numarul introdus este invalid.");
            }
        } while(nr_luna < 1 || nr_luna > 12);
        System.out.println("Luna corespunzatoare numarului introdus este " + luni[nr_luna-1]);
    }
}

//ceva nu e in regula. Ma lasa sa introduc doar un numar, apoi daca incerc sa intorduc altul nu il scrie. Trebuie sa ii dau iar RUN