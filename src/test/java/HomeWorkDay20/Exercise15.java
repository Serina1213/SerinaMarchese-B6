package HomeWorkDay20;

public class Exercise15 {
	
	public static void main (String [] args) {
		
		Exercise15 obj = new Exercise15();
		
		String result1 = obj.removeSpace("  java Training     ");
		String result2 = obj.removeSpace("        I     like     to   practice     ");
		
		System.out.println(result1);
		System.out.println(result2);
		
		
		
		
	}
    public static String removeSpace(String strOne) {
    	String result = "";
    	
    	String newstr = strOne.trim();
    	result = newstr;
    	
    	
    	
    	return result;
    	
    	
    }
}
