class WaterBottle{
   String name;
   int price;
   String color;
   
    public WaterBottle(){
	System.out.println("WaterBottle objected is created");
	}
	
	public WaterBottle(String name,int price,String color){
	this();
	this.name = name;
	this.price = price;
	this.color = color;
	}
	public static void main(String a[]){
	   WaterBottle wb = new WaterBottle("Milton",150,"Black");
	   System.out.println(wb.name+" "+wb.price+" "+wb.color);
	}

}