package rental;

import java.util.ArrayList;

import customer.Customer;
import titles.Titles;

public class Bill {

	private Customer customer;
	private  String number;
	private double debitBalance;
	private Rent[] recordrent;
	
	//Constructor
	public Bill() {
		
		this.customer = customer;
		this.number = number;
		this.debitBalance = debitBalance = 0;
		this.recordrent = new Rent[20];
	}
	public ArrayList<Bill> listcustomer = new ArrayList<Bill>();
	
	//method action parameters
	public void Bill() {
		
	}
	public void Bill(Customer customer, int numero){
		
	}
	public void rentTitle(Titles title) {
		
	}
	public String statement() {
		return statement();
		
	}
	public void debitBalance(double value) {
		
	}
	//getters and setter
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getDebitBalance() {
		return debitBalance;
	}
	public void setDebitBalance(double debitBalance) {
		this.debitBalance = debitBalance;
	}
	public Rent[] getRecordrent() {
		return recordrent;
	}
	public void setRecordrent(Rent[] recordrent) {
		this.recordrent = recordrent;
	}
	public ArrayList<Bill> getListcustomer() {
		return listcustomer;
	}
	public void setListcustomer(ArrayList<Bill> listcustomer) {
		this.listcustomer = listcustomer;
	}



}
