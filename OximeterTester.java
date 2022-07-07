class OximeterTester{
	public static void main(String a[]){
		
		OximeterDTO om = new OximeterDTO();
		om.setBrandName("Zebronics");
		om.setType("Pulse oximeter");
		om.setDevelopedIn(1935);
		om.setOrigin("Germany");
		
		
		System.out.println(om.getBrandName()+"\n"+om.getType()+"\n"+om.getDevelopedIn()+"\n"+om.getOrigin());
		
	}
	
	
}