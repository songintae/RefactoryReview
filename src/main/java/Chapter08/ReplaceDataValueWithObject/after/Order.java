package Chapter08.ReplaceDataValueWithObject.after;

public class Order {
	public Order(String customerName){
		_customer = new Customer(customerName);
	}
	
	public String getCustomerName(){
		return _customer.getName();
	}
	
	public void setCustomer(String customerName){
		_customer = new Customer(customerName);
	}
	
	private Customer _customer;
}
