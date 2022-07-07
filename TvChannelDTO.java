public class TvChannelDTO{
	
	public TvChannelDTO(){
	}
	
	   private String brand;
	   private String availableChannels;
	   private int monthlyCharges;
	
	   public String getBrand(){
		   return brand;
	     }
		 
	   public void setBrand(String brand){
		  this.brand = brand;
	     }
		 
	   public String getAvailableChannels(){
		  return availableChannels;
	    }
		
	  public void setAvailableChannels(String availableChannels){
		   this.availableChannels = availableChannels;
	    }
		
	  public int getMonthlyCharges(){
	     	return monthlyCharges;
	     }
	  
	  public void setMonthlyCharges(int monthlyCharges){
		    this.monthlyCharges = monthlyCharges;
	    }

}