package com.syntax.class12;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		/*
		 * String a = "Sunday"; for (int b = a.length()-1; b>=0;b--) {
		 * System.out.print(a.charAt(b)); }
		 */
		/*
		 * String a = "StringB23Sing"; if (!a.isEmpty()) { if (a.length()%2!=0 &&
		 * a.length()>=3) { System.out.println(a.charAt(a.length()/2));
		 * 
		 * } }
		 */
		// Find out how many alpha characters are present in a String? Find number of
		// words in string?
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String a = scan.nextLine();
		String b = a.replaceAll("[A-Za-z0-9]", ""); 
		//replacing everything except characters with "" -->(nothing)
		String c[] = a.split(" "); 
		// Dividing sentence by " "-->(Spaces)
		System.out.println("Characters in string = "+b.length());
		System.out.println("words in string = "+c.length);
		System.out.println(b);


	}

}
