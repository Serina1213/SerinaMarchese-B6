package homeWorkDay19;

public class ExerciseSeven {
	
	public static void main(String [] args) {
		
		ExerciseSeven obj = new ExerciseSeven();
		
		String strOne = obj.helloTo("Denis");
		System.out.println(strOne);
		String strTwo = obj.helloTo("Malek");
		System.out.println(strTwo);
		String strThree =obj.helloTo("Sara");
		System.out.println(strThree);
		
		
		
		
	}
    String helloTo(String strOne) {
    	String result = "";
    	
    	result = "Hello " + strOne;
    	
    	
    	
    	
    	
    	
    	return result;
    }
    
}
