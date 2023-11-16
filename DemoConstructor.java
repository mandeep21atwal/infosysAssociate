package mandeepJavaApp;

class CustomerConst{
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	
	public CustomerConst() {
		System.out.println("Parameterless constructor called");
	}
	public CustomerConst(String customerId, String customerName, long contactNumber,String address)
	{
		this();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public void displayCustomerName() {
		System.out.println("Customer Name : " + customerName);
	}
	public void displayCustomerDetails() {
        System.out.println("Displaying customer details \n***********");
        System.out.println("Customer Id : " + customerId);
        this.displayCustomerName();
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Address : " + address);
	}
	
}
public class DemoConstructor {
	public static void main(String[] args) {
		CustomerConst customer = new CustomerConst();
		customer.displayCustomerName();
		customer.displayCustomerDetails();
		
		CustomerConst customer1 = new CustomerConst("K123","Katy",7885651,"21A, Downtown, LA");
		customer1.displayCustomerName();
		customer1.displayCustomerDetails();
	}
}