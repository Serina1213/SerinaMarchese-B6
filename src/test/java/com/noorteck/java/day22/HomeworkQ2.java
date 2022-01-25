package com.noorteck.java.day22;

public class HomeworkQ2 {
	
	public static void main (String [] args) {
		
		HomeworkQ2 obj = new HomeworkQ2();
		
		
		boolean result1 =obj.isEndWith ("java training", "ing");
		boolean result2 = obj.isEndWith ("java training", "ja");
		boolean result3 = obj.isEndWith ("java training", "java");
		boolean result4 = obj.isEndWith ("java training", "train");
		boolean result5 = obj.isEndWith(null, "java");
		boolean result6 = obj.isEndWith(null,null);
		boolean result7 = obj.isEndWith("aaabc", "abc");
		boolean result8 = obj.isEndWith("abc", null);
		
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		
		
	}
	
    boolean isEndWith(String strOne,String StrTwo) {
    	boolean result = false;
    	
    	       if(strOne!=null && StrTwo != null) {
    		   result=strOne.endsWith(StrTwo);
    		
    }
    	       
    			
         return result;
}

}  