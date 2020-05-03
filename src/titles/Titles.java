package titles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import customer.Customer;

public class Titles {
	
	Scanner sc = new Scanner(System.in);
	
	List<Titles> titleList = new ArrayList<Titles>();
	
	private String titleType;//titles in the shop are broken down into types: selected
	private String titleName;//name of the title up to me
	private String genre;//specific requirement CA and relevant to the nature
	private int yearOfRelease;//specific requirement CA and relevant to the nature
	private String director;//specific requirement CA and relevant to the nature
	private String band;//specific requirement CA and relevant to the nature
	private String format;//the media formats include CD,DVD, and Blu-Ray
	private double price;

	public Titles() {
		this.titleType = titleType;
		this.titleName = titleName;
		this.genre = genre;
		this.yearOfRelease = yearOfRelease;
		this.director = director;
		this.band = band;
		this.format = format;
		this.price = price;
	}
	//Method
	public void searchtitles() {
		// TODO Auto-generated method stub
		String titleName;
		boolean result;
		
		System.out.println("Title name: ");
		titleName = sc.nextLine();
		
		for( Titles title : titleList) {
			if(title.getTitleName().contentEquals(titleName)) {
				System.out.println("Name: "+ title.getTitleName() + " | " + "Genre: " + title.getGenre());
				return;
			}
		}
		System.out.println("Title not found, please try again.");
	}

	public void addnewtitles() {
		// TODO Auto-generated method stub
		Titles title = new Titles();
		System.out.println("******ADD Title******");
		
		System.out.println("Title Type: (ML), (VL), (TV)");
		title.setTitleType(sc.nextLine());
				
		System.out.println("Title name: ");
		title.setTitleName(sc.nextLine());
		
		System.out.println("Genre: ");
		title.setGenre(sc.nextLine());
		
		System.out.println("Year of release: ");
		title.setYearOfRelease(sc.nextInt());
		
		System.out.println("Director: ");
		title.setDirector(sc.nextLine());
		sc.nextLine();//put extra for get space because i dont know yet why is not given space between them.
		
		System.out.println("Band: ");
		title.setBand(sc.nextLine());
		
		System.out.println("Format type: (CD), (DVD), (BLU-RAY)");
		title.setDirector(sc.nextLine());
		
		System.out.println("Price title: ");
		title.price = Double.parseDouble(sc.nextLine());
		
		titleList.add(title);
	}
	public void renttitles() {
		// TODO Auto-generated method stub
		String nametitle;
		
		Customer customer = new Customer();//importing customer class
		
		System.out.println("******Rent a Title(Music, Movie or Box Set)******");
		System.out.println("Title name: ");
		nametitle = sc.nextLine();
		
		for (Titles title : titleList) {
			if (title.getTitleName().equals(nametitle)) {
			System.out.println("Titles found are: ..." + 
			"\n Title: " + getTitleName() +
			"\n Year of release: " + getYearOfRelease() +
			"\n Price: " + getPrice());
		}
	}
		System.out.println("Sorry, title not found.");
		
		if (!("Sorry, title not found.".equals(nametitle))) {
			System.out.println("Would you like to try with ID customer? ");
			String option = null;
			
			switch(option) {
			case "yes:":
			//case "YES":
				System.out.println("Enter customer ID: ");
				String customerid = sc.nextLine();
				
				for (Customer pcustomer : customer.customerlist) {
					if(customer.getId().equals(customer.getId())) {
						System.out.println("ID customer found is: ..." + 
			"\n Name: " + customer.getName() +
			"\n Year of release: " + getYearOfRelease() +
			"\n Price: " + getPrice());
					}
				}
				System.out.println("ID customer not found.");
				if(!("ID not found.".equals(customerid))) {
					
				}
				
				break;
				
			case "no":
			//case "no":
				
			default:
				System.out.println("Type yes or no.");
			break;
			}
		}
		
	}
	
		
	//Getter and setters	
	public List<Titles> getTitleList() {
		return titleList;
	}
	public void setTitleList(List<Titles> titleList) {
		this.titleList = titleList;
	}
	public String getTitleType() {
		return titleType;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
