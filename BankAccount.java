class BankAccount{
  double amount ;
 // double balance;
 
 

  public void deposit (double amt){
  System.out.println("invoked deposite()");
  System.out.println("Amount to be deposit"+amt);
  System.out.println("Amount before deposite"+ amount);
     amount = amount+ amt ;
   System.out.println("Amount after deposit "+amount);
   System.out.println("end of deposit()") ;
  }

public void withdraw (double amt){
	System.out.println("invoke withdraw()");
	System.out.println("Amount to be withdraw"+amt);
	System.out.println("Amount before withdraw"+ amount);
	  amount = amount-amt ;
	System.out.println("Amount after withdraw"+amount);
    System.out.println("end of withdraw()");	
}

 public double getBalance(){
	// balance=amount;
	 System.out.println("the total Balance is "+amount);
	 return amount;
 }
 
 public void transfer(double amount,BankAccount other){
	 withdraw(amount);
	 other.deposit(amount);
	 
 }
   

}