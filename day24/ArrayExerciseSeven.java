package com.noorteck.java.day24;

public class ArrayExerciseSeven {
	
	public static void main (String [] args) { 
		
		int [] n1 = {88,22,6,1,2,3,88,22,44,33};
		int [] n2 = {1,2,3,22,44,33};
		int [] n3 = {88,22,6,1,8,0};
		int [] n4 = {2,3,88,22,44};
		
		int r1 = getIndexNumber(n1,3);
		int r2 = getIndexNumber(n2,12);
		int r3 = getIndexNumber(n3,22);
		int r4 = getIndexNumber(n4,44);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
		
		}
		
		public static int getIndexNumber(int [] number, int elementValue) {
			int result = -1;
			
			for (int i = 0; i < number.length; i ++) {
				
				if(number[i] == elementValue) {
					result =i;
					break;
					
				}
				
	
				
			}		
			return result;
			
			
		}
		}


