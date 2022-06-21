class AC{ 
      static String brand ="LG";
      static double price =25000.00;
      static String color =" red";
      static boolean isTurned;
      static int maxTemp = 30 ;
      static int minTemp;
      static int currentTemp;
   public static void main (String a[])
  {
 onOrOff();
increaseTemp();
increaseTemp();
increaseTemp();
increaseTemp();
increaseTemp();
increaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
 onOrOff();   
}
 
public static void onOrOff(){
System.out.println("invoking onOrOff()");
 if(isTurned == false){
 isTurned = true ;
 System.out.println("AC is turned Onn...Available for connect");
}
else if (isTurned == true){
isTurned = false ;
System.out.println("AC is turned off...");
}
 public static void increaseTemp(){
  System.out.println("increaseTemp method started");
  if(isConnected==true){
     if(currentTemp < maxTemp){
       currentTemp = currentTemp +1 ;
         System.out.println("The currentTemp is : "+ currentTemp);
}
  else{ 
System.out.println("Max Temp reached");
}
}
else{
    System.out.println("Gube. .AC On Maadu");
}
  System.out.println("increaseTemp method ended");
} 
   
  public static void decreaseTemp(){
  System.out.println("decreaseTemp method started");
  if(isConnected==true){
    if(currentTemp > mintemp
     currentTemp = currentTemp - 1 ;
      System.out.println("The current Temp is : " + currentTemp);
}
   else{
System.out.println("Min Temp reached");
}
}
 else{
System.out.println("Gube.. AC On maadu");
}
System.out.println("decreaseTemp method ended");
}
    
}

