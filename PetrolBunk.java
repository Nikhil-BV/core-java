class PetrolBunk{
     static int petrolPrice = 100;
	 static int dieselPrice = 80;
     String name;
	 int gstNo;
	 int noOfEmployees;
	 int noOfPump;
	 
	 public PetrolBunk(String name,int gstNo,int noOfEmployees,int noOfPump){
	 System.out.println("PetrolBunk object created");
	 this.name = name;
	 this.gstNo = gstNo;
	 this.noOfEmployees = noOfEmployees;
	 this.noOfPump = noOfPump;
	 }
	 public PetrolBunk(){
	 }
	 
	 public static void main(String a[]){
	 PetrolBunk petrol = new PetrolBunk("HP",126597,12,6);
	 System.out.println(petrol.name+" "+petrol.gstNo+" "+petrol.noOfEmployees+" "+petrol.noOfPump+" "+PetrolBunk.petrolPrice+" "+PetrolBunk.dieselPrice);
	 PetrolBunk petrol1 = new PetrolBunk("Indian",548746,15,4);
	 System.out.println(petrol1.name+" "+petrol1.gstNo+" "+petrol1.noOfEmployees+" "+petrol1.noOfPump+" "+PetrolBunk.petrolPrice+" "+PetrolBunk.dieselPrice);
	 PetrolBunk petrol2 = new PetrolBunk("Shell",48454,20,8);
	 System.out.println(petrol2.name+" "+petrol2.gstNo+" "+petrol2.noOfEmployees+" "+petrol2.noOfPump+" "+PetrolBunk.petrolPrice+" "+PetrolBunk.dieselPrice);
	 }


}