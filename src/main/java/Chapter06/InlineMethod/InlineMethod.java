package Chapter06.InlineMethod;

public class InlineMethod {
	int getRating(){
		return (_numberOfLateDeliveries > 5) ? 2 : 1;
	}
	
	private int _numberOfLateDeliveries;
}
