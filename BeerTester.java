class BeerTester{
   public static void main(String a[]){
    
	Budweiser bw = new Budweiser();
   bw.price = 190.00;
   bw.alcoholContent = "7.2%";
   bw.quantity = "750ml";
   bw.mfgDate = "12 april 2022";
   bw.expiry = "Best before 36 month";
   bw.toGetKick();
   
    System.out.println(bw.price+" "+bw.alcoholContent+" "+bw.quantity+" "+bw.mfgDate+" "+bw.expiry);
   }
}