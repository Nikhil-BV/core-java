class ShoppingMall{
		public ShoppingMall()
	{
		System.out.println("ShoppingMall objected Created");
	    System.out.println("----------------");
	}
     String name;
	 String address;
	 int noOfEmployees;
	 String openingTime;
	 String closingTime;
	 int id;
	 
	 public static void main(String a[]){
	 ShoppingMall mall = new ShoppingMall();
	    mall.name = "Lulu";
		mall.address = "Rajajinagar";
		mall.noOfEmployees = 300;
		mall.openingTime = " morning10Am";
		mall.closingTime = "closingTime10pm";
		mall.id = 784484;
		
		System.out.println("The name of mall is :"+mall.name);
		System.out.println("The address of mall is :"+mall.address);
		System.out.println("The noOfEmployees in mall is :"+mall.noOfEmployees);
		System.out.println("The openingTime of mall is :"+mall.openingTime);
		System.out.println("The closingTime of mall is :"+mall.closingTime);
		System.out.println("The mall id is :"+mall.id);
		
		ShoppingMall mall1 = new ShoppingMall();
	    mall1.name = "Orion";
		mall1.address = "Yesvanthpura";
		mall1.noOfEmployees = 200;
		mall1.openingTime = " morning10Am";
		mall1.closingTime = "closingTime10pm";
		mall1.id = 784484;
		
		System.out.println("The name of mall is :"+mall1.name);
		System.out.println("The address of mall is :"+mall1.address);
		System.out.println("The noOfEmployees in mall is :"+mall1.noOfEmployees);
		System.out.println("The openingTime of mall is :"+mall1.openingTime);
		System.out.println("The closingTime of mall is :"+mall1.closingTime);
	    System.out.println("The mall id is :"+mall1.id);
		
		ShoppingMall mall2 = new ShoppingMall();
	    mall2.name = "Mantri Square";
		mall2.address = "Malleshwaram";
		mall2.noOfEmployees = 400;
		mall2.openingTime = " morning10Am";
		mall2.closingTime = "closingTime10pm";
		mall2.id = 784484;
		
		System.out.println("The name of mall is :"+mall2.name);
		System.out.println("The address of mall is :"+mall2.address);
		System.out.println("The noOfEmployees in mall is :"+mall2.noOfEmployees);
		System.out.println("The openingTime of mall is :"+mall2.openingTime);
		System.out.println("The closingTime of mall is :"+mall2.closingTime);
	    System.out.println("The mall id is :"+mall2.id);
		
		
	 
	 }


}