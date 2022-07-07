public class BigBasketDTO{
      
	   public BigBasketDTO(){
	   }
	   
	   private String startupName;
	   private String headquarter;
	   private String industry;
	   private String founded;
	   
	public String getStartupName(){
		return startupName;
	}
	
	public void setStartupName(String startupName){
		this.startupName = startupName ;
	}
	
	public String getHeadquarter(){
		return headquarter;
	}
	
	public void setHeadquarter(String headquarter){
		this.headquarter = headquarter;
	}
	
	public String getIndustry(){
		return industry;
	}
	
	public void setIndustry(String industry){
		this.industry = industry;
	}
	
	public String getFounded(){
		return founded;
	}
	
	public void setFounded(String founded){
		this.founded = founded;
	}


}