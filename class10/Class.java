package com.syntax.class10;

public class Class {

	public static void main(String[] args) {
		String[] cups = {"Some", "Cup", "Don't", "Care"};
		
		for (String cup:cups) {
			if (cup.equals("Cup")) {
				System.out.println();
				System.out.println(cup+" is my favorite");
			}else {
			System.out.print(cup+" ");
			}}
		System.out.println();
		System.out.println("----------------------");
		
		for (int i=0; i<cups.length;i++) {
			System.out.print(cups[i]+" ");
		}

	}

}
