class ShowRoom1{
	//static variables
    static String name = "Woodland";
   static int noOfBranches = 50;
   //instance variables
   int id ;
   String location ;
   long contactNo;
   
   // Parameterized Constuctor
    public ShowRoom1(int id,String location ,long contactNo){
	System.out.println("ShowRoom1 Object created");
	this.id = id ;
	this.location = location;
	this.contactNo = contactNo;
	
	}
	   public ShowRoom1(){
	   }
      //main method starting point
      public static void main(String a[]){
		  
		  //constructor are used to init instance variables of a class
	      ShowRoom1 show = new ShowRoom1(1,"Jayanagara",9546875435l);
	      System.out.println(show.id+"  "+show.location +" "+show.contactNo);
		   ShowRoom1 show1 = new ShowRoom1(2,"vijayanagar",954687543565l);
	      System.out.println(show1.id+"  "+show1.location +" "+show1.contactNo);
		   //show.showRoomId = 1;
		  // show.name = "Woodland";
		  // show.noOfBranches = 50;
		 //  show.location = "Jayanagar";
		 //  show.contactNo = 9546875435l;
		   
		  // System.out.println("The showRoomId is :"+show.showRoomId);
		   //System.out.println("The showRoom name is :"+ShowRoom1.name);
		   //System.out.println("The showRoom branch is :"+ShowRoom1.noOfBranches);
		   //System.out.println("The showRoom location is :"+show.location);
		   //System.out.println("The showRoom contactNo is :"+show.contactNo);
		   
		    /*ShowRoom1 show1 = new ShowRoom1();
		    show1.showRoomId = 2;
		    show1.location = "vijayanagar";
		    show1.contactNo = 95468754353l;
		   
		    System.out.println("The showRoomId is :"+show1.showRoomId);
		    System.out.println("The showRoom name is :"+ShowRoom1.name);
		    System.out.println("The showRoom branch is :"+ShowRoom1.noOfBranches);
		    System.out.println("The showRoom location is :"+show1.location);
		    System.out.println("The showRoom contactNo is :"+show1.contactNo);*/
	     	System.out.println("The showRoom name is :"+ShowRoom1.name);
		    System.out.println("The showRoom branch is :"+ShowRoom1.noOfBranches);
	  
	  }
}