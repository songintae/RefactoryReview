package Chapter1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name;
	private Vector _rentals = new Vector();

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}
	
	public Enumeration getRentals(){
		return _rentals.elements();
	}

	public String statement() {
		String result = getHeader();
		Enumeration rentals = getRentals();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// 이번에 대여하는 비디오 정보와 대여료를 출력
			result+= "\t" + each.getMovie().getTitle() + "\t" 
					+ String.valueOf(each.getCharge());
		}
		
		//푸터행 추가
		result += getFooter();
		return result;
	}
	
	public int getTotalFrequentRenterPoints(){
		int result = 0;
		Enumeration rentals = getRentals();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
	
	public double getTotalAmount(){
		double result = 0;
		Enumeration rentals = getRentals();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		
		return result;
	}
	
	public String getHeader(){
		return getName() + " 고객님의 대여 기록 \n";
	}
	
	public String getFooter(){
		return "누적 대여료 : " + String.valueOf(getTotalAmount()) + "\n"
				+ "적립 포인트 : " + String.valueOf(getTotalFrequentRenterPoints());
	}
	

}
