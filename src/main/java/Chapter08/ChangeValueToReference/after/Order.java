package Chapter08.ChangeValueToReference.after;

public class Order {
	public Order(String customerName){
		_customer = Customer.getNamed(customerName);
	}
	
	public String getCustomerName(){
		return _customer.getName();
	}
	
	public void setCustomer(String customerName){
		_customer = Customer.getNamed(customerName);
	}
	
	private Customer _customer;
}
