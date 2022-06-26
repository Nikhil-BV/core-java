class ManufactureCompanyTester{
    
	public static void main(String a[]){
	   TSM tsm = new TSM();
	   tsm.type = "Semiconductor manufacture";
	   tsm.noOfEmployees = 500;
	   tsm.location = "Kengeri";
	   tsm.typeOfCompany();
	   
	   System.out.println(tsm.type+" "+tsm.noOfEmployees+" "+tsm.location);
	   
	}
}