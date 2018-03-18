package Chapter07.MoveField.after;

public class Account {
	private AccountType _type;
	
	double interestForAmount_day(double amount, int days){
		return _type.getInterestRate() * amount * days / 365;
	}
}
