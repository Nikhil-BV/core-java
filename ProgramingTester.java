class ProgramingTester{
  public static void main(String a[]){
      Java java = new Java();
   java. founder = "James Golsang";
   java. type = "Platform Dependent";
   java. ownedBy = "oracle";
   java. yearOfOrigin = 1995;
   java. toDevelope();
   
   System.out.println(java.founder+" "+java.type+" "+java.ownedBy+" "+java.yearOfOrigin);
  }
}