package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Integer count of number of items in the store.
		int numberOfItemsInStore = scan.nextInt();
		
		// Information for each item in the store.
		for (int i = 0; i < numberOfItemsInStore; i++) {
			String nameOfItem = scan.next();
			double priceOfItem = scan.nextDouble();
			
		}
		// Integer count of number of customers.
		int numberOfCustomers = scan.nextInt();
		
		// Shopping information for each customer.
		for (int i = 0; i < numberOfCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int numberOfDistinctlyScannedItemsBoughtByCustomer = scan.nextInt();
			
			// Information for each of the items bought by the given customer.
			for (int i = 0; i < numberOfDistinctlyScannedItemsBoughtByCustomer; i++) {
				int quantityOfItemBought = scan.nextInt();
				String nameOfTheItem = scan.next();
				
			}
			
			
		}
	}
}
