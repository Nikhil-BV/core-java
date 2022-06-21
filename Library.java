class Library{
       String name;
	   String location;
	   String openingTime;
	   String closeingTime;
	   
	   public Library(String name,String location,String openingTime,String closeingTime){
	   System.out.println("Library object created");
	       this.name = name;
		   this.location = location;
		   this.openingTime = openingTime;
		   this.closeingTime = closeingTime;
	   }
        public Library(){
		}
		
		public static void main(String a[]){
		Library lib = new Library("City Central Library","Sampige rd Bng","Open8Am","close6Pm");
		System.out.println(lib.name+" "+lib.location+" "+lib.openingTime+" "+lib.closeingTime);
		Library lib1 = new Library("Public Library","Nandini layout","Open8Am","close8Pm");
		System.out.println(lib1.name+" "+lib1.location+" "+lib1.openingTime+" "+lib1.closeingTime);
		Library lib2 = new Library("City Central Library","R.T Nagar","Open10Am","close8Pm");
		System.out.println(lib2.name+" "+lib2.location+" "+lib2.openingTime+" "+lib2.closeingTime);
		Library lib3 = new Library("Vijayanagara Central Library","Vijayanagara","Open8Am","close8Pm");
		System.out.println(lib3.name+" "+lib3.location+" "+lib3.openingTime+" "+lib3.closeingTime);
		
		}
}