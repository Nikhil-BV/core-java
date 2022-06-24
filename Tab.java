class Tab{
  String brand;
  String os;
  int price;
  String memoryStorage;
  
  public Tab(){
  System.out.println("Tab object is created");
  }
  
  public Tab(String brand,String os,int price,String memoryStorage){
  this();
  this.brand = brand;
  this.os = os;
  this.price = price;
  this.memoryStorage = memoryStorage;
  }
      
	  public static void main(String a[]){
	    Tab t = new Tab("Lenovo","Android",20000,"64GB");
		System.out.println(t.brand+" "+t.os+" "+t.price+" "+t.memoryStorage);
	  }
}