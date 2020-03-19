package com.syntax.class11;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		boolean a=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your login");
		String login = sc.next();
		System.out.println("Please enter your password");
		String pass = sc.next();
		
		
		while (login.isEmpty() || pass.isEmpty()) {
			System.out.println("Usermane and Password can not be empty");
			System.out.println("Please enter your login");
			login = sc.next();
			System.out.println("Please enter your password");
			pass = sc.next();
		}
		
		if (!a) {
			System.out.println("Please enter your password");
			pass = sc.next();
			
			if (pass.length()<8) {
				System.out.println("Password is too short");
				}
			if (pass.contains(login)) {
				System.out.println("Password cannot contain username");
				}
			System.out.println("Please confirm your password");
			String pass1 = sc.next();
			if (!pass1.equals(pass)) {
				System.out.println("Passwords do not match");
								}
			a=true;
		}System.out.println("Your username and password has been created");
		
	}
}