class SoftwareCompanyTester{
  
   public static void main(String a[]){
       Infosys info = new Infosys();
	     info.location = "Electronic City";
         info.noOfEmployees = 1500;
         info.turnOver = "1500Cr";
         info.founder = "Narayana Murthy";
		 info.getCompany();
		 
		 System.out.println(info.location+" "+info.noOfEmployees+" "+info.turnOver+" "+info.founder);
		 
   }
}