public class StadiumDTO{
   
   public StadiumDTO(){
	   
   }
   
   private String name;
   private String type;
   private String location;
   private int capacity;              
   
   public String getName(){
	   return name;
   }
   
   public void setName(String name){
	   this.name = name;
   }
   
   public String getType(){
	   return type;
   }
   
   public void setType(String type){
	   this.type = type;
   }
   
   public String getLocation(){
       return location;	
   }
   
   public void setLocation(String location){
	   this.location = location;
   }
   
   public int getCapacity(){
	   return capacity;
   }
   
   public void setCapacity(int capacity){
	   this.capacity = capacity;
   }

}