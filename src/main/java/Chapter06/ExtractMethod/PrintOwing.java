package Chapter06.ExtractMethod;

import java.util.Enumeration;

public class PrintOwing {
	void printOwing(){

		printBanner();		
		double outstanding = getOutstanding();
		printDetails(outstanding);
		
	}
	
	void printBanner(){
		System.out.println("*************************");
		System.out.println("******** 고객 외상 ********");
		System.out.println("*************************");
	}
	
	void printDetails(double outstanding){
		System.out.peintln("고객명 : " + getName());
		System.out.println("외상액 : " + outstanding);
	}
	
	public double getOutstanding(){
		double result = 0.0;
		Enumeration e = _orders.elements();
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			result += each.getAmount();			
		}
		return result;
	}

}
