class MobileCompanyTester{
      public static void main(String a[]){
	    Mi mi = new Mi();
	  mi.ram = "4GB";
	  mi.processor = "Snapdragon 658";
	  mi.battery = "5000mah";
	  mi.price = 15000;
	  mi.toConnect();
	  
	  System.out.println(mi.ram+" "+mi.processor+" "+mi.battery+" "+mi.price);
	  }
}