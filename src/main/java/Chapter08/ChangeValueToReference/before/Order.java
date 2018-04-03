package Chapter08.ChangeValueToReference.before;

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
