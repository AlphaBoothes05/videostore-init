package wsVideoStore;

public abstract class Movie
{
	private String title;
	private int pricecode;
	public static final int REGULAR=1, NEW_RELEASE=2, CHILDRENS=3;

	public Movie(String title, int pricecode) {
		this.title 		= title;
		this.pricecode= pricecode;
	}
		
	public String getTitle () {
		return title;
	}
	public int getPriceCode(){
		return pricecode;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);

}