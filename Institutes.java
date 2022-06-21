class Institutes{
     String name;
	 String institutetype;
	 String location;
	 int noOfStudent;
	 
	 public Institutes(String name,String institutetype,String location,int noOfStudent){
           System.out.println("Institutes object created");
            this.name = name;
            this.institutetype = institutetype;
			this.location = location;
            this.noOfStudent = noOfStudent;			
	 }
	    public Institutes(){
		}
		
		public static void main(String a[]){
		Institutes ins = new Institutes("AIT","Engineering","Chikkmaglur",660);
		System.out.println(ins.name+" "+ins.Institutetype+" "+ins.location+" "+ins.noOfStudent);
		Institutes ins1 = new Institutes("IITDelhi","IIT","Delhi",8000);
		System.out.println(ins1.name+" "+ins1.Institutetype+" "+ins1.location+" "+ins1.noOfStudent);
		Institutes ins2 = new Institutes("NIFT","Fashion Tech","Bangalore",500);
		System.out.println(ins2.name+" "+ins2.Institutetype+" "+ins2.location+" "+ins2.noOfStudent);
		Institutes ins3 = new Institutes("BMCRI","Medical","Bangalore",400);
		System.out.println(ins3.name+" "+ins3.Institutetype+" "+ins3.location+" "+ins3.noOfStudent);
		}


}