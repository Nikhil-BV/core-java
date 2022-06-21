class BankWithdraw{
 static double amount;
// method to get totalAmount
public static void main(String a[]){
System.out.println("Main method started");
 deposit(48455);
  getTotalAmount();
  withdraw(1255);
  withdraw(12500);
 deposit(54655);
 withdraw(1200);
 deposit(1500);
 deposit(154353);
 withdraw(15547);
 withdraw(1554);
 deposit(25000);
 deposit(50000);
 withdraw(500000);
 deposit(15000);
 withdraw(5200);
// invoke total amount
 gettotalamount();
System.out.println("Main method ended");
}
  static void deposit(double amt){
  System.out.println("invoked deposit()");
  System.out.println("Amount to be deposit"+ amt);
  System.out.println("Amount before deposit"+ amount);
   amount=amount+amt;
  System.out.println("Amount after deposit"+amount);
}
    static void withdraw(double amt){
  System.out.println("invoked withdraw()");
  System.out.println("Amount to be withdraw"- amt);
  System.out.println("Amount before withdraw"- amount);
   amount=amount-amt;
  System.out.println("Amount after withdraw"-amount);
  
 static void gettotalamount(doudle amt){
 totalamount=amount
 System.out.println(" gettotalamount");





}