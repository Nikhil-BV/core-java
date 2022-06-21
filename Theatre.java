//class Theatre{

    // static String name;
	// static String address;
	 //static long contactNo;
	 //static String ownerName;
	 //static String runningMovies[]={"charli 777","vikram"};
	 
	 //public static void main (String a[]){
	   //  name="nagalakshmi";
		// address="ig road";
		// contactNo=8915262582l;
		// ownerName="suresh";
		 
		 
		//System.out.println("The theater name is :" +name);
		//System.out.println("The theater address is :" +address);
		//System.out.println("The theater contactNo is :" +contactNo);
	    //System.out.println("The theater ownerName is :" +ownerName);
	    //System.out.println("The theater runningMovies is :" +runningMovies[0]+","+runningMovies[1]);
		 
	 //}

//}


class Theatre{
	public Theatre()
	{
		System.out.println("Theatre objected Created");
	    System.out.println("----------------");
	}
	String name;
	String address;
	long contactNo;
	String ownerName;
	//String []runningMovies={"charli 777","vikram"};
	String []runningMovies = new String[3];
	
  public static void main(String a[]){
	  //className refVariable = new className();
      Theatre theatre = new Theatre();
	     theatre.name = "nagalakshmi";
		 theatre.address = "ig road";
		 theatre.contactNo = 4544484365l;
		 theatre.ownerName ="suresh";
		 theatre.runningMovies[0]= "Vikram";
		 theatre.runningMovies[1]= "Charli 77";
		 theatre.runningMovies[2]= "Om";
		 theatre.getRunningMovies();
		 
		 System.out.println("The theatre name is :"+theatre.name);
		 System.out.println("The theatre address is :"+theatre.address);
		 System.out.println("The theatre contactNo is :"+theatre.contactNo);
		 System.out.println("The theatre ownerName is :"+theatre.ownerName);
		 
		 System.out.println(" The runningMovies are........");

		 
	  Theatre theatre1 = new Theatre();
         theatre1.name = "veeresh";
         theatre1.address ="magadi road";
         theatre1.contactNo = 9659854986l;
         theatre1.ownerName ="ramesh";
		 theatre1.runningMovies[0]= "Om";
		 theatre1.runningMovies[1]= "Vikram";
		 theatre1.runningMovies[2]= "Charli";
		 theatre1.getRunningMovies();	 

         System.out.println("The theatre name is :"+theatre1.name);
		 System.out.println("The theatre address is :"+theatre1.address);
		 System.out.println("The theatre contactNo is :"+theatre1.contactNo);
		 System.out.println("The theatre ownerName is :"+theatre1.ownerName);

        System.out.println(" The runningMovies in theatre1 are........");
		
		 
	 Theatre theatre2 = new Theatre();
         theatre2.name = "sreeleaka"; 
         theatre2.address ="rg road";
         theatre2.contactNo = 32544454;
         theatre2.ownerName ="samesh";
		 theatre2.runningMovies[0]= "Charli";
		 theatre.runningMovies[1]= "Om";
		 theatre.runningMovies[2]= "Vikram";
		 theatre2.getRunningMovies();	 	 

         System.out.println("The theatre name is :"+theatre2.name);
		 System.out.println("The theatre address is :"+theatre2.address);
		 System.out.println("The theatre contactNo is :"+theatre2.contactNo);
		 System.out.println("The theatre ownerName is :"+theatre2.ownerName);

        System.out.println(" The runningMovies in theatre2 are........");
		  	 
  }
     public void getRunningMovies(){
	 for(int z=0 ;z< runningMovies.length;z++){
		 System.out.println(runningMovies[z]);
	 }	
		
	}  
	
	//public void getRunningMovies(){
	// for(int z=0 ;z< runningMovies.length;z++){
		// System.out.println(runningMovies[z]);
	// }	
		
	//}  
	//public void getRunningMovies(){
	// for(int z=0 ;z< runningMovies.length;z++){
	//	 System.out.println(runningMovies[z]);
	 //}	
		
	//}  
    	
}