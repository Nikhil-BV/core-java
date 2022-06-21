class Restaurant{
		public Restaurant()
	{
		System.out.println("Restaurant objected Created");
	    System.out.println("----------------");
	}
	int id;
	String name;
	String address;
	long contactNo;
	String ownerName;
	
	public static void main(String a[]){
		
		Restaurant restaurant = new Restaurant();
		restaurant.id = 48654;
		restaurant.name = "Feast";
		restaurant.address = "Dr.Rajkumar rd Malleswaram banglore";
		restaurant.contactNo = 8681475684l;
		restaurant.ownerName = "Vishnu";
		
		System.out.println("The Restaurant id is :"+restaurant.id);
		System.out.println("The Restaurant name is :"+restaurant.name);
		System.out.println("The Restaurant address is :"+restaurant.address);
		System.out.println("The Restaurant contactNo is :"+restaurant.contactNo);
		System.out.println("The Restaurant ownerName is :"+restaurant.ownerName);
		
		Restaurant restaurant1 = new Restaurant();
		restaurant1.id = 785454;
		restaurant1.name = "Cave n Dine";
		restaurant1.address = "Basaveshwar nagar banglore";
		restaurant1.contactNo = 7882895454l;
		restaurant1.ownerName = "Sagar";
		
		System.out.println("The Restaurant id is :"+restaurant1.id);
		System.out.println("The Restaurant name is :"+restaurant1.name);
		System.out.println("The Restaurant address is :"+restaurant1.address);
		System.out.println("The Restaurant contactNo is :"+restaurant1.contactNo);
		System.out.println("The Restaurant ownerName is :"+restaurant1.ownerName);
		
		Restaurant restaurant2 = new Restaurant();
		restaurant2.id = 849744;
		restaurant2.name = "Karavalli";
		restaurant2.address = "Ashok nagar banglore";
		restaurant2.contactNo = 1847171257;
		restaurant2.ownerName = "Nikhil";
		
		System.out.println("The Restaurant id is :"+restaurant2.id);
		System.out.println("The Restaurant name is :"+restaurant2.name);
		System.out.println("The Restaurant address is :"+restaurant2.address);
		System.out.println("The Restaurant contactNo is :"+restaurant2.contactNo);
		System.out.println("The Restaurant ownerName is :"+restaurant2.ownerName);
		
		Restaurant restaurant4 = new Restaurant();
		restaurant4.id = 875445;
		restaurant4.name = "Treat";
		restaurant4.address = "Indiranagar banglore";
		restaurant4.contactNo = 878659824l;
		restaurant4.ownerName = "Sunil";
		
		System.out.println("The Restaurant id is :"+restaurant4.id);
		System.out.println("The Restaurant name is :"+restaurant4.name);
		System.out.println("The Restaurant address is :"+restaurant4.address);
		System.out.println("The Restaurant contactNo is :"+restaurant4.contactNo);
		System.out.println("The Restaurant ownerName is :"+restaurant4.ownerName);
		
		
		
	}
	
	
}