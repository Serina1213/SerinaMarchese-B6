package homeWorkDay19;

public class ExerciseThree {
	
	public static void main (String [] args) {
		
		isEqualLength("Pro", "ALI");
		isEqualLength("java", "LearNing"); 
		isEqualLength("java training", "java");
				
		
		
	}
    public static void isEqualLength(String strOne, String strTwo) {
    	
    	if (strOne.length()==strTwo.length()) {
    		
    		String newstr = strOne.concat(strTwo);
    		
    		System.out.println(newstr);
    		System.out.println(newstr.length());
    		
    	}else if (strOne.length()> strTwo.length()) {
    		
    		String newstr= strOne.toUpperCase();
    		
    		System.out.println(newstr);
    		System.out.println(newstr.length());
    		
    	}else if (strOne.length()< strTwo.length()) {
    		
    		String newstr = strTwo.toLowerCase();
    		
    		System.out.println(newstr);
    		System.out.println(newstr.length());
    		
    		
    		
    	}
    }
}
