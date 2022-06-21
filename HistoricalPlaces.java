class HistoricalPlaces{
       String name;
	   String location;
	   String openingTime;
	   String closeingTime;
	   
	   public HistoricalPlaces(String name,String location,String openingTime,String closeingTime){
	   System.out.println("HistoricalPlaces object created");
	       this.name = name;
		   this.location = location;
		   this.openingTime = openingTime;
		   this.closeingTime = closeingTime;
	   }
        public HistoricalPlaces(){
		}
		
		public static void main(String a[]){
		HistoricalPlaces hp = new HistoricalPlaces("Chanakeshava temple","Belur","Open8Am","close7Pm");
		System.out.println(hp.name+" "+hp.location+" "+hp.openingTime+" "+hp.closeingTime);
		HistoricalPlaces hp1 = new HistoricalPlaces("Virupaksha temple","Hampi","Open7Am","close6Pm");
		System.out.println(hp1.name+" "+hp1.location+" "+hp1.openingTime+" "+hp1.closeingTime);
		HistoricalPlaces hp2 = new HistoricalPlaces("Badami And Aihole temple","Bagalkot","Open10Am","close6Pm");
		System.out.println(hp2.name+" "+hp2.location+" "+hp2.openingTime+" "+hp2.closeingTime);
		HistoricalPlaces hp3 = new HistoricalPlaces("Hoysaleswara temple","Halebidu","Open8Am","close7Pm");
		System.out.println(hp3.name+" "+hp3.location+" "+hp3.openingTime+" "+hp3.closeingTime);
		
		}
}