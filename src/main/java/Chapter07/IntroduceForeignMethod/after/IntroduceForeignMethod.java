package Chapter07.IntroduceForeignMethod.after;

import java.util.Date;

public class IntroduceForeignMethod {
	public void exampleIntroduceForeignMethod(){
		Date newStart = nextDay(previousEnd);
	}
	Date previousEnd;
	
	private static Date nextDay(Date arg){
		return new Date(arg.getYear(),
				arg.getMonth(), arg.getDate() +1);
	}
}
