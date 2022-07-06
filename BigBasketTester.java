class BigBasketTester{
     
	 public static void main(String args[]){
	 
	     BigBasket bb = new BigBasket();
		 
		 bb.setStartupName("BIGBASKET");
		 bb.setHeadquarter("Banglore");
		 bb.setIndustry("E-commerce");
		 bb.setFounded("October 2011");
		 
		 System.out.println(bb.getStartupName()+" "+bb.getHeadquarter()+" "+bb.getIndustry()+" "+bb.getFounded());
	 }	 


}