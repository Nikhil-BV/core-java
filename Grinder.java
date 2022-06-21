class Grinder{ 
   public static void main (String a[])
  {
 onOrOff();
 onOrOff();   
      static String brand ="bajaj";
      static double price =3500.00;
      static String color ="white";
      static boolean isConnected;
	  static int maxSpeed = 3 ;
	  static int minSpeed;
	  static int currentSpeed;
}

public static void onOrOff(){
System.out.println("invoking onOrOff()");
 if(isConnected == false){
 isConnected = true ;
 System.out.println("Grinder is turned Onn...Available for connect");
}
else if (isConnected == true){
isConnected = false ;
System.out.println("Grinder is turned off...");
}
System.out.println(" end ");
}
 public static void increaseSpeed(){
  System.out.println("increaseSpeed method started");
  if(isConnected==true){
     if(currentSpeed < maxSpeed){
       currentSpeed = currentSpeed +1 ;
         System.out.println("The current Volume is : "+ currentSpeed);
}
  else{ 
System.out.println("Max Speed reached");
}
}
else{
    System.out.println("Gube..Grinder On Maadu");
}
  System.out.println("increaseSpeed method ended");
} 
   
  public static void decreaseSpeed(){
  System.out.println("decreaseSpeed method started");
  if(isConnected==true){
    if(currentSpeed > minSpeed){
     currentSpeed = currentSpeed - 1 ;
      System.out.println("The currentSpeed is : " + currentSpeed);
}
   else{
System.out.println("Min Speed reached");
}
}
 else{
System.out.println("Gube.. Grinder On maadu");
}
System.out.println("decreaseSpeed method ended");
}
    
}