package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Integer input indicating total number of customers.
		int totalNumberOfCustomers = scan.nextInt();
		
		// For loop for all information of each customer.
		for (int i = 0; i < totalNumberOfCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int numberOfItemsBought = scan.nextInt();
			
			// Nested for loop for each type of item bought by given customer.
			double totalCostOfItemsBought = 0;
			for (int n = 0; n < numberOfItemsBought; i++) {
				int integerQuantityofItem = scan.nextInt();
				String nameOfItem = scan.next();
				double priceOfTheItem = scan.nextDouble();
				totalCostOfItemsBought = totalCostOfItemsBought + priceOfTheItem;
			}
			// Print results for each given customer.
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + totalCostOfItemsBought);
		}
	
	}
}
