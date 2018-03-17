package Chapter06.SplitTemporaryVariable.after;

public class SplitTemporaryVariableMoreRefactoring {
	double getDistansceTravelled(int time){
		double result = primaryDistanseTravelled(time);
		if(secondaryTime(time) > 0){
			result += secondaryDistanceTravelled(time);
		}
		return result;
	}
	
	private double primaryDistanseTravelled(int time){
		return getDistance(priamryAcc(), primaryTime(time));
	}
	
	private int primaryTime(int time){
		return Math.min(time, _delay);
	}
	private double priamryAcc(){
		return _primaryForce / _mass;
	}
	private double secondaryAcc(){
		return (_primaryForce + _secondaryForce) / _mass;
	}
	
	private int secondaryTime(int time){
		return time - _delay;
	}
	private double secondaryDistanceTravelled(int time){
		return (priamryAcc() * _delay) * secondaryTime(time) 
				+ getDistance(secondaryAcc(), secondaryTime(time));
	}
	
	public double getDistance(double acc, int time){
		return 0.5 * acc * time * time;
	}
}
