package HomeworkDay8;

public class CozaLozaWoza {
	
	public static void main(String [] agrs) {
		 //for loop
		for(int i=1; i<=36; i++){
			
			if (i % 3==0 && i % 5 == 0)
				System.out.println("CozaLoza");
			else if (i % 3==0)
				System.out.println("Coza");
			else if (i % 5==0)
			System.out.println("Loza");
			else if (i % 7==0)
			System.out.println("Woza");
			else 
				System.out.println(i);
			
			
		}
		//while loop
		int s =1;
		while(s<=36) {
			if(s % 3==0 && s % 5 == 0)
				System.out.println("CozaLoza");
			else if (s % 3==0)
				System.out.println("Coza");
			else if (s % 5==0)
			System.out.println("Loza");
			else if (s % 7==0)
			System.out.println("Woza");
			else 
				System.out.println(s);
			s++;
			
			//do while
			
			int r=1;
			
			do {
				if(r % 3==0 && r % 5 == 0)
					System.out.println("CozaLoza");
				else if (r % 3==0)
					System.out.println("Coza");
				else if (r % 5==0)
				System.out.println("Loza");
				else if (r % 7==0)
				System.out.println("Woza");
				else 
					System.out.println(r);
				r++;
				
			}while (r<=36);
			
			
			}
			
			
			
			
		}
	}


