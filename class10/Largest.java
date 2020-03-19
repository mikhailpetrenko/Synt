package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		int largest = 0;
		int lar = 0;
		int[] nums = {200, 30, -1, 900, 56, 1000};
		for (int a=0;a<nums.length;a++) {
			for (int b=0;b<nums.length;b++) {
				if (nums[a]>nums[b]) {
					largest = nums[a];
				}else {
					largest = nums[b];
				}
				if (largest>lar) {
					lar=largest;
				}				
			}
			}System.out.println("The "+lar+" is largest");
		}


 	}

