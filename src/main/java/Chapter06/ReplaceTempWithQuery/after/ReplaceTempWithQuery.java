package Chapter06.ReplaceTempWithQuery.after;

public class ReplaceTempWithQuery {
	public double getPrice(){
		return basePrice() * discountFactor();
	}
	private int basePrice(){
		return _quantity * _itemPrice;
	}
	private double discountFactor(){
		if(basePrice() > 1000) return 0.95;
		else return 0.98;
	}
}
