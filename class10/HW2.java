package com.syntax.class10;

public class HW2 {

	public static void main(String[] args) {
		String[][] grades= {
				{"Michael", "Bob", "Richard", "Leo", "Nikolay", "John", "Emma"},
				{"D", "B","C","D","A","C","A"}
				};
		for (int a=0;a<(grades[1].length);a++) {
			if (grades[1][a].equals("A") || grades[1][a].equals("B")) {
			System.out.println(grades[0][a]);
			}
		} 
	}}