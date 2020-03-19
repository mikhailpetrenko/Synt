package com.syntax.class10;

public class trial {

	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		int first=0;
		int second=0;
		int third=0;
		int fourth=0;
			for (int b=0;b<a.length;b++) {
			  for (int c=0;(b==0 && c<a[b].length);c++) {
				  first = first+a[b][c];}
			  for (int d=0;(b==1 && d<a[b].length);d++) {
				  second = second+a[b][d];}
			  for (int e=0;(b==2 && e<a[b].length);e++) {
				  third = third+a[b][e];}
			  for (int f=0;(b==3 && f<a[b].length);f++) {
				  fourth = fourth+a[b][f];}
			
			}System.out.println(first);
			System.out.println(second);
			System.out.println(third);
			System.out.println(fourth);

}
	}

