class CarryBagTester{

   public static void main(String args[]){
   
       CarryBag carry = new CarryBag();
	   //carry.name = "Jingalala carrybags";
	   //carry.price = 5;
	   
	   carry.setName("Jingalala carrybags");
	   carry.setPrice(5.0);
	   
	   System.out.println(carry.getName()+" "+carry.getPrice());
	   
	     carry.holdThings();
	   
   }


}