class WashingMachine{ 
   public static void main (String a[])
  {
 onOrOff();
 onOrOff();   
      static String brand ="IFB";
      static double price =35000.00;
      static String color =" Silver";
      static boolean isConnected;
}

public static void onOrOff(){
System.out.println("invoking onOrOff()");
 if(isConnected == false){
 isConnected = true ;
 System.out.println("Washingmachine is turned Onn...Available for connect");
}
else if (isConnected == true){
isConnected = false ;
System.out.println("Washingmachine is turned off...");
}
System.out.println(" end ");
}

}