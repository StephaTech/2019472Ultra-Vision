package customer;

public enum CustomerType {//defining the constants the Enum constructor supplied of values of enum 


	//enums of value required on the CA
	ML ("Music Lovers"),//can only rent Music CDs and Live Concert Videos
	VL ("Video Lovers"),//can only rent movies(excluding Live Concert Videos)
	TV ("TV Lover"),//can only rent Box Sets.
	PR ("Premium");//can rent any titlle.
	
	private String subscription;//associating with customerType above
	
	//default defining constructor as with a default access modifier 
	CustomerType(String subscription) {//parameter
		this.subscription = subscription;
	}

	public String getSubscription() {//particular attributes
		return this.subscription;
	}
}

