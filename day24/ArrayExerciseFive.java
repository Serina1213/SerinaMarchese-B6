package com.noorteck.java.day24;

public class ArrayExerciseFive {
	
	public static void main (String [] args) {
		
		ArrayExerciseFive obj = new ArrayExerciseFive();
		
		int n1 [] = {6,1,2,3};
		int n2 [] = {13,3};
		int n3 [] = {0,4,4};
		int n4 [] = {6};
		
		int result1 []  = obj.getDouble(n1);
		
		for(int i = 0; i< result1.length; i ++ ) {
			
			System.out.println(result1[i]);
			
		}	
		
		}	
		private int [] getDouble(int [] number) {
			int [] result = new int [number.length*2];
			
			int lastIndex = result.length-1;
			int lastElement = number[number.length-1];
			
			
		    result[lastIndex] = lastElement;
		
		
		
			
			
			return result;
		}
		
		
	}


