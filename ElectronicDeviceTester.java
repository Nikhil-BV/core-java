class ElectronicDeviceTester{
     public static void main(String a[]){
	   TubeLight1 tl = new TubeLight1();
	    tl. watt = "30W";
	 tl. color = "Snow White";
	 tl. type = "Led";
	 tl. price = 150;
	 tl.toGetLight();
	 
	 System.out.println(tl.watt+" "+tl.color+" "+tl.type+" "+tl.price);
	 }
}