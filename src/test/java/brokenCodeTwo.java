

public class brokenCodeTwo {

		public static void   main(String[] args){ // static comes before void, capital S in String
			
			double tempOne=84.7; // int should be double
			int tempTwo =66;
			
            String result;
			if (tempOne < 0 && tempTwo > 100) {
				result = "true";
			}  else if  (tempOne > 100 && tempTwo < 0) {
				result = "true";
			} else {
				result= "false";
			}
			
			System.out.println("result");
		}
			
			
		
			
		{
			
			String season = "Monday";

			switch (season) {
			
			case "fall": //must have ""// and : not ;
				System.out.println("Recovering from hot weather");
				break;
			case "winter":
				System.out.println("Toooo cold");
				break;
				 
			case "spring": // must be a season not a letter and needs "" also needs : not ;
				System.out.println("Recovering from cold weather");			
				break;
			case "summer": // needs : not ;
				System.out.println("Toooo hot");	
				break;
				default:
				 
				System.out.println("Season does not exist!");	
				break;
			}
			

			
			for(int i=5; i <10; i++){ // int should be lower case and for should be lower case and ; instead of ,
				
			   if (i <= 5) {
					System.out.println("i equals to 5");
				} else {
					System.out.println("i not equals");
				}
			}
			
	

	
		
}	
		
	 
}
	



