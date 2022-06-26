class RumTester{
   public static void main(String a[]){
    
	OldMonk om = new OldMonk();
   om.price = 440.00;
   om.alcoholContent = "47.2%";
   om.quantity = "750ml";
   om.mfgDate = "2 april 2022";
   om.expiry = "Best before 36 month";
   om.toGetKick();
   
    System.out.println(om.price+" "+om.alcoholContent+" "+om.quantity+" "+om.mfgDate+" "+om.expiry);
   }
}