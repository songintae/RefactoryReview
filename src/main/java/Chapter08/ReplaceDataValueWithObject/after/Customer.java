package Chapter08.ReplaceDataValueWithObject.after;

public class Customer {
	
	public Customer(String name){
		_name = name;
	}
	
	public String getName(){
		return _name;
	}
	
	private final String _name;
}
