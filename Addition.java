class Addition
// method overloading type
{
public static void main (String a[])
{
// invoking a method
  int finalResult=add(27,12);
  System.out.println(finalResult);
  int finalResult1= add(97,27,35);
  System.out.println(finalResult1);
  int finalResult2=add(12,97,54,84);
  System.out.println(finalResult2);
}
// method declaration
       public static int add(int a,int b)
{
   return a+b;
} 
       public static int add(int a,int b,int c)
	   {
		   return a+b+c;
	   }
	   
	   public static int add(int a,int b,int c,int d)
	   {
		   return a+b+c+d ;
	   }
}