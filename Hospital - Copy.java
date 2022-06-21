class Hospital{
		public Hospital()
	{
		System.out.println("Hospital objected Created");
	    System.out.println("----------------");
	}
   int id ;
   String name ;
   String location ;
   String type ;
   int noOfDoctors ;
   
   public static void main(String a[]){
   
      Hospital hospital = new Hospital();
	    hospital.id = 489643;
		hospital.name = "Ananya";
		hospital.location = "Rajajinagar Banglore";
		hospital.type = "Orthopidic";
		hospital.noOfDoctors = 5;
		
        System.out.println("The Hospital id is:"+hospital.id);
		System.out.println("The Hospital name is:"+hospital.name);
		System.out.println("The Hospital location is:"+hospital.location);
        System.out.println("The Hospital type is:"+hospital.type);
        System.out.println("The No Of doctors in Hospital are :"+hospital.noOfDoctors);

      Hospital hospital1 = new Hospital();
	    hospital1.id = 658848;
		hospital1.name = "manipal";
		hospital1.location = "Yeshwanthpura Banglore";
		hospital1.type = "General";
		hospital1.noOfDoctors = 15;
		
        System.out.println("The Hospital id is:"+hospital1.id);
		System.out.println("The Hospital name is:"+hospital1.name);
		System.out.println("The Hospital location is:"+hospital1.location);
        System.out.println("The Hospital type is:"+hospital1.type);
        System.out.println("The No Of doctors in Hospital are :"+hospital1.noOfDoctors);

     Hospital hospital2 = new Hospital();
	    hospital2.id = 783651;
		hospital2.name = "Fortis";
		hospital2.location = "Rajajinagar Banglore";
		hospital2.type = "Covid";
		hospital2.noOfDoctors = 10;
		
        System.out.println("The Hospital id is:"+hospital2.id);
		System.out.println("The Hospital name is:"+hospital2.name);
		System.out.println("The Hospital location is:"+hospital2.location);
        System.out.println("The Hospital type is:"+hospital2.type);
        System.out.println("The No Of doctors in Hospital are :"+hospital2.noOfDoctors);

     Hospital hospital3 = new Hospital();
	    hospital3.id = 254861;
		hospital3.name = "Punya";
		hospital3.location = "Tilak nagar Banglore";
		hospital3.type = "General";
		hospital3.noOfDoctors = 15;
		
        System.out.println("The Hospital id is:"+hospital3.id);
		System.out.println("The Hospital name is:"+hospital3.name);
		System.out.println("The Hospital location is:"+hospital3.location);
        System.out.println("The Hospital type is:"+hospital3.type);
        System.out.println("The No Of doctors in Hospital are :"+hospital3.noOfDoctors);		
   }

}