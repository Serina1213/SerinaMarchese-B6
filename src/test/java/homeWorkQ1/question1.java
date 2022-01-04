package homeWorkQ1;

public class question1 {
	
	public static void main(String [] args) {
		
		calculate(4.0,5.0,'+');
		
		
	}

	private static void calculate(double numOne, double numTwo, char mathOperationSign) {
		
		if (mathOperationSign == '+' ){
			System.out.println(numOne+ "+" +  numTwo+"=" + (numOne+numTwo));
			
		}else if(mathOperationSign=='-') { 
			
			System.out.println(numOne+ "-" +  numTwo+"=" + (numOne-numTwo));
			
		}else if(mathOperationSign=='*') {
			
			System.out.println(numOne+ "*" +  numTwo+"=" + (numOne*numTwo));
			
		}else if(mathOperationSign=='/') {
			
			System.out.println(numOne+ "/" +  numTwo+"=" + (numOne/numTwo));
			
		}else if(mathOperationSign =='%') {
			
			System.out.println(numOne+ "%" +  numTwo+"=" + (numOne%numTwo));
			
		}else {
			
			System.out.println("error message");
			
			
			
			
			
			
			
		}
	
		
	}

}
