class MusicPlayerTester{

     public static void main(String args[]){
	 
	     MusicPlayerDTO mp = new MusicPlayerDTO();
		 mp.setBrand("Saregama Carvaan");
		 mp.setColor("Porcelain White");
		 mp.setConnectorType("Bluetooth");
		 mp.setPrice(5990.00);
		 
		 System.out.println(mp.getBrand()+" "+mp.getColor()+" "+mp.getConnectorType()+" "+mp.getPrice());
	 }

}