class TV{ 
  {
    
      static String brand ="sony";
      static double price =150000.00;
      static String color =" black";
      static boolean isConnected;
	     public static void main (String a[])
   
   {
	   System.out.println("the brand name is :"+brand);
	    System.out.println("the price is :"+price);
		 System.out.println("the color is :"+color);
		  System.out.println(" isConnected :"+isConnected);
		  onOrOff();
		  onOrOff();
		  increaseVolume();
		  increaseVolume();
		  increaseVolume();
		  increaseVolume();
		  decreaseVolume();
		  decreaseVolume();
		  decreaseVolume();
   }
		  
		  
 public static void onOrOff(){
System.out.println("invoking onOrOff()");
 if(isConnected == false){
 isConnected = true ;
 System.out.println("TV is turned Onn...Available for connect");
}
else if (isConnected == true){
isConnected = false ;
System.out.println("TV is turned off...");
}
System.out.println(" end ");
}
 public static void increaseVolume(){
  System.out.println("increaseVolume method started");
  if(isConnected==true){
     if(currentVolume < maxVolume){
       currentVolume = currentVolume +1 ;
         System.out.println("The current Volume is : "+ currentVolume);
}
  else{ 
System.out.println("Max Volume reached");
}
}
else{
    System.out.println("Gube. .TV On Maadu");
}
  System.out.println("increaseVolume method ended");
} 
   
  public static void decreaseVolume(){
  System.out.println("decreaseVolume method started");
  if(isConnected==true){
    if(currentVolume > minVolume){
     currentVolume = currentVolume - 1 ;
      System.out.println("The current volume is : " + currentVolume);
}
   else{
System.out.println("Min Volume reached");
}
}
 else{
System.out.println("Gube.. TV On maadu");
}
System.out.println("decreaseVolume method ended");
}
    
}