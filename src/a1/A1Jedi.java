package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Creating and Filling Items List for the Store
			// Taking in the scan value of the numberOfItemsInStore
				int numberOfItemsInStore = scan.nextInt();
			// Initializing arrayListOfItemsInStoreNames and arrayListOfItemsInStorePrices (as well as the lists we hope to calculate):
				String[] arrayListOfItemsInStoreNames = new String[numberOfItemsInStore];
				Double[] arrayListOfItemsInStorePrices = new Double[numberOfItemsInStore];
				// For the calculated lists required for required output:
					int[] arrayListOfNumberOfCustomersWhoBoughtGivenItems = new int[numberOfItemsInStore];
					int[] arrayListOfNumberOfTotalPurchasesOfGivenItems = new int[numberOfItemsInStore];
			// Filling the first two array lists with their inserted scan values
				for (int i = 0; i < numberOfItemsInStore; i++) {
					arrayListOfItemsInStoreNames[i] = scan.next();
					arrayListOfItemsInStorePrices[i] = scan.nextDouble();
				}
		
		// Creating and Filling Shopping Lists for Customers and Item Purchase Tracker (quantity bought in total and number of different purchasers)
			// Taking in the scan value for the number of customers:
				int numberOfCustomers = scan.nextInt();
			// Initializing: 
				String[] arrayOfCustomerFirstNames = new String[numberOfCustomers];
				String[] arrayOfCustomerLastNames = new String[numberOfCustomers];
				int[] arrayOfNumberOfEnteredItemGroupsBoughtPerCustomer = new int[numberOfCustomers];
			// Filling:
				for (int i = 0; i < numberOfCustomers; i++) {
					arrayOfCustomerFirstNames[i] = scan.next();
					arrayOfCustomerLastNames[i] = scan.next();
					int specificNumberOfEnteredItemGroupsCustomerBought = scan.nextInt();
					arrayOfNumberOfEnteredItemGroupsBoughtPerCustomer[i] = specificNumberOfEnteredItemGroupsCustomerBought;
					// Initializing and filling arrays for the specific quantity of each group of item bought and the respective names for a given customer:
						// Initializing:
							int[] specificCustomerSpecificQuantityOfItemBought = new int[specificNumberOfEnteredItemGroupsCustomerBought];
							String[] specificCustomerSpecificNameOfItemBought = new String[specificNumberOfEnteredItemGroupsCustomerBought];
							// Multiple item in same group counter:
								int[] specificCustomerMultipleItemInSameGroupCounter = new int[numberOfItemsInStore];
						// Filling: 
							for (int n = 0; n < specificNumberOfEnteredItemGroupsCustomerBought; n++) {
								specificCustomerSpecificQuantityOfItemBought[n] = scan.nextInt();
								specificCustomerSpecificNameOfItemBought[n] = scan.next();
										// Done with taking in all scanned values at this point	
							// Checking if equals any of the ones from the larger to then add counts
								for (int k = 0; k < numberOfItemsInStore; k++) {
									if (arrayListOfItemsInStoreNames[k].equals(specificCustomerSpecificNameOfItemBought[n])) {
										// put an if here for this one below for if one count has already been counted for that one purchaser
										if (specificCustomerMultipleItemInSameGroupCounter[k] == 0) {
											arrayListOfNumberOfCustomersWhoBoughtGivenItems[k]++;
											specificCustomerMultipleItemInSameGroupCounter[k]++;
										}
										arrayListOfNumberOfTotalPurchasesOfGivenItems[k] = arrayListOfNumberOfTotalPurchasesOfGivenItems[k] + specificCustomerSpecificQuantityOfItemBought[n];
									}
									
								}
								
							}
					
				}
						
		
		// Final Printing in Correct Order:
		for (int j = 0; j < numberOfItemsInStore; j++) {
			if (arrayListOfNumberOfTotalPurchasesOfGivenItems[j] > 0) {
				
				System.out.println(arrayListOfNumberOfCustomersWhoBoughtGivenItems[j] + " customers bought " + arrayListOfNumberOfTotalPurchasesOfGivenItems[j] + " " + arrayListOfItemsInStoreNames[j]);
	
			} else {
				System.out.println("No customers bought " + arrayListOfItemsInStoreNames[j]);
			}
		}
		
	}
}
