package TemeC6C7C8;

import java.util.Scanner;

public class H6Ex1 {
	
		 public static void main(String[] args) {
		        String username = "TestUser";
		        String password = "1234";
		        int attempts = 3;
		        
		        Scanner scanner = new Scanner(System.in);
		        while (attempts > 0) {
		            System.out.println("Enter username:");
		            String user = scanner.next();
		            System.out.println("Enter password:");
		            String pass = scanner.next();
		            
		            if (user.equals(username) && pass.equals(password)) {
		                System.out.println("Login successful");
		                break;
		            } else {
		                System.out.println("Login error");
		                attempts --;
		            }
		        }
		        if (attempts == 0) {
		            System.out.println("Maximum attempts reached. User blocked.");
		        }
		     
		}
	}
