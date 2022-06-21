class Industry{
     static String name = "Aditya Birla Group";
     String industryType ;
	 int gstNo;
	 int noOfEmployees;
	 
	 public Industry(String industryType,int gstNo,int noOfEmployees){
	    System.out.println("Industry object created");
		 this.industryType = industryType;
		 this.gstNo = gstNo;
		 this.noOfEmployees = noOfEmployees;
	 }
	 
	 public Industry(){
	 }
	 
	 public static void main(String a[]){
	 Industry ind = new Industry("Textile",15789856,5000);
     System.out.println(ind.industryType+" "+ind.gstNo+" "+ind.noOfEmployees+" "+Industry.name);
     Industry ind1 = new Industry("Chemicals",18449856,4000);
     System.out.println(ind1.industryType+" "+ind1.gstNo+" "+ind1.noOfEmployees+" "+Industry.name);
     Industry ind2 = new Industry("Cement",41448455,6000);
     System.out.println(ind2.industryType+" "+ind2.gstNo+" "+ind2.noOfEmployees+" "+Industry.name);
     Industry ind3 = new Industry("Birla Carbon",15789856,3000);
     System.out.println(ind3.industryType+" "+ind3.gstNo+" "+ind3.noOfEmployees+" "+Industry.name);	 
	 }
	 
	 

}