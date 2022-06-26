class LaptopsTester {
     public static void main (String a[]){
	    
		Hp hp = new Hp();
		 hp.screenSize = "15 inches";
	     hp.ssdSize = "512 GB";
	     hp.os = "Windows";
	     hp.color = "Natural Silver";
	     hp.price = 50000;
		 hp.toPlayGame();
		 
		 System.out.println(hp.screenSize+" "+hp.ssdSize+" "+hp.os+" "+hp.color+" "+hp.price);
	 }

}