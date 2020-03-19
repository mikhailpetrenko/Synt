package com.syntax.class11;

public class More2dArray {

	public static void main(String[] args) {
		String[][] world = {
				{"Mexico", "USA", "Canada"},
				{"Brazil", "Argentina", "Uruguay"},
				{"France", "Spain", "Germany"},
				{"China", "Japan", "Korea"},
				{"Morrocco", "SAR", "Mali"}
		};
		String i=null;
		for (String[] conts:world) {
			for (String count:conts) {
				// System.out.println(count);
				i=count;
				System.out.println(i);
			}
			}
		System.out.println("There are "+i.length()+" countries at all");
		}

	}


