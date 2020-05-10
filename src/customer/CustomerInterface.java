package customer;

public interface CustomerInterface {//the methods declared in interface are by default abstract(only method signature, no body)

	//method below to add a new customer
	public void addCustomer(String id, String name, String membership , String email, String points);
	
	//method below to update customer
	public void updateCustomer(String id, String name, String membership , String email, String points);
	
	//how to search a customer
	
}
