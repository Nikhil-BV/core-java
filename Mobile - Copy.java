class Mobile{
		public Mobile()
	{
		System.out.println("Mobile objected Created");
	    System.out.println("----------------");
	}
  String brand;
  int modelNo;
  String color;
  int price;
  String processorName;
  
  public static void main(String a[]){
      Mobile mobile = new Mobile();
     mobile.brand = "Mi";
     mobile.modelNo = 15247;
     mobile.color = "Blue";
     mobile.price = 13000;
     mobile.processorName = "Snapdragon 698";

     System.out.println("The Mobile brand name is :"+mobile.brand);	 
	 System.out.println("The Mobile modelNo is :"+mobile.modelNo);
     System.out.println("The Mobile color is :"+mobile.color);
     System.out.println("The Mobile price is :"+mobile.price);
     System.out.println("The Mobile processorName is :"+mobile.processorName);	

      Mobile mobile1 = new Mobile();
     mobile1brand = "Vivo";
     mobile1.modelNo = 485217;
     mobile1.color = "Black";
     mobile1.price = 15000;
     mobile1.processorName = "Snapdragon 888";

     System.out.println("The Mobile brand name is :"+mobile1.brand);	 
	 System.out.println("The Mobile modelNo is :"+mobile1.modelNo);
     System.out.println("The Mobile color is :"+mobile1.color);
     System.out.println("The Mobile price is :"+mobile1.price);
     System.out.println("The Mobile processorName is :"+mobile1.processorName);	 	 

      Mobile mobile2 = new Mobile();
     mobile2.brand = "Samsung";
     mobile2.modelNo = 715486;
     mobile2.color = "Blue";
     mobile2.price = 13000;
     mobile2.processorName = "Exynos 9609";

     System.out.println("The Mobile brand name is :"+mobile2.brand);	 
	 System.out.println("The Mobile modelNo is :"+mobile2.modelNo);
     System.out.println("The Mobile color is :"+mobile2.color);
     System.out.println("The Mobile price is :"+mobile2.price);
     System.out.println("The Mobile processorName is :"+mobile2.processorName);	 	  	 
  }


}