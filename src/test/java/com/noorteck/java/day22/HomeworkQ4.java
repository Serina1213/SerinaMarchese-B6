package com.noorteck.java.day22;

public class HomeworkQ4 {
	
	public static void main (String [] args) {
		String result1= getSubStr(null,2,6);
		String result2 = getSubStr("java traing",2,6);
		String result3 = getSubStr("Software Develemopment Engineer in TEST", 11,23);
		String result4= getSubStr("Software Development Engineer in TEST", 21,29);
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
		
	}
    public static String getSubStr( String str, int startingIndex, int endingIndex) {
    	String result = "";
    	
    	if (str!=null) {
        result =str.substring(startingIndex,endingIndex);
    	
        
    	}else {
    		result = null;
    	}
    	
    	
    	
    	
    	return result;
    	
    	
    }
}


