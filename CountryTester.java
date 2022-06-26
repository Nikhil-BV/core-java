class CountryTester{
     public static void main(String a[]){
	    India in = new India();
		in.capital = "Delhi";
	    in.largestCity = "Mumbai";
	    in.currency = "Rupee";
	    in.population = 1352642280l;
		in.getInformation();
		
		System.out.println(in.capital+" "+in.largestCity+" "+in.currency+" "+in.population);
	 }

}