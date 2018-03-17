package Chapter06.ReplaceMethodWithMethodObject.after;

public class Account {
	
	int gamma(int inputVal, int quantity, int yearToDate){
		return new Gamma(this,inputVal,quantity,yearToDate).compute();
	}
}
