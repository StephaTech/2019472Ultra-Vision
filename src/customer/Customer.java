package customer;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	//abstract class means to provide a base for subclasses to extend and implement the abstract methods.
	//creating attributes
	
		private String id; //unique account
		private String name;// username
		private String membership;//access level type (ML,VL,TV,PR)
		private String email;
		private int points; //question public or private for i generate the setters and getteers????
		
		//constructor
		public Customer() {
			this.id = id;
			this.name = name;
			this.membership = membership;
			this.email = email;
			this.points = points;
		}
		
		Scanner sc = new Scanner(System.in);
		
		public ArrayList<Customer> customerlist = new ArrayList<Customer>();
		
		//Method
		public void searchCustomers() {
			
			String id;
			boolean result;
			
			System.out.println("Enter ID number: ");
			
			id = sc.nextLine();
			for(Customer customer : customerlist) {
				if(customer.getId().equals(id)) {
					System.out.println("Customer: "+ customer.getName() + " | " + "ID: " + customer.getId());
					return;
				}
			}
			System.out.println("Customer not found, please try again.");
				
		}
		
		public void addCustomers() {
			Customer customer = new Customer();
			
			System.out.println("****Add Customer****");
			System.out.println("\n");
			System.out.println("Id: ");
			customer.setId(sc.nextLine());//nextline ...readLine not working??
			System.out.println("\n");
			System.out.println("Name: ");
			customer.setName(sc.nextLine());//nextLine string
			
			
			System.out.println("Membership: (ML), (VL), (TV), (PR)");
			customer.setMembership(sc.nextLine());
			
			System.out.println("Email: ");
			customer.setEmail(sc.nextLine());
			
			System.out.println("Points: ");
			customer.setPoints(sc.nextInt());;
			System.out.println("\n");
			
			customerlist.add(customer);
			
		}
		public void updateCustomers() {
			// TODO Auto-generated method stub
			
		}
		
		public Scanner getSc() {
			return sc;
		}
		public void setSc(Scanner sc) {
			this.sc = sc;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMembership() {
			return membership;
		}
		public void setMembership(String membership) {
			this.membership = membership;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getPoints() {
			return points;
		}
		public void setPoints(int points) {
			this.points = points;
		}
}
