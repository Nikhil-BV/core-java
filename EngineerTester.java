class EngineerTester{

     public static void main(String a[]){
	 
	 CivilEngg cv = new CivilEngg();
	 cv.problemSloving();
	 System.out.println("=-=-=-=-=-=-=-=-=");
	 
	 CsEngg cs = new CsEngg();
	 cs.problemSloving();
	 System.out.println("=-=-=-=-=-=-=-=-=");
	 
	 ECEEngg ec = new ECEEngg();
	 ec.problemSloving();
	 System.out.println("=-=-=-=-=-=-=-=-=");
	 
	 EeEngg ee = new EeEngg();
	 ee.problemSloving();
	 System.out.println("=-=-=-=-=-=-=-=-=");
	 
	 MECHEngg mech = new MECHEngg();
	 mech.problemSloving();
	 System.out.println("=-=-=-=-=-=-=-=-=");
	 
	 AIEngg ai = new AIEngg();
	 ai.problemSloving();
	 
	 
	 }
}