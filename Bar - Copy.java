class Bar{
		public Bar()
	{
		System.out.println("Bar objected Created");
	    System.out.println("----------------");
	}
    String name;
	String address;
	String type;
	String ownerName;
	int id;
	long gstNo;
	String []brandInBar={"kingfisher","budwiser","old monk","IB","Breezer"};
	String []brandInBar1={"kingfisher","budwiser","old monk","IB","Breezer"};
	String []brandInBar2={"kingfisher","budwiser","old monk","IB","Breezer"};
	

   public static void main(String a[]){
   Bar bar = new Bar();
   bar.name = "Sneha";
   bar.address = "Navarang banglore";
   bar.type = "MRP";
   bar.ownerName = "suresh";
   bar.id = 7812;
   bar.gstNo = 1548944579l;
   
   System.out.println("The bar name is :"+bar.name);
   System.out.println("The bar address is :"+bar.address);
   System.out.println("The bar type is :"+bar.type); 
   System.out.println("The bar ownerName is :"+bar.ownerName);
   System.out.println("The bar id is :"+bar.id);
   System.out.println("The bar gstNo is :"+bar.gstNo);
   
    System.out.println(" The Brand available in bar are........");
		 bar.getBrandInBar();	 
   
   
   Bar bar1 = new Bar();
   bar1.name = "Nandini";
   bar1.address = "Nandini layout banglore";
   bar1.type = "Bar and restaurant";
   bar1.ownerName = "Ramesh";
   bar1.id = 1254;
   bar1.gstNo = 12878944579l;
   
   System.out.println("The bar name is :"+bar1.name);
   System.out.println("The bar address is :"+bar1.address);
   System.out.println("The bar type is :"+bar1.type); 
   System.out.println("The bar ownerName is :"+bar1.ownerName);
   System.out.println("The bar id is :"+bar1.id);
   System.out.println("The bar gstNo is :"+bar1.gstNo);
   
   System.out.println(" The Brand available in bar are........");
		 bar.getBrandInBar1();
   
   
   Bar bar2 = new Bar();
   bar2.name = "Srinivas";
   bar2.address = "Nagarabhavi";
   bar2.type = "Bar and restaurant";
   bar2.ownerName = "Sundar";
   bar2.id = 2245;
   bar2.gstNo = 17878944547l;
   
   System.out.println("The bar name is :"+bar2.name);
   System.out.println("The bar address is :"+bar2.address);
   System.out.println("The bar type is :"+bar2.type); 
   System.out.println("The bar ownerName is :"+bar2.ownerName);
   System.out.println("The bar id is :"+bar2.id);
   System.out.println("The bar gstNO is :"+bar2.gstNo);
   
   System.out.println(" The Brand available in bar are........");
		 bar.getBrandInBar2();
   
   }
    public void getBrandInBar(){
	 for(int z=0 ;z< brandInBar.length;z++){
		 System.out.println(brandInBar[z]);
	 }	
		
	}  
	public void getBrandInBar1(){
	 for(int z=0 ;z< brandInBar.length;z++){
		 System.out.println(brandInBar1[z]);
	 }	
		
	}  
	public void getBrandInBar2(){
	 for(int z=0 ;z< brandInBar.length;z++){
		 System.out.println(brandInBar2[z]);
	 }	
		
	}  
	

}