package HomeWorkDay20;

public class Exercise11 {
	
	public static void main (String [] args) {
		
		Exercise11 obj = new Exercise11();
		
		String result1 = obj.threeEqual("Java Pro",'P','B' );
		String result2 = obj.threeEqual("Lazy mode",'m','C');
		String result3 = obj.threeEqual("Training", 'T',' ');
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		
		
	}
    protected String threeEqual(String str,char oldChar, char newChar) {
    	String result = "";
    	
    	String newstr= str.replace(oldChar, newChar);
    	result = newstr; 
    	
    	
    	
    	
    	
    	return result;
    	
    	
    }
}
