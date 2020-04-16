package customer;

public abstract class Customer {//to provide a base for subclasses to extend and implement the abstract methods.
	private int id; //unique account
	private String nickName;// try nickName instead firstname and last name?
	private String address;
	private String membership;//access level type (ML,VL,TV,PR)
	private String email;
	private int points; //question public or private for i generate the setters and getteers????
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	
}
