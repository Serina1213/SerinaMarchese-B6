package HomeworkDay8;

public class Hurricane {
	
	public static void main(String []agrs) {
		
		// for loop
		

		for(int h =20; h <=200; h ++)
			if (h>=74&& h <=95)
				System.out.println("Category 1 wind speed" + h);
			else if(h>=105 && h <=110)
				System.out.println("Category 2 wind speed" + h);
			else if(h>=120 && h<=130)
				System.out.println("Category 3 wind speed"+ h);
			else if(h>=140 && h<=155)
				System.out.println("Category 4 wind speed"+ h);
			else if(h>=165 && h <=194)
				System.out.println("Catgory 5 wind speed"+ h);
		
		//while loop
		
		int k = 20;
		while(k<=200) {
			if (k>=74&& k <=95)
				System.out.println("Category 1 wind speed" + k);
			else if(k>=105 && k <=110)
				System.out.println("Category 2 wind speed" + k);
			else if(k>=120 && k<=130)
				System.out.println("Category 3 wind speed"+ k);
			else if(k>=140 && k<=155)
				System.out.println("Category 4 wind speed"+ k);
			else if(k>=165 && k <=194)
				System.out.println("Catgory 5 wind speed"+ k);
		
		k++;
		}
		
		//do while loop
		
		int w = 20;
		
		do {
			if (w>=74&& w <=95)
				System.out.println("Category 1 wind speed" + w);
			else if(w>=105 && w <=110)
				System.out.println("Category 2 wind speed" + w);
			else if(w>=120 && w<=130)
				System.out.println("Category 3 wind speed"+ w);
			else if(w>=140 && w<=155)
				System.out.println("Category 4 wind speed"+ w);
			else if(w>=165 && w <=194)
				System.out.println("Catgory 5 wind speed"+ w);
		
		w++;
		}while (w<= 200);
		
		
		
		
		
		
		
		
		
			
			
			
		}
		
		
		
	
		
		
		
				
				
	}


