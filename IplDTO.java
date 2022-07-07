public class IplDTO{

    public IplDTO(){
	}
	
	private String countries;
	private String administrator;
	private String format;
	private int noOfTeams;
	
	public String getCountries(){
		return countries;
	}
	
	public void setCountries(String countries){
		this.countries = countries ;
	}
	
	public String getAdministrator(){
		return administrator;
	}
	
	public void setAdministrator(String administrator){
		this.administrator = administrator;
	}
	
	public String getFormat(){
		return format;
	}
	
	public void setFormat(String format){
		this.format = format;
	}
	
	public int getNoOfTeams(){
		return noOfTeams;
	}
	
	public void setNoOfTeams(int noOfTeams){
		this.noOfTeams = noOfTeams;
	}
}