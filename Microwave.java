class Microwave{ 
   public static void main (String a[])
  {
 onOrOff();
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
 onOrOff();   
      static String brand ="IFB";
      static double price =15000.00;
      static String color ="Black";
      static boolean isConnected;
	  static int maxTemp = 5;
	  static int minTemp;
	  static int currentTemp;
}

public static void onOrOff(){
System.out.println("invoking onOrOff()");
 if(isConnected == false){
 isConnected = true ;
 System.out.println("Microwave is turned Onn...Available for connect");
}
else if (isConnected == true){
isConnected = false ;
System.out.println("Microwave is turned off...");
}
System.out.println(" end ");
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

