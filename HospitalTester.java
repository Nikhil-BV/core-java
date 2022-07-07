class HospitalTester{

         public static void main(String args[]){
		 
		 Hospital hos = new Hospital();
		 
		 PatientDTO dto = new PatientDTO();
		 dto.setId(1);
		 dto.setName("Babu");
		 dto.setAddres("Bangalore");
		 dto.setGender(Gender.male);
		 dto.setContactNo(978566465l);
		 
		 PatientDTO dto1 = new PatientDTO();
		 dto1.setId(2);
		 dto1.setName("Bahi");
		 dto1.setAddres("Bombay");
		 dto1.setGender(Gender.female);
		 dto1.setContactNo(985154654l);
		 
		 PatientDTO dto2 = new PatientDTO();
		 dto2.setId(3);
		 dto2.setName("Raja");
		 dto2.setAddres("Rajajinagar");
		 dto2.setGender(Gender.male);
		 dto2.setContactNo(985445175l);
		 
		 PatientDTO dto3 = new PatientDTO();
		 dto3.setId(4);
		 dto3.setName("Rani");
		 dto3.setAddres("Manglore");
		 dto3.setGender(Gender.female);
		 dto3.setContactNo(5895365435l);
		 
		 PatientDTO dto4 = new PatientDTO();
		 dto4.setId(5);
		 dto4.setName("Paru");
		 dto4.setAddres("Pune");
		 dto4.setGender(Gender.female);
		 dto4.setContactNo(465136465l);
		 
		 hos.creatPatient(dto);
		 hos.creatPatient(dto1);
		 hos.creatPatient(dto2);
		 hos.creatPatient(dto3);
		 hos.creatPatient(dto4);
		 hos.getPatientDetails();
		 
		 
		 }
}