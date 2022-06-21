class Atm{
		public Atm()
	{
		System.out.println("Atm objected Created");
	    System.out.println("----------------");
	}
     String branch;
	 int noOfMachine;
	 String type;
	 int id;
	public static void main(String a[]){
	   Atm atm =new Atm();
	   atm.branch = "SBI Rajajinagar Banglore";
	   atm.noOfMachine = 1;
	   atm.type = "Withdraw";
	   atm.id = 7845;
	   
	   System.out.println("The atm branch is :"+atm.branch);
	   System.out.println("The noOfMachine in atm are :"+atm.noOfMachine);
	   System.out.println("The atm type is :"+atm.type);
	   System.out.println("The atm id is :"+atm.id);
	   
	   	   Atm atm1 =new Atm();
	   atm1.branch = "Canara vijayanagar Banglore";
	   atm1.noOfMachine = 2;
	   atm1.type = "Withdraw and Deposit";
	   atm1.id = 1245;
	   
	   System.out.println("The atm branch is :"+atm1.branch);
	   System.out.println("The noOfMachine in atm are :"+atm1.noOfMachine);
	   System.out.println("The atm type is :"+atm1.type);
	    System.out.println("The atm id is :"+atm1.id);
	   
	   	   Atm atm2 =new Atm();
	   atm2.branch = "SBI Nandini layout Banglore";
	   atm2.noOfMachine = 1;
	   atm2.type = "Withdraw";
	   atm2.id = 7865;
	   
	   System.out.println("The atm branch is :"+atm2.branch);
	   System.out.println("The noOfMachine in atm are :"+atm2.noOfMachine);
	   System.out.println("The atm type is :"+atm2.type);
	    System.out.println("The atm id is :"+atm2.id);
	   
	   	   Atm atm3 =new Atm();
	   atm3.branch = "Union maruthi mandira Banglore";
	   atm3.noOfMachine = 1;
	   atm3.type = "Deposit";
	   atm3.id = 9564;
	   
	   System.out.println("The atm branch is :"+atm3.branch);
	   System.out.println("The noOfMachine in atm are :"+atm3.noOfMachine);
	   System.out.println("The atm type is :"+atm3.type);
	    System.out.println("The atm id is :"+atm3.id);
	
	}  

}