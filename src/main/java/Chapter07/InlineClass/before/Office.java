package Chapter07.InlineClass.before;

public class Office {
	private String _officeAreaCode;
	private String _officeNumber;
	
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
}
