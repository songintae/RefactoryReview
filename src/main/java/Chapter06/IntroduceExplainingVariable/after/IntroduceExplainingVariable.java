package Chapter06.IntroduceExplainingVariable.after;

public class IntroduceExplainingVariable {
	double price(){
		//결재액(price) = 총 구매액(base price) -
		//대량 구매 할인(quantity discount) + 배송비(shipping)
		final double basePrice = _quantity * _itemPrice;
		final double quantityDiscount = Math.max(0, _quantity - 500) * itemPrice * 0.05;
		final double shipping = Math.min(basePrice * 0.1, 100.0);
		
		return basePrice - quantityDiscount + shipping;
	}
}
