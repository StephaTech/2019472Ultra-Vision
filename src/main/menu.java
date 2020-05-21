package main;

import java.util.Scanner;


import customer.Customer;
import titles.Titles;

public class menu {

	public menu() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		
		Customer customer = new Customer();
		Titles title = new Titles();
	
		int menu = 0;
		int option = 0;
		
		do {
			System.out.println("**************************************************************");
			System.out.println("****Welcome to Utra-Vision Rental Shop Management Console*****");
			System.out.println("**************************************************************");
			System.out.println("Select an option below");
			System.out.println("********Customers********");
			System.out.println("1. Search customers");
			System.out.println("2. Add customers");
			System.out.println("3. Update customers/Subscription plan");
			System.out.println("****Titles****");
			System.out.println("4. Search titles");
			System.out.println("5. Add new titles");
			System.out.println("****Rent****");
			System.out.println("6. Register rents");
			System.out.println("7. Register returns");


			option = sc.nextInt();
			
			switch(option) {
			case 1:
				customer.searchCustomers();
				break;
			case 2:
				customer.addCustomers();//subscription Ishould call my enum here 
			case 3: 
				customer.updateCustomers();//subscription enum class not working
				break;
			case 4:
				title.searchtitles();
			case 5:
				title.addnewtitles();
				break;
			case 6:
				title.renttitles();
				break;
			case 7:
				title.renttitles();
			default:
				System.out.println("Invalid  option, please try again");
				break;
			}
		
		} while(menu == 0);
	}

}
