package com.noorteck.java.day24;

public class ArrayExerciseFour {
	
	public static void main (String [] args) {
		
	ArrayExerciseFour obj = new ArrayExerciseFour();
	
	int n1[] = {6,1,2,3};
	
	int result [] = obj.getFirstLast(n1);
	
	System.out.println("[  " + result [0] + ", "+ result[1]  + " ] ");
	
	}	
		
		
		int [] getFirstLast(int [] number){
			
			int [] result = new int [2];
			
			int firstElement = number [0];
			
			int lastElement = number[number.length-1];
			
			result [0] = firstElement;
			
			result [1] = lastElement;
			
					
					
	       return result;
			
			
		}
	}


