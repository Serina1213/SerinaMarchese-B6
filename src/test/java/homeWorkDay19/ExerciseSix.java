package homeWorkDay19;

public class ExerciseSix {
	
	public static void main (String [] args) {
	
	String result1 = combineStr("day","ONE","work","HOURS");
	String result2= combineStr("week","weekend","monday","TUESDAY");
	String result3= combineStr("reston","VA","baltimore","MD");
	String result4= combineStr("java","is","fun","LEARNING");
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	
	}

  protected static String combineStr(String strOne,String strTwo,String strThree, String strFour) {
	  String result = "";
	  
	  String newstr = strOne.toUpperCase()+ strTwo.toLowerCase();
	  String newstr2 = strThree.toUpperCase()+ strFour.toLowerCase();
	  result = (newstr.concat(newstr2));
	  
	  return result;
  }
  }