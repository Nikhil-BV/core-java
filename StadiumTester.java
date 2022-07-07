class StadiumTester{
	
	public static void main(String args[]){
		
		StadiumDTO std = new StadiumDTO();
		std.setName("M.Chinnaswamw Stadium");
		std.setType("Cricket stadium");
		std.setLocation("Bangalore");
		std.setCapacity(40000);
		
		System.out.println(std.getName()+" "+std.getType()+" "+std.getLocation()+" "+std.getCapacity());
		
	}


}