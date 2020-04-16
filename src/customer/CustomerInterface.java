package customer;

public interface CustomerInterface {//the methods declared in interface are by default abstract(only method signature, no body)

	//method below to add a new customer
	public void addCustomer(String id, String nickName, String address, String membership, String email);
	
	//method below to update customer
	public void updateCustomer(String id, String nickName, String address, String membership, String email);
	
	//how to search a customer
	
}
