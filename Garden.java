class Garden{
     String name;
	 String location;
	 String openingTime;
	 String closeingTime;
	 
	 public Garden(String name,String location,String openingTime,String closeingTime){
	  System.out.println("Garden object created");
	    this.name = name;
		this.location = location;
		this.openingTime = openingTime;
		this.closeingTime = closeingTime;
	 }
        public Garden(){
		}
	 
	 public static void main(String a[]){
	 Garden grd = new Garden("Lalbagh","Mavalli Bengaluru","Opens9Am","Closes6Pm");
	 System.out.println(grd.name+" "+grd.location+" "+grd.openingTime+" "+grd.closeingTime);
	 Garden grd1 = new Garden("Bugle Rock Park","Bull Temple rd Bengaluru","Opens9Am","Closes9Pm");
	 System.out.println(grd1.name+" "+grd1.location+" "+grd1.openingTime+" "+grd1.closeingTime);
	 Garden grd2 = new Garden("Cubbon Park","Kasturba Rd Bengaluru","Opens9Am","Closes6Pm");
	 System.out.println(grd2.name+" "+grd2.location+" "+grd2.openingTime+" "+grd2.closeingTime);
	 Garden grd3 = new Garden("Palace Garden","Jayamahal Bengaluru","Opens9Am","Closes8Pm");
	 System.out.println(grd3.name+" "+grd3.location+" "+grd3.openingTime+" "+grd3.closeingTime);
	 }
}