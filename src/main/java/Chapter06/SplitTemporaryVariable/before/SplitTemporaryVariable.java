package Chapter06.SplitTemporaryVariable.before;

public class SplitTemporaryVariable {
	double getDistansceTravelled(int time){
		double result;
		double acc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		int secondaryTime = time - _delay;
		if(secondaryTime > 0){
			double primaryVel = acc * _delay;
			acc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 
					* acc * secondaryTime * secondaryTime;
		}
		
		return result;
	}
	
}
