package homeWorkDay19;

public class ExerciseFour {
	
	public static void main (String [] args) {
		
		ExerciseFour obj = new ExerciseFour();
		
		String resultOne = obj.toUpper("Pro");
		String resultTwo = obj.toUpper("java");
		String resultThree = obj. toUpper("java training");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		
	}
      String toUpper(String strOne) {
    	  
    	  String result = "";
    	  
    	  String newstr = strOne.toUpperCase();
    	  result = newstr;
    	  
    	  return result;
    	  
      }
      
}
