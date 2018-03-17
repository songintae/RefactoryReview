package Chapter1;

public class Movie {
	public static final int CHILDERNS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String _title;
	private Price _priceCode;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return _priceCode.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		case Movie.REGULAR:
			_priceCode = new RegularPrice();
			break;
		case Movie.NEW_RELEASE:
			_priceCode = new NewReleasePrice();
			break;
		case Movie.CHILDERNS:
			_priceCode = new ChildrenPrice();
			break;
		default :
			throw new IllegalArgumentException("가격 코드가 잘못됐습니다.");
		}
	}

	public String getTitle() {
		return _title;
	}

	public double getCharge(int daysRented) {
		return _priceCode.getCharge(daysRented);

	}
	
	public int getFrequentRenterPoints(int daysRented){

		return _priceCode.getFrequentRenterPoints(daysRented);
		
	}
}
