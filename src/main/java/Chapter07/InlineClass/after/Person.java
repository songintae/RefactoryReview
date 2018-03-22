package Chapter07.InlineClass.after;


public class Person {
	public String getName(){
		return _name;
	}
	
	String getOfficeAreaCode(){
		return _officeAreaCode;
	}
	
	void setOfficeAreaCode(String arg){
		_officeAreaCode = arg;
	}
	
	String getOfficeNumber(){
		return _officeNumber;
	}
	
	void setOfficeNumber(String arg){
		_officeNumber = arg;
	}
	
	public String getTelephoneNumber(){
		return ("(" + _officeAreaCode + ")" + _officeNumber);
	}
	
	
	private String _name;
	private String _officeAreaCode;
	private String _officeNumber;
	
}
