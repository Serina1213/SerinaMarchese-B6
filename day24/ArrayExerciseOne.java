package com.noorteck.java.day24;

public class ArrayExerciseOne {
	
	public static void main (String [] args) {
		
		int n1[] = {6,1,2,3};
		int n2[] = {13,6,1,2,3};
		int n3[] = {0,1,4,3,6};
		int n4[] = {0,6,0};
		
		boolean r1 = isFirstLast(n1);
		boolean r2 = isFirstLast(n2);
		boolean r3 = isFirstLast(n3);
		boolean r4 = isFirstLast(n4);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
		
		
	}
	
	  static boolean isFirstLast(int [] number) {
		  boolean result = false;
		  
		  int firstElement = number[0]; 
		  
		  int lastElement = number [number.length-1];
		  
		  if(firstElement == 6  || lastElement == 6) {
			  result = true;
			  
		  }
		
		
		

        return result;
	}
        
}
