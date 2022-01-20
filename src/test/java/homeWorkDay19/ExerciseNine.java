package homeWorkDay19;

public class ExerciseNine {
	
	public static void main (String [] args) {
		
		ExerciseNine obj = new ExerciseNine();
		boolean r1 = obj.isThere("java training", "ini");
		System.out.println(r1);
		boolean r2 = obj.isThere("java training", "ava");
		System.out.println(r2);
		boolean r3 = obj.isThere("java training", "AVA");
		System.out.println(r3);
		boolean r4 = obj.isThere("java training", "Java");
		System.out.println(r4);
		
		
		
		
		
	}
	
	private boolean isThere(String strOne, String value) {
		boolean result = false;
		
		if (strOne.contains(value)) {
			result = true;
			
		}else {
			result = false;
			
		}
		
		return result;
	}

}
