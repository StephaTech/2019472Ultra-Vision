package titles;

public interface TitlesInterface {	//ENUM OR INTERFACE?????

	//below is the media formats include CCD,DVD and BlueRay
	public String format_CD = "CD";
	public String format_BlueRay = "BLUERAY";
	public String format_DVD = "DVD";
	
	public void Format();//is the media title formats specified as a requirement on the CA
	
	//below is a method
	public void addTitle(String titleType, String titleName, String genre, int yearOfRelease, String director, String band, String Format );
	
	//below is a method
	public void updateTitle(int id,String titleType, String titleName, String genre, int yearOfRelease, String director, String band, String Format );

	

}
