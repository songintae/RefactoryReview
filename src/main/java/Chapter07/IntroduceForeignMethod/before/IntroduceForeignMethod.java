package Chapter07.IntroduceForeignMethod.before;

import java.util.Date;

public class IntroduceForeignMethod {
	public void exampleIntroduceForeignMethod(){
		Date newStart = new Date(previousEnd.getYear(),
				previousEnd.getMonth(), previousEnd.getDate() +1);
	}
	Date previousEnd;
}
