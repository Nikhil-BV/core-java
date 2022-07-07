class PatientDTO{
     
	 public PatientDTO(){

	 System.out.println("PatientDTO counstructor created");
	 }
	 
	 private int id ;
	 private String name ;
	 private String addres ;
	 private Gender gender ;
	 private long contactNo ;
	 
	 public int getId(){
		 return id;
	 }
	 public void setId(int id){
		 this.id =id;
	 }
	 
	 public String getName(){
		 return name;
	 }
	 public void setName(String name){
		 this.name = name;
	 }
	 
	 public String getAddres(){
		 return addres;
	 }
	 public void setAddres(String addres){
		 this.addres = addres;
	 }
	 
	 public Gender getGender(){
		 return gender;
	 }
	 public void setGender(Gender gender){
		 this.gender = gender;
	 }
	 
	 public long getContactNo(){
		 return contactNo;
	 }
	 public void setContactNo(long contactNo){
		 this.contactNo = contactNo;
	 }
	 
	 

}