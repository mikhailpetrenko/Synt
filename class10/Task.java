package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		String[] ans = {"Cat", "Dog", "Deer", "Tiger", "Lion", "Horse"};
		for (int i=0;i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
		for (String an:ans) {
			System.out.print(an+" ");
		}
		System.out.println();
		System.out.println("------------");
		int sum=0;
		int[] nums = {5, 6, 1, 2, 3};
		for (int a=0;a<nums.length;a++) {
			sum=sum+nums[a];
		}System.out.println(sum);
		
		System.out.println("------------");
		
		String[] counts = {"USA", "France", "Russia", "Mexico", "Ukraine", "Belarus"};
		String cap=null;
		for (int b=0;b<counts.length;b++) {
			if (counts[b].equals("USA")) {
				cap = "Washington DC";				
			}else if (counts[b].equals("France")) {
				cap = "Paris";
			}else if (counts[b].equals("Russia")) {
				cap = "Moscow";
			}else if (counts[b].equals("Mexico")) {
				cap = "Mexico City";				
			}else if (counts[b].equals("Ukraine")) {
				cap = "Kyiv";				
			}else if (counts[b].equals("Belarus")) {
				cap = "Minsk";				
			}
			System.out.println("The capital of "+counts[b]+" is "+cap);

	}
System.out.println("--------------------2nd way---------------------");
		
		String[] cons = {"USA", "France", "Russia", "Mexico", "Ukraine", "Belarus"};
		String capit=null;
		
		for (String co:cons) {
			if (co.equals("USA")) {
				capit = "Washington DC";			
			}else if (co.equals("France")) {
				capit = "Paris";
			}else if (co.equals("Russia")) {
				capit = "Moscow";
			}else if (co.equals("Mexico")) {
				capit = "Mexico City";				
			}else if (co.equals("Ukraine")) {
				capit = "Kyiv";				
			}else if (co.equals("Belarus")) {
				capit = "Minsk";				
			}
			System.out.println("The capital of "+co+" is "+capit);
}}}
