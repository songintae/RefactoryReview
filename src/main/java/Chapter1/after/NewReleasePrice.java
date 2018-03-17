package Chapter1.after;

public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.NEW_RELEASE;
	}

	@Override
	double getCharge(int daysRented) {
		// TODO Auto-generated method stub
		return daysRented * 3;
	}
	
	public int getFrequentRenterPoints(int daysRented){
		if (daysRented > 1)
			return 2;
		else
			return 1;
	}

}
