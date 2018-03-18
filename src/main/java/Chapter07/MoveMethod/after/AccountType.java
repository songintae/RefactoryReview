package Chapter07.MoveMethod.after;

public class AccountType {
	boolean isPremium(){
		return _premium;
	}
	
	double overdraftCharge(int daysOverdrawn){
		if(isPremium()){
			double result = 10;
			if(daysOverdrawn > 7) result += (daysOverdrawn -7) * 0.85;
			return result;
		}else return daysOverdrawn * 1.75;
	}
	
	private boolean _premium;
}
