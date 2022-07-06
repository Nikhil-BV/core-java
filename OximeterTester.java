class OximeterTester{
	public static void main(String a[]){
		
		Oximeter om = new Oximeter();
		om.setBrandName("Zebronics");
		om.setType("Pulse oximeter");
		om.setDevelopedIn(1935);
		om.setOrigin("Germany");
		
		
		System.out.println(om.getBrandName()+"\n"+om.getType()+"\n"+om.getDevelopedIn()+"\n"+om.getOrigin());
		
	}
	
	
}