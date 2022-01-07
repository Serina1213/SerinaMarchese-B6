package homworkday12;

public class Q1 {
	
	public static void main(String [] args) {
		
		boolean result1=posNeg(1,-1,false);
		boolean result2=posNeg(-1,1,false);
		boolean result3=posNeg(-4,-5,true);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		 
		
	}
    public static boolean posNeg(int numOne, int numTwo, boolean negative) {
    	boolean result = false;
    	
    	if(numOne<0 && numTwo> 0 && negative== false) {
    	result=true;
    	}else if(numOne>0 && numTwo<0 && negative== false) {
    		result = true;
    	}else if(numOne<0 && numTwo<0 && negative == true) {
    	result = true;
    	} else 
    		result= false;
    	return result;
    }
}
