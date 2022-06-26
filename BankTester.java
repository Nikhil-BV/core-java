class BankTester{
   
   public static void main(String a[]){
       SBI sbi = new SBI();
	   sbi.type = "Public";
	sbi.headQuatres = "Mumbai";
    sbi.noOfEmployees = 2460042;
	sbi.useOfBank();
	
	System.out.println(sbi.type+" "+sbi.headQuatres+" "+sbi.noOfEmployees);
   
   }

}