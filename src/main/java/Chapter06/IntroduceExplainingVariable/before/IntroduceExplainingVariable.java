package Chapter06.IntroduceExplainingVariable.before;

public class IntroduceExplainingVariable {
	double price(){
		//결재액(price) = 총 구매액(base price) -
		//대량 구매 할인(quantity discount) + 배송비(shipping)
		return _quantity * _itemPrice 
			- Math.max(0, _quantity - 500) * itemPrice * 0.05
			+ Math.min(_quantity * _itemPrice * 0.1, 100.0);
	}
}
