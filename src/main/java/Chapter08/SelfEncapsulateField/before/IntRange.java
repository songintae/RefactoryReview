package Chapter08.SelfEncapsulateField.before;

public class IntRange {
	private int _low;
	private int _high;
	
	boolean includes(int arg){
		return arg >= _low && arg <= _high;
	}
	
	void grow(int factor){
		_high = _high * factor;
	}
	
	IntRange(int low, int high){
		_low = low;
		_high = high;
	}
}
