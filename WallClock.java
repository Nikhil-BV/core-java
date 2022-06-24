class WallClock{
   String brand;
   String color;
   int price;
   
   public WallClock(){
   System.out.println("WallClock objected is created");
   }
    
	 public WallClock(String brand,String color,int price){
	 this();
	 this.brand = brand;
	 this.color = color;
	 this.price = price;
	 }
	 
	 public static void main(String a[]){
	   WallClock wc = new WallClock("Ajanta","White",450);
	   System.out.println(wc.brand+" "+wc.color+" "+wc.price);
	 }
}