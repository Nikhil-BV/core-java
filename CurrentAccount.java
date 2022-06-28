class CurrentAccount extends BankAccount{
   
   double interestRate;
   int freeTransactions = 10;
   int transactrionCount;
   double transactrionFee;
   double totalTransactionFee;
   
   public CurrentAccount(double interestRate,double transactrionFee)
   {
	   
	   this.interestRate = interestRate;
	   this.transactrionFee = transactrionFee;
   }
   
     public void deposit (double amt){
  System.out.println("invoked deposite()");
  System.out.println("Amount to be deposit"+amt);
  System.out.println("Amount before deposite"+ amount);
     amount = amount+ amt ;
   System.out.println("Amount after deposit "+amount);
   System.out.println("end of deposit()") ;
   transactrionCount++;
  }
  

    public void withdraw (double amt){
	System.out.println("invoke withdraw()");
	System.out.println("Amount to be withdraw"+amt);
	System.out.println("Amount before withdraw"+ amount);
	  amount = amount-amt ;
	  if (amount<=0){
		  System.out.println("insufficient balance");
	  }
	  else{
		  System.out.println(amount);
	  }
	System.out.println("Amount after withdraw"+amount);
    System.out.println("end of withdraw()");	
	transactrionCount++;	
}
public double getBalance(){
	System.out.println("Total amount in account is:"+ amount);
	
	return amount;
}

   
   public double deductionOfFee(){
	   double totalTransactionFee = 0;
	   
          if(transactrionCount > freeTransactions){
			  totalTransactionFee = transactrionFee * (transactrionCount - freeTransactions);
			  amount = amount-totalTransactionFee;
			  System.out.println("The transactrion Fee is "+totalTransactionFee);
			  System.out.println("The balance amount after deduction Of transactrion Fees is "+amount);
		  }
		  else{
			  getBalance();
		  }
		  
		return totalTransactionFee;
   }

    public double periodicInterest(){
   double interest = getBalance() * interestRate/100 ;
         deposit(interest);
		 return interest;
		  
	
   }

}