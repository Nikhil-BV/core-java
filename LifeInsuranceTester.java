class LifeInsuranceTester{
   public static void main(String a[]){
   
       LIC lic = new LIC();
	   lic.noOfUsers = 500000;
	   lic.policyAmount = 1300;
	   lic.returnYear = 10;
	   lic.getInsurance();
	   
	   System.out.println(lic.noOfUsers+" "+lic.policyAmount+" "+lic.returnYear);
   }
   
}