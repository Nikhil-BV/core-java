class Transportation{
   static String transportationType = "Bus";
   int id ;
   int noOfBuses ;
   String transportName ;
   int noOfEmployees ;
    
	public Transportation(int id,int noOfBuses,String transportName,int noOfEmployees){
	      System.out.println("Transportation object created");
		  this.id = id;
		  this.noOfBuses = noOfBuses;
		  this.transportName = transportName;
		  this.noOfEmployees = noOfEmployees;
		 }
		 
		 public Transportation(){
		 }
		 
		 public static void main(String a[]){
		 Transportation transport = new Transportation(4598,50,"SRS",100);
		 System.out.println(transport.id+" "+transport.noOfBuses+" "+transport.transportName+" "+transport.noOfEmployees+" "+Transportation.transportationType);
		 Transportation transport1 = new Transportation(7845,1000,"VRL",2000);
		 System.out.println(transport1.id+" "+transport1.noOfBuses+" "+transport1.transportName+" "+transport.noOfEmployees+" "+Transportation.transportationType);
		 }


}