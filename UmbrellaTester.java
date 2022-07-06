class UmbrellaTester{

     public static void main(String args[]){
		 
	    Umbrella ul = new Umbrella();
         ul.setBrand("Citizen");
         ul.setMaterial("Polyster");
	     ul.setPrice(299.00);
	     ul.setPattern("Solid");
	     ul.setWeigth("250gm");
		 
		 System.out.println(ul.getBrand()+" "+ul.getMaterial()+" "+ul.getPrice()+" "+ul.getPattern()+" "+ul.getWeight());
		 
	   		 
	     
	 }
}