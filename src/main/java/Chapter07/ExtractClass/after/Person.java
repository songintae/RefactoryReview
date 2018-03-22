package Chapter07.ExtractClass.after;


public class Person {
	public String getName(){
		return _name;
	}
	
	public String getTelephoneNumber(){
		return _office.getTelephoneNumber();
	}
	public Office getOffice(){
		return _office;
	}
	
	private String _name;
	private Office _office = new Office();
}
