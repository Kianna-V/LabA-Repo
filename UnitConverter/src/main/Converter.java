package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// import Scanner for user input
		
		Scanner keyboard = new Scanner(System.in);
		
	
		final double CUPS_TO_TSP = 48; 
		final float MILE_TO_KILOMETERS = 1.60934f;
		final double INCHES_TO_CM = 2.54;
		
		
		//do-while menu selection
		int choice;
		do {
			System.out.println("Please select an option: ");
			System.out.println("1.Cups to Teaspons");
			System.out.println("2.Mile to Kilometers");
			System.out.println("3.inches to centimeters");
			System.out.println("4. Quit");
			choice = keyboard.nextInt();
			
			// if the user inputs a choice greater than 4, print error message
			if(choice >= 5)
				System.out.println("Error: " + choice + " is not a valid choice, please "
					+	"selcet a valid choice");
				
				
			
			
			switch(choice) {
			case 1:
				double cups;
				System.out.println("Please enter the number of Cups you would like"
						+ "to convert to Teaspoons" );
				 cups = keyboard.nextDouble();
				
				System.out.println("The conversion of Cups to Teaspoons = " + (cups * CUPS_TO_TSP) + " tsp(s)");
				break;
				
			case 2:
				float miles;
				System.out.println("Please enter the Miles you would like to convert to Kilometers");
				miles = keyboard.nextFloat();
				System.out.printf("The conversion of Miles to Kilometers = "+ (miles * MILE_TO_KILOMETERS) + " km(s)");
				break;
				
			case 3:
				float inches;
				System.out.println("Please enter the number of inches you would like to convert to Centemeters");
				inches = keyboard.nextFloat();
				System.out.println("The conversion of inches to cm(s)= " + (inches * INCHES_TO_CM ) + " cm(s)");
				break;
				
			case 4:
				System.out.println("Thanks for using my unit converter, Goodbye!");
			
			
			
			}
			
			
			} while(choice !=4);
		
			keyboard.close();
			
} // end main	
			
} // end class Converter
		
		
	



