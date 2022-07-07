public class MusicPlayerDTO{
    
	public MusicPlayerDTO(){
	}
	
	private String brand;
	private String color;
	private String connectorType;
	private double price;
	
	public String getBrand(){
		return brand;
	}
	
	public void setBrand(String brand){
		this.brand = brand ;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getConnectorType(){
		return connectorType;
	}
	
	public void setConnectorType(String connectorType){
		this.connectorType = connectorType;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}


}