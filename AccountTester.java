class AccountTester{

   public static void main(String a[]){
   
   SavingsAccount sa = new SavingsAccount(0.3);
   sa.deposit(5000.00);
   sa.withdraw(500.00);
   sa.periodicInterest();
   double amount = sa.getBalance();
   System.out.println("Balance of Existing Account "+ amount);
   
   
   SavingsAccount other = new SavingsAccount(0.3);
   
   sa.transfer(3000,other);
   
   double totalAmount = other.getBalance();
   System.out.println("Balance of other account"+totalAmount);
   
   CurrentAccount ca = new CurrentAccount(2.0,5.0);
   System.out.println("Start of current account method=-=-=-=-=-=");
     ca.deposit(5000);
     ca.withdraw(200);
     ca.deposit(3000);
	 ca.withdraw(400);
	 ca.deposit(6520);
	 ca.withdraw(320);
     ca.deposit(9892);
	 ca.withdraw(101);
	 ca.deposit(5650);
	 ca.withdraw(300);
	 ca.deposit(4580);
	 ca.withdraw(3210);
	 ca.deposit(45000);
	 ca.withdraw(3500);
	 ca.deposit(4800);
     ca.withdraw(600);
	 ca.deposit(450);
     ca.withdraw(35000);
	 ca.deposit(500);
     ca.withdraw(180);
	 ca.deductionOfFee();
	 ca.periodicInterest();
	 ca.getBalance();
   }

}