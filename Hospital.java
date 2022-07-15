import java.util.Arrays;
class Hospital{
	
        // Has many Patients
     PatientDTO[] dtos ;
	 
	 //instance variable
	 int index ;
	 
	 public Hospital(int size){
		 dtos = new PatientDTO[size];
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
	  
	  public boolean updatePatientAddresById(int id ,String addres){
		  System.out.println("inside updatePatientAddresById");
		  boolean updatedAddres=false;
		  for (int i=0 ; i<dtos.length ; i++){
			  if(dtos[i].getId() == id){
				  dtos[i].setAddres(addres);
				  updatedAddres = true; 
			  }
			  else{
				  System.out.println("Id is not matching");
			  }
		  }
		  
		  return updatedAddres;
	  }
	  
	  public boolean updatePatientContactNoByName(String name , long contactNo){
		  System.out.println("inside updatePatientContactNoByName");
		  boolean updatedContactNo=false;
		  for(int i=0; i<dtos.length;i++){
		  if(dtos[i].getName().equals(name)){
			  dtos[i].setContactNo(contactNo);
			  updatedContactNo = true;
		  }
		  else{
			  System.out.println("Name is not matching");
		  }
		 }
		 
		 return updatedContactNo;
	  }
	  
	  public boolean deletePatientByName(String name){
		  boolean patientdeleted = false;
		  System.out.println("inside deletePatientByname");
		  int i,j;
		  for (i=0,j=0 ; j<dtos.length; j++){
			  if (!dtos[j].getName().equals(name)){
				 // dtos[i] = null ;
				 
				 dtos[i++] = dtos[j];
				 patientdeleted = true;
			  }
			  else{
				  System.out.println("patient name not found");
			  }
		  }
			  dtos =  Arrays.copyOf(dtos,i);
		   	  return patientdeleted;  
	 }
	 
	 public boolean deletePatientById(int id){
		  boolean patientdeleted = false;
		  System.out.println("inside deletePatientById");
		  int i,j;
		  for (i=0,j=0 ; j<dtos.length; j++){
			  
			  if (dtos[j].getId().equals(id)){
			
				 
				 dtos[i++] = dtos[j];
				 patientdeleted = true;
			  }
			  else{
				  System.out.println("patient id not found");
			  }
		  }
			  dtos =  Arrays.copyOf(dtos,i);
		   	  return patientdeleted;  
	 }
		  
           
}
	 
