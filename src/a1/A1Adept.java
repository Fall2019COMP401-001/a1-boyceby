package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// IMPORTANT BASIS: Integer count of number of items in the store.
		int numberOfItemsInStore = scan.nextInt();
		
		// Initializing and filling arrays of item names and prices.
			//Initializing:
				String[] itemNames = new String[numberOfItemsInStore];
				double[] itemPrices = new double[numberOfItemsInStore];
		
			// Filling arrays:
				for (int i = 0; i < numberOfItemsInStore; i++) {
					itemNames[i] = scan.next();
					itemPrices[i] = scan.nextDouble();
				}
		
		// IMPORTANT BASIS: Integer count of number of customers.
		int numberOfCustomers = scan.nextInt();
		
		// Initializing and filling arrays for customer information and shopping behavior (to get total amount spent by each customer for calculations):
				// Initializing:
					String[] arrayOfCustomerFirstNames = new String[numberOfCustomers];
					String[] arrayOfCustomerLastNames = new String[numberOfCustomers];
					int[] arrayOfNumberOfDistinctlyScannedItemsBought = new int[numberOfCustomers];
					double[] arrayOfTotalAmountSpentByCustomer = new double[numberOfCustomers];
					
				// Filling:
					for (int i = 0; i < numberOfCustomers; i++) {
						arrayOfCustomerFirstNames[i] = scan.next();
						arrayOfCustomerLastNames[i] = scan.next();
						int specificNumberOfDistinctlyScannedItemsCustomerBought = scan.nextInt();
						arrayOfNumberOfDistinctlyScannedItemsBought[i] = specificNumberOfDistinctlyScannedItemsCustomerBought;
						// Initializing and filling arrays for the specific quantity of each group of item bought and the respective names for a given customer:
							// Initializing:
								int[] specificCustomerSpecificQuantityOfItemBought = new int[specificNumberOfDistinctlyScannedItemsCustomerBought];
								String[] specificCustomerSpecificNameOfItemBought = new String[specificNumberOfDistinctlyScannedItemsCustomerBought];
							// Filling: 
								for (int n = 0; n < specificNumberOfDistinctlyScannedItemsCustomerBought; n++) {
									specificCustomerSpecificQuantityOfItemBought[n] = scan.nextInt();
									specificCustomerSpecificNameOfItemBought[n] = scan.next();
									
									for (int j = 0; j < numberOfItemsInStore; j++) {
										if (specificCustomerSpecificNameOfItemBought[n].equals(itemNames[j])) {
											arrayOfTotalAmountSpentByCustomer[i] = arrayOfTotalAmountSpentByCustomer[i] + (specificCustomerSpecificQuantityOfItemBought[n] * itemPrices[j]);
										}
										
									}
										
								}
					}
					
		// Calculating the credentials/values of the Biggest Spender, Smallest Spender, and the average amount spent:
					// Biggest:
						String biggestFirstName = new String();
						String biggestLastName = new String();
						Double biggestAmountSpent = 0.00;
						for (int i = 0; i < numberOfCustomers; i++) {
							if (arrayOfTotalAmountSpentByCustomer[i] > biggestAmountSpent) {
								biggestFirstName = arrayOfCustomerFirstNames[i];
								biggestLastName = arrayOfCustomerLastNames[i];
								biggestAmountSpent = arrayOfTotalAmountSpentByCustomer[i];
							}
						}
					// Smallest:
						String smallestFirstName = new String();
						String smallestLastName = new String();
						Double smallestAmountSpent = Double.MAX_VALUE;
						for (int i = 0; i < numberOfCustomers; i++) {
							if (arrayOfTotalAmountSpentByCustomer[i] < smallestAmountSpent) {
								smallestFirstName = arrayOfCustomerFirstNames[i];
								smallestLastName = arrayOfCustomerLastNames[i];
								smallestAmountSpent = arrayOfTotalAmountSpentByCustomer[i];
							}
						}
					// Average amount spent:
						Double totalAmountSpentByAll = 0.00;
						for (int i = 0; i < numberOfCustomers; i++) {
							totalAmountSpentByAll = totalAmountSpentByAll + arrayOfTotalAmountSpentByCustomer[i]; 
						}
						Double averageAmountSpent = totalAmountSpentByAll / numberOfCustomers;
						
		// Printing final results of Biggest Spender, Smallest Spender, and Average Amount Spent:
				// Biggest spender print:
					System.out.println("Biggest: " + biggestFirstName + " " + biggestLastName + " (" + String.format("%.2f", biggestAmountSpent) + ")");
				// Smallest spender print:
					System.out.println("Smallest: " + smallestFirstName + " " + smallestLastName + " (" + String.format("%.2f", smallestAmountSpent) + ")");
				// Average amount spent print:
					System.out.println("Average: " + String.format("%.2f", averageAmountSpent));
	
		}
	}
