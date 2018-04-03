package Chapter08.ChangeReferenceToValue.after;

public class Currency {
	private String _code;
	
	public String getCode(){
		return _code;
	}
	
	//참조 객체이기 때문에 사용할 인스턴스를 가져오려면 생성자 대신 팩토리 메소드를 통해 접근.
	private Currency(String code){
		_code = code;
	}
	
	public boolean equal(Object arg){
		if(!(arg instanceof Currency)) return false;
		Currency other = (Currency) arg;
		return (_code.equals(other._code));
	}
	
	public int hashCode(){
		return _code.hashCode();
	}
}
