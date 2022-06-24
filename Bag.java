class Bag{
    String brandName;
	int price;
	String color;
	
	public Bag(){
	System.out.println("Bag object is created");
	}
	
	public Bag(String brandName,int price,String color){
	this();
	this.brandName = brandName;
	this.price = price;
	this.color = color;
	}
    
	 public static void main (String a[]){
	 Bag b = new Bag("WildCraft",2000,"Blue");
     System.out.println(b.brandName+" "+b.price+" "+b.color);	 
	}
}