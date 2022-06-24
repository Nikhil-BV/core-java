class Trimmer{
     String brand;
	 String material;
	 String color;
	 String weight;
	 int price;
	 
	 public Trimmer(){
	 System.out.println("Trimmer object is created");
	 }
	 
	 public Trimmer(String brand,String material,String color,String weight,int price){
	 this();
	 this.brand = brand;
	 this.material = material;
	 this.color = color;
	 this.weight = weight;
	 this.price = price;
	 }
	 
	 public static void main(String a[]){
	   Trimmer tr = new Trimmer("Philips","Taianium","Grey and Black","0.24Kg",2000);
	   System.out.println(tr.brand+" "+tr.material+" "+tr.color+" "+tr.weight+" "+tr.price);
	 }

}