package titles;

public interface TitlesInterface {	//enum or interface?????

	//below is the media formats include CCD,DVD and BlueRay
	public String format_CD = "CD";
	public String format_BlueRay = "BLUERAY";
	public String format_DVD = "DVD";
	
	public void Format();//is the media title formats specified as a requirement on the CA
	
	//below is a method
	public void addnewtitles(String id,String titleType, String titleName, String genre, int yearOfRelease, String director, String band, String Format );
	

	

}
