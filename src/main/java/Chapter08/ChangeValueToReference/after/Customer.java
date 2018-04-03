package Chapter08.ChangeValueToReference.after;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {
	
	//참조가 될 객체를 저장하는 라인항목을 가진 레지스트리 객체가 있어야함.
	private static Dictionary _instances = new Hashtable();
	
	static void loadCustomer(){
		new Customer("우리 렌터카").store();
		new Customer("커피 자판기 운영업 협동조합").store();
		new Customer("삼천리 가스 공자").store();
	}
	
	public static Customer getNamed(String name){
		return (Customer)_instances.get(name);
	}
	
	private void store(){
		_instances.put(getName(), this);
	}
	
	private Customer(String name){
		_name = name;
	}
	
	public String getName(){
		return _name;
	}
	
	private final String _name;
}
