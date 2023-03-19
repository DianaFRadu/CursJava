package TemeC6C7C8;

import java.util.Scanner;

public class H6Ex5 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu punctajul obtinut: ");
        int punctaj = scanner.nextInt();

        String calificativ;
        if (punctaj >= 90) {
            calificativ = "FB";
            System.out.println("Ai primit: FoarteBine");
        } else if (punctaj >= 80) {
            calificativ = "B";
            System.out.println("Ai primit: Bine");
        } else {
            calificativ = "S";
            System.out.println("Ai primit: Suficient");
        }

    }
}
