package Chapter08.SelfEncapsulateField.after;

public class IntRange {
	private int _low;
	private int _high;
	
	boolean includes(int arg){
		return arg >= getLow() && arg <= getHigh();
	}
	
	void grow(int factor){
		setHigh(getHigh() * factor);
	}
	
	IntRange(int low, int high){
		initialize(low, high);
	}

	public int getLow() {
		return _low;
	}

	public void setLow(int low) {
		this._low = _low;
	}

	public int getHigh() {
		return _high;
	}

	public void setHigh(int high) {
		this._high = _high;
	}
	
	public void initialize(int low , int high){
		_low = low;
		_high = high;
	}
	
}
