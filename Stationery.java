class Stationery{
		public Stationery()
	{
		System.out.println("Stationery objected Created");
	    System.out.println("----------------");
	}
   String name;
   String location;
   int id;
   String type;
   String openingTime;
   String colseingTime;
   
   public static void main(String a[]){
      Stationery shop = new Stationery();
	    shop.name = "Shreya";
		shop.location = "Rajajinagar";
		shop.id = 788654;
		shop.type = "Xerox";
		shop.openingTime = "Morning9am";
		shop.colseingTime = "night9pm";
		
		System.out.println("The shop name is :"+shop.name);
		System.out.println("The shop location is :"+shop.location);
		System.out.println("The shop id is :"+shop.id);
		System.out.println("The shop type is :"+shop.type);
		System.out.println("The shop openingTime is :"+shop.openingTime);
		System.out.println("The shop colseingTime is :"+shop.colseingTime);
		
	  Stationery shop1 = new Stationery();
	    shop1.name = "Sunil";
		shop1.location = "Nagarabhavi";
		shop1.id = 145899;
		shop1.type = "Book";
		shop1.openingTime = "Morning10am";
		shop1.colseingTime = "night9pm";
		
		System.out.println("The shop name is :"+shop1.name);
		System.out.println("The shop location is :"+shop1.location);
		System.out.println("The shop id is :"+shop1.id);
		System.out.println("The shop type is :"+shop1.type);
		System.out.println("The shop openingTime is :"+shop1.openingTime);
		System.out.println("The shop colseingTime is :"+shop1.colseingTime);
		
	  Stationery shop2 = new Stationery();
	    shop2.name = "Sneha";
		shop2.location = "Nandini layout";
		shop2.id = 548759;
		shop2.type = "Gift";
		shop2.openingTime = "Morning11am";
		shop2.colseingTime = "night10pm";
		
		System.out.println("The shop name is :"+shop2.name);
		System.out.println("The shop location is :"+shop2.location);
		System.out.println("The shop id is :"+shop2.id);
		System.out.println("The shop type is :"+shop2.type);
		System.out.println("The shop openingTime is :"+shop2.openingTime);
		System.out.println("The shop colseingTime is :"+shop2.colseingTime);
   }


}