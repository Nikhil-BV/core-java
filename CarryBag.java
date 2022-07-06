public class CarryBag{

     public CarryBag(){
	 
	 }
    //to achieve Encapsulation
      private String name ;
	  private double price ;
	  //private String material ;
	  
	  // getter and setter 
	  
	  public String getName(){
	   	return name;
	  }
	  
	  public void setName(String name){
	     this.name = name ;
	  }
	  
	  public double getPrice(){
	     return price;
	  }
	  
	  public void setPrice(double price){
	     this.price = price;
	  }
	  
	   void holdThings(){
	  System.out.println("help to carry things");
	  }
   
}