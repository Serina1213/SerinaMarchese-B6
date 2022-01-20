package homeWorkDay19;

public class ExerciseFive {
	
	public static void main (String [] args) {
		
		ExerciseFive obj = new ExerciseFive();
		
		String resultOne = obj.toLower("espn");
		System.out.println(resultOne);
		String resultTwo=obj.toLower("SOCCER");
		System.out.println(resultTwo);
		String resultThree = obj.toLower("STRING CLASS");
		System.out.println(resultThree);
		
		
	}
    protected String toLower(String strOne) {
    	String result = "";
    	
    	String newstr = strOne.toLowerCase();
    	result = newstr;
    	
    	return result;
    	
    	
    	
    }
}
