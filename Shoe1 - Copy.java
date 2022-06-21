class Shoe{
		public Shoe()
	{
		System.out.println("Shoe objected Created");
	    System.out.println("----------------");
	}
     String brandName;
	 int price;
	 int id;
	 String color;
	 String type;
	
	 
	 public static void main(String a[]){
	  Shoe shoe = new Shoe();
	  shoe.brandName = "Puma";
	  shoe.price = 4000;
	  shoe.id = 8745;
	  shoe.color = "red";
	  shoe.type = "Causal";
	  
	  System.out.println("The shoe brand name is :"+shoe.brandName);
	  System.out.println("The shoe price is :" +shoe.price);
	  System.out.println("The shoe id is :"+shoe.id);
	  System.out.println("The shoe color is :" +shoe.color);
	  System.out.println("The shoe type is :"+shoe.type);
	 
	  Shoe shoe1 = new Shoe();
	  shoe1.brandName = "Nike";
	  shoe1.price = 6000;
	  shoe1.id = 9875;
	  shoe1.color = "black";
	  shoe1.type = "Sneakers";
	  
	  System.out.println("The shoe brand name is :"+shoe1.brandName);
	  System.out.println("The shoe price is :"+shoe1.price);
	  System.out.println("The shoe id is :"+shoe1.id);
	  System.out.println("The shoe color is :"+shoe1.color);
	  System.out.println("The shoe type is :"+shoe1.type);
	  
	  
	  Shoe shoe2 = new Shoe();
	  shoe2.brandName = "Addidas";
	  shoe2.price = 4000;
	  shoe2.id = 1298;
	  shoe2.color = "White";
	  shoe2.type = "Running shoe";
	  
	  System.out.println("The shoe brand name is :"+shoe2.brandName);
	  System.out.println("The shoe price is :"+shoe2.price);
	  System.out.println("The shoe id is :"+shoe2.id);
	  System.out.println("The shoe color is :"+shoe2.color);
	  System.out.println("The shoe type is :"+shoe2.type);
	   
	  Shoe shoe3 = new Shoe();
	  shoe3.brandName = "Wild craft";
	  shoe3.price = 3000;
	  shoe3.id = 2678;
	  shoe3.color = "Blue";
	  shoe3.type = "Causal";
	  
	  System.out.println("The shoe brand name is :"+shoe3.brandName);
	  System.out.println("The shoe price is :"+shoe3.price);
	  System.out.println("The shoe id is :"+shoe3.id);
	  System.out.println("The shoe color is :"+shoe3.color);
	  System.out.println("The shoe type is :"+shoe3.type);
	  
	 
	 
	 }


}