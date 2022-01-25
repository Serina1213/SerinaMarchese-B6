package com.noorteck.java.day22;

public class HomeworkQ6 {

	public static void main (String [] args) {
		
		HomeworkQ6 obj = new HomeworkQ6();
		
		boolean r1 = obj.endsWithNG(null);
		boolean r2 = obj.endsWithNG("I like to practice");
		boolean r3 = obj.endsWithNG("Everyone is practicing");
		boolean r4 = obj.endsWithNG("I am studying");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
		
	}
	public boolean endsWithNG(String strOne) {
		boolean result = false;
		
		if (strOne!=null) {
			
			result = strOne.endsWith("ng");
		}
		
		
		return result;
		
}
	
    
}