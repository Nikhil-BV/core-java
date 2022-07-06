class AirportTester{
    
	  public static void main (String args[]){
	        
			Airport air = new Airport();
			
			air.setName("Kempegowda international Airport");
			air.setLocation("Bangalore");
			air.setType("International");
			air.setOperator("Bangalore International Airport Limited");
			
			System.out.println(air.getName()+" "+air.getLocation()+" "+air.getType()+" "+air.getOperator());
	  
	  }

}