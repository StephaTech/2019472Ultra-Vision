package customer;

//Source code provide from Michael Weiss and Amilcar Aponte on moddle

public class MembershipCard {
	
	private int points;
	private boolean freeRentAllowed;
	   
	   public void addPoints(int points){
			this.points += points;
			setRentAllowed();
	   }
	   
	   public boolean availFreeRent(){
			if(this.setRentAllowed()){//??setfreeRentAllowed
				this.points -= 100;
				setRentAllowed();
				return true;
			} else {
				return false;
			}
	   }
	   
	   private boolean setRentAllowed(){
			if (this.points >= 100){
				this.freeRentAllowed = true;
			} else {
				this.freeRentAllowed = false;
			}
			return freeRentAllowed;
	   }
	   
	   public int getPoints() {
			return  points;

}
	   }
