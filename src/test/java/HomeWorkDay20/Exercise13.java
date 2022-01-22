package HomeWorkDay20;

public class Exercise13 {
	
	public static void main (String [] args) {
		
		Exercise13 obj = new Exercise13();
		
		
		boolean result1 =obj.isStartWith ("java training", "ing");
		boolean result2 = obj.isStartWith ("java training", "ja");
		boolean result3 = obj.isStartWith ("java training", "java");
		boolean result4 = obj.isStartWith ("java training", "train");
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
		
		
		
	}
    boolean isStartWith(String strOne,String StrTwo) {
    	boolean result = false;
    	
    	if (strOne.startsWith(StrTwo)) {
    		result = true;
    	}else {
    		result = false;
    	}
    	
    	 return result;
}
}