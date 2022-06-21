{]class Substraction
{
public static void main(String a[])
{
   int finalValue = sub(98,12);
   System.out.println(finalValue);
   int finalValue1 = sub(67,25,54);
   System.out.println(finalValue1);
   int finalValue2 = sub(46,12,12,45);
   System.out.println(finalValue2);
}
public static int sub(int a,int b)
{
  return a-b;
}
public static int sub(int a,int b,int c)
{
 return a-b-c;	
}
public static int sub(int a,int b,int c,int d)
{
 return a-b-c-d;	
}

}