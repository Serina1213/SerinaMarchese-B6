package com.noorteck.java.day22;

public class HomeworkQ5 {
	
	public static void main (String [] args) {
		
		HomeworkQ5 obj = new HomeworkQ5();
		
		String result1 = obj.removeSpace(null);
		String result2 = obj.removeSpace("  java Training     ");
		String result3 = obj.removeSpace("        I     like     to   practice     ");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		
		
	}
    public static String removeSpace(String strOne) {
    	String result = "";
    	
    	if(strOne!=null) {
    		result= strOne.trim();
    		
    	}else {
    		result = null;
    	}
    	
    	
    	
    	
    	
    	return result;
    	
    	
    }
}



