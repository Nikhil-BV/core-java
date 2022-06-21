class Cosmetics{
		public Cosmetics()
	{
		System.out.println("Cosmetics objected Created");
	    System.out.println("----------------");
	}
      int id ;
	  String brand ;
	  int price ;
	  String color ;
	  String type ;
	  
	  public static void main(String a[]){
	    Cosmetics cos = new Cosmetics();
		cos.id = 7845;
		cos.brand ="Beardo";
		cos.price = 700;
		cos.color = "Black";
		cos.type = "Charcola Mask";
		
		System.out.println("The Cosmetics id is:"+cos.id);
		System.out.println("The Cosmetics brand is:"+cos.brand);
		System.out.println("The Cosmetics price is:"+cos.price);
		System.out.println("The Cosmetics color is:"+cos.color);
		System.out.println("The Cosmetics type is:"+cos.type);
		
		Cosmetics cos1 = new Cosmetics();
		cos1.id = 4578;
		cos1.brand ="Nivea";
		cos1.price = 600;
		cos1.color = "White";
		cos1.type = "Men skin Care";
		
		System.out.println("The Cosmetics id is:"+cos1.id);
		System.out.println("The Cosmetics brand is:"+cos1.brand);
		System.out.println("The Cosmetics price is:"+cos1.price);
		System.out.println("The Cosmetics color is:"+cos1.color);
		System.out.println("The Cosmetics type is:"+cos1.type);
		
		Cosmetics cos2 = new Cosmetics();
		cos2.id = 1298;
		cos2.brand ="Garnier";
		cos2.price = 150;
		cos2.color = "White";
		cos2.type = "Face Wash";
		
		System.out.println("The Cosmetics id is:"+cos2.id);
		System.out.println("The Cosmetics brand is:"+cos2.brand);
		System.out.println("The Cosmetics price is:"+cos2.price);
		System.out.println("The Cosmetics color is:"+cos2.color);
		System.out.println("The Cosmetics type is:"+cos2.type);
	  
	  }


}