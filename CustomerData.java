package mandeepJavaApp;

 class CustomerNew {
	
	public String CustomerName;
	
	String getCustomerName()
	{
		return CustomerName;
		
	}
	void setCustomerName(String CustomerName)
	{
		this.CustomerName= CustomerName;
		
	}
 }
 
	 public class CustomerData
	{
		public static void main(String[] args) {
	CustomerNew customerObject = new CustomerNew();
	
	customerObject.CustomerName = "Ron";
	System.out.println("Hello "+customerObject.getCustomerName()); //Output : Hello Ron
			
	// To change the name we use setter method
	customerObject.setCustomerName("Jack");
	System.out.println("Hello "+customerObject.getCustomerName());
}
}
 


