package com.syntax.class12;

public class replace {

	public static void main(String[] args) {
		/*
		 * String a = "What should I do to handle that stuff"; a=a.replaceAll(" ", "");
		 * System.out.println(a);
		 */
		
		
		/*
		 * String a = "What &^* should I do to 123 !@@# that stuff";
		 * a=a.replaceAll("[A-Za-z0-9]", "").replace(" ", "");
		 * System.out.println(a.length());
		 */
		
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] ar = a.split("[!.?]");
		System.out.println(ar.length);
	}

}
