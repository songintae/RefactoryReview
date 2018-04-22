package Chapter08.ReplaceMagicNumberWithSymbolicConstant.after;

public class ReplaceMagicNumberWithSymbolicConstant {
	static final double GRAVITATIONAL_CONSTANT = 9.81;
	double pontentialEnergy(double mass, double height){
		return mass * GRAVITATIONAL_CONSTANT * height;
	}
}
