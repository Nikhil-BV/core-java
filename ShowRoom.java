class ShowRoom{
		public ShowRoom()
	{
		System.out.println("ShowRoom objected Created");
	    System.out.println("----------------");
	}
    String name;
	String address;
	long contactNo;
	int noOfEmployees;
	int id;
	String ownerName;
	
	
  public static void main(String a[]){
	  //className refVariable = new className();
      ShowRoom showroom = new ShowRoom();
	     showroom.name = "Indian Garage";
		 showroom.noOfEmployees = 56;
		 showroom.id = 8754;
		 showroom.address = "Yeswanthpur Bengaluru";
		 showroom.contactNo = 4544484365l;
		 showroom.ownerName ="suresh";
		 
		 System.out.println("The showroom name is :"+showroom.name);
		 System.out.println("The no of employees in showroom are :"+showroom.noOfEmployees);
		 System.out.println("The showroom id is ;"+showroom.id);
		 System.out.println("The showroom address is :"+showroom.address);
		 System.out.println("The showroom contactNo is :"+showroom.contactNo);
	   	 System.out.println("The showroom ownerName is :"+showroom.ownerName);
		 
	   ShowRoom showroom1 = new ShowRoom();	 
         showroom1.name = "KTM Langford";
		 showroom1.noOfEmployees = 16;
		 showroom1.id = 9854;
		 showroom1.address = "Langford rd Bengaluru";
		 showroom1.contactNo = 87544484365l;
		 showroom1.ownerName ="Ramesh";
		 
		 System.out.println("The showroom name is :"+showroom1.name);
		 System.out.println("The no of employees in showroom are :"+showroom1.noOfEmployees);
		 System.out.println("The showroom id is ;"+showroom1.id);
		 System.out.println("The showroom address is :"+showroom1.address);
		 System.out.println("The showroom contactNo is :"+showroom1.contactNo);
		 System.out.println("The showroom ownerName is :"+showroom1.ownerName);
		 
      ShowRoom showroom2 = new ShowRoom();    	 
		 showroom2.name = "Magnum Honda";
		 showroom2.noOfEmployees = 20;
		 showroom2.id = 5454;
		 showroom2.address = "Kanakapura Bengaluru";
		 showroom2.contactNo = 487784365l;
		 showroom2.ownerName ="satish";
		 
		 System.out.println("The showroom name is :"+showroom2.name);
		 System.out.println("The no of employees in showroom are :"+showroom2.noOfEmployees);
		 System.out.println("The showroom id is ;"+showroom2.id);
		 System.out.println("The showroom address is :"+showroom2.address);
		 System.out.println("The showroom contactNo is :"+showroom2.contactNo);
		 System.out.println("The showroom ownerName is :"+showroom2.ownerName);	 
  }
    
    	
}