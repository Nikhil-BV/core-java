class CricketTester{
   public static void main(String a[]){
       MSDhoni msd = new MSDhoni();
	msd.place = "Ranchi";
	msd.role =  "Wc and Batsman";
	msd.battingStyle = "Righthand";
	msd.debtYear = 2004;
	msd.getCricket();
	
	System.out.println(msd.place+" "+msd.role+" "+msd.battingStyle+" "+msd.debtYear);
   }
}