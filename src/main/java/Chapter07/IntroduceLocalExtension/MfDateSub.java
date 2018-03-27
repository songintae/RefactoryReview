package Chapter07.IntroduceLocalExtension;

import java.util.Date;

public class MfDateSub extends Date {
	MfDateSub(String dateString){
		super(dateString);
	}
	
	MfDateSub(Date arg){
		super(arg.getTime());
	}
	Date nextDay(){
		return new Date(getYear(),getMonth(),getDate() +1);
	}
	
	
}
