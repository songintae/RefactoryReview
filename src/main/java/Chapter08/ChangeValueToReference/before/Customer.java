package Chapter08.ChangeValueToReference.before;

public class Customer {
	
	public Customer(String name){
		_name = name;
	}
	
	public String getName(){
		return _name;
	}
	
	private final String _name;
}
