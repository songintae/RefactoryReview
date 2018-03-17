package Chapter1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	
	Customer children;
	Customer regular;
	Customer newRelease;
	
	Rental childrenRental;
	Rental regularRental;
	Rental newReleaseRental;
	
	Movie childrenMovie;
	Movie regularMovie;
	Movie newReleaseMovie;
	
	
	@Before
	public void setUp(){
		children = new Customer("children");
		regular = new Customer("regular");
		newRelease = new Customer("newRelease");
		
		childrenMovie = new Movie("children",Movie.CHILDERNS);
		regularMovie = new Movie("regular",Movie.REGULAR);
		newReleaseMovie = new Movie("newRelease",Movie.NEW_RELEASE);
		
		childrenRental = new Rental(childrenMovie,4);
		regularRental = new Rental(regularMovie,3);
		newReleaseRental = new Rental(newReleaseMovie,2);
		
		children.addRental(childrenRental);
		regular.addRental(regularRental);
		newRelease.addRental(newReleaseRental);
	}
	
	@Test(timeout = 2000)
	public void statementTest(){
		assertThat(children.statement(),is(getStatementResult(children.getName(),childrenMovie.getTitle()
				, 3.0,3.0,1)));
		assertThat(regular.statement(),is(getStatementResult(regular.getName(),regularMovie.getTitle()
				, 3.5,3.5,1)));
		assertThat(newRelease.statement(),is(getStatementResult(newRelease.getName(),newReleaseMovie.getTitle()
				, 6.0,6.0,2)));
	}
	
	private String getStatementResult(String name, String title, double thisAmount, double totalAmount, int frequentRenterPoints){
		String result = name + " 고객님의 대여 기록 \n";
		result+= "\t" + title + "\t" 
				+ String.valueOf(thisAmount);
		result += "누적 대여료 : " + String.valueOf(totalAmount) + "\n";
		result += "적립 포인트 : " + String.valueOf(frequentRenterPoints);
		return result;
	}
	
}
