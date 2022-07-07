class Hospital{
	
        // Has many Patients
     PatientDTO[] dtos = new PatientDTO[5];
	 
	 //instance variable
	 int index ;
	 
	 public Hospital(){
	 System.out.println("Hospital const is called");
	 }
	 
	 public boolean creatPatient(PatientDTO dto){
		 System.out.println("inside creatPatient");
		 boolean isAdded = false ;
		 if(dto != null && dto.getName()!=null){
			 this.dtos[index++] = dto;
			 isAdded = true;
			System.out.println("patient details added sucessfully "); 
		 }
		 else{
			 System.out.println("can not add patient without detail");
		 }
		 
		 return isAdded;
		 
		 
	 }
	  
	  public void getPatientDetails(){
		  System.out.println("inside getPatientDetails() ");
		  for(int i=0; i<dtos.length ;i++ ){
			System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getAddres()+" "+dtos[i].getGender()+" "+dtos[i].getContactNo());  
		  }
	  }
	 
}