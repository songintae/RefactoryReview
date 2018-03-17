package Chapter1.after;

public class ChildrenPrice extends Price {

	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.CHILDERNS;
	}

	@Override
	double getCharge(int daysRented) {
		// TODO Auto-generated method stub
		double result = 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}

}
