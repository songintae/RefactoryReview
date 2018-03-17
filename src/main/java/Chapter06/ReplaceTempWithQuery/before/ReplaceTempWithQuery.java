package Chapter06.ReplaceTempWithQuery.before;

public class ReplaceTempWithQuery {
	public double getPrice(){
		int basePrice = _quantity * _itemPrice;
		double discountFactor;
		if(basePrice > 1000) discountFactor = 0.95;
		else discountFactor = 0.98;
		return basePrice * discountFactor;
	}
}
