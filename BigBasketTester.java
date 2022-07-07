class BigBasketTester{
     
	 public static void main(String args[]){
	 
	     BigBasketDTO bb = new BigBasketDTO();
		 
		 bb.setStartupName("BIGBASKET");
		 bb.setHeadquarter("Banglore");
		 bb.setIndustry("E-commerce");
		 bb.setFounded("October 2011");
		 
		 System.out.println(bb.getStartupName()+" "+bb.getHeadquarter()+" "+bb.getIndustry()+" "+bb.getFounded());
	 }	 


}