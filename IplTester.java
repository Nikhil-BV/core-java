class IplTester{

     public static void main(String args[]){
	 
	     Ipl ipl = new Ipl();
		 ipl.setCountries("India");
		 ipl.setAdministrator("BCCI");
		 ipl.setFormat("Twenty20");
		 ipl.setNoOfTeams(10);
		 
		 System.out.println(ipl.getCountries()+" "+ipl.getAdministrator()+" "+ipl.getFormat()+" "+ipl.getNoOfTeams());
	 }



}