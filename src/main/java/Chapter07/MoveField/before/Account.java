package Chapter07.MoveField.before;

public class Account {
	private AccountType _type;
	private double _interestRate;
	
	double interestForAmount_day(double amount, int days){
		return _interestRate * amount * days / 365;
	}
}
