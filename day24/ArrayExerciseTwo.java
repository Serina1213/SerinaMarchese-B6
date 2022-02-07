package com.noorteck.java.day24;

public class ArrayExerciseTwo {
	
	public static void main (String [] args) {
		
		char l1[] = {'a','b','x','d','a','d','e','q','a'};
		char l2[] = {'x','d','a','d','e','q','a'};
		char l3[] = {'e','d','a','d','e','q','a','e'};
		char l4[] = {'a'};
		
		ArrayExerciseTwo obj = new ArrayExerciseTwo();
		
	  boolean r1 = obj.sameFirstLast(l1);
	  boolean r2 = obj.sameFirstLast (l2);
	  boolean r3 = obj.sameFirstLast (l3);
	  boolean r4 = obj.sameFirstLast (l4);
	  
	  System.out.println(r1);
	  System.out.println(r2);
	  System.out.println(r3);
	  System.out.println(r4);
	}  
	  
		
		protected boolean sameFirstLast(char[] c) {
			boolean result = false;
			
			int cLength = c.length;
			
			char firstElement = c[0];
			
			char lastElement = c[c.length -1];
			
			if (cLength > 1 && (firstElement == lastElement)) {
				result = true;
			
	
			
			
			
		}	
			return result;
			
			
		}
	}


