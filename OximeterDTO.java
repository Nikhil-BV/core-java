public class OximeterDTO{
	public OximeterDTO(){
	}
	
         private String brandName;
         private String type;
         private int developedIn;
         private String origin;

     public String getBrandName(){
	  return brandName;
     }
	 
     public void setBrandName(String brandName){ 
	   this.brandName=brandName;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 
	 public void setType(String type){
		 this.type=type;
	 }
	 
	 public int getDevelopedIn(){
		 return developedIn;
	 }
	 
	 public void setDevelopedIn(int developedIn){
		 this.developedIn=developedIn;
	 }
	 
	 public String getOrigin(){
		 return origin;
	 }
	 
	 public void setOrigin(String origin){
		 this.origin=origin;
	 }
	
}