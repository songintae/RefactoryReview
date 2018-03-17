package Chapter06.SplitTemporaryVariable.after;

public class SplitTemporaryVariable {
	double getDistansceTravelled(int time){
		double result;
		final double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secondaryTime = time - _delay;
		if(secondaryTime > 0){
			double primaryVel = primaryAcc * _delay;
			final double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 
					* secondaryAcc * secondaryTime * secondaryTime;
		}
		
		return result;
	}
	
}
