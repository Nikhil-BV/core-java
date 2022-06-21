class BankAccount{
 static double amount ;

 public static void main(String a[]){
 System.out.println("main method started") ;
 deposit(8435) ;
 // invoke withDraw()
  deposit(56551);
  withdraw(1000);
  withdraw(500);
  deposit(50000);
  withdraw(15000);
 System.out.println("main method ended");
}

  static void deposit (double amt){
  System.out.println("invoked deposite()");
  System.out.println("Amount to be deposit"+amt);
  System.out.println("Amount before deposite"+ amount);
     amount = amount+ amt ;
   System.out.println("Amount after deposit "+amount);
   System.out.println("end of deposit()") ;
  }

static void withdraw (double amt){
	System.out.println("invoke withdraw()");
	System.out.println("Amount to be withdraw"+amt);
	System.out.println("Amount before withdraw"+ amount);
	  amount = amount-amt ;
	System.out.println("Amount after withdraw"+amount);
    System.out.println("end of withdraw()");	
}
   

}