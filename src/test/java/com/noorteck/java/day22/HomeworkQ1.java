package com.noorteck.java.day22;

public class HomeworkQ1 {
	
	public static void main (String [] args) {
		
		HomeworkQ1 obj = new HomeworkQ1();
		
		String r1 = obj.toUpper("Pro");
		String r2 = obj.toUpper("java");
		String r3 = obj.toUpper(null);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
		
	}
      String toUpper(String strOne) {
    	String result = "";
    
       
    	 if (strOne!=null) {
    		result = strOne.toUpperCase();
    		 
    		 }else {
    		 result = null;
    	 }
      
    	    
    	    
    	   
       
    	   

	  return result;
}}
