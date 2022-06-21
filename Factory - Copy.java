class Factory{
		public Factory()
	{
		System.out.println("Factory objected Created");
	    System.out.println("----------------");
	}
      int id;
	  String name;
	  String location;
	  String ownerName; 
	  int gstNO;
	  
	  public static void main(String a[]){
	      Factory factory = new Factory();
		  factory.id = 78459;
		  factory.name = "Microtech";
		  factory.location = "peenya";
		  factory.ownerName = "Raju";
		  factory.gstNO = 784512;
		  
		  System.out.println("The Factory id is :"+factory.id);
		  System.out.println("The Factory name is :"+factory.name);
		  System.out.println("The Factory location is :"+factory.location);
		  System.out.println("The Factory ownerName is :"+factory.ownerName);
		  System.out.println("The Factory gstNO is :"+factory.gstNO);
		  
		  Factory factory1 = new Factory();
		  factory1.id = 489562;
		  factory1.name = "Delight";
		  factory1.location = "Rajajinarag";
		  factory1.ownerName = "Anand";
		  factory1.gstNO = 1254785;
		  
		  System.out.println("The Factory id is :"+factory1.id);
		  System.out.println("The Factory name is :"+factory1.name);
		  System.out.println("The Factory location is :"+factory1.location);
		  System.out.println("The Factory ownerName is :"+factory1.ownerName);
		  System.out.println("The Factory gstNO is :"+factory1.gstNO);
		  
		  Factory factory2 = new Factory();
		  factory2.id = 789645;
		  factory2.name = "Suraj";
		  factory2.location = "peenya";
		  factory2.ownerName = "Ram";
		  factory2.gstNO = 14628749;
		  
		  System.out.println("The Factory id is :"+factory2.id);
		  System.out.println("The Factory name is :"+factory2.name);
		  System.out.println("The Factory location is :"+factory2.location);
		  System.out.println("The Factory ownerName is :"+factory2.ownerName);
		  System.out.println("The Factory gstNO is :"+factory2.gstNO);
		  
	  }


}