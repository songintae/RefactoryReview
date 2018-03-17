package Chapter06.ReplaceMethodWithMethodObject.before;

public class Account {
	
	int gamma(int inputVal, int quantity, int yearToDate){
		int importantValue1 = (inputVal * quantity) + delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		if((yearToDate - importantValue1) > 100)
			importantValue1 -= 20;
		int importantValue3 = importantValue2 * 7;
		//기타 작업
		return importantValue3 -2 * importantValue1;
	}
}
