package muliplicationLoop;

import java.util.*;


public class Mulitiply {

	public static void main(String[] args) {
	
		int number, multiplier;
		Scanner input = new Scanner(System.in);
				
		
			System.out.println("Enter the Number");
			number =input.nextInt();
			input.close();
			
			for(multiplier =1; multiplier <=10; multiplier++) {
				
					System.out.printf("%d * %d = %d\n", number,multiplier, (number * multiplier));
					
					
			}
			
		
					

	}

}
