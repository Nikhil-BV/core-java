class AccountLogin{
   //method overloading
   public static void main(String a[])
   {
   //invoke login method here
   login(8166514654l) ;
   login ("nikhil12@gmail.com") ;
   }
   
   public static void login(long contactNo)
   {
   
   System.out.println("the contact is:" +contactNo);
   }
   
   public static void login(String email)
   {
   System.out.println("the email is :" +email );
   }



}