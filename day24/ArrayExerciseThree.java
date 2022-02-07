package com.noorteck.java.day24;

public class ArrayExerciseThree {
	
	public static void main (String [] args) {
		
		int n1 [] = {6,1,2,3};
		
		int r1 = getTotal(n1);
		
		System.out.println(r1);
		
		
		int n2 [] = {13,6,1,2,3};
		
		int r2 = getTotal(n2);
		
		System.out.println(r2);
		
		
		int n3 [] = {0,1,4,3,6};
		
		int r3 = getTotal(n3);
		
		System.out.println(r3);
		
		
	}		
		
		public static int getTotal(int [] number) {
		    int result = 0 ;
		    
			for (int i = 0; i < number.length; i ++) {
				
				result = result + number[i];
				
				
				}
			
			return result;
	}

}
