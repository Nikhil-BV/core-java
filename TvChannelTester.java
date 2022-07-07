class TvChannelTester{
   
            public static void main(String a[]){
		           TvChannelDTO tv = new TvChannelDTO();
		           tv.setBrand("SunDirect");
				   tv.setAvailableChannels("all kannada and Hindhi channels");
				   tv.setMonthlyCharges(260);
				   
				   
		System.out.println(tv.getBrand()+" "+tv.getAvailableChannels()+" "+tv.getMonthlyCharges());
	}



}