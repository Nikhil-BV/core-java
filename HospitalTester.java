import java.util.Scanner;

class HospitalTester{

     public static void main(String args[]){
		 
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the NO of Patient to be added");
           int size = sc.nextInt();
		   Hospital hos  = new Hospital(size);
		 
		 for (int i=0;i < size;i++){
			 
		 PatientDTO dto = new PatientDTO();
		
		 System.out.println("Enter Patient ID");
		  int id = sc.nextInt();
		 System.out.println("Enter Patient Name");
           String name = sc.next(); 
         System.out.println("Enter the Patient Addres");
           String addres = sc.next();	
		 System.out.println("Enter the Patient's Gender");
           String gender = sc.next();	
         System.out.println("Enter the Patient ContactNo");
           long contactNo = sc.nextLong();
		 
		 dto.setId(id);
		 dto.setName(name);
		 dto.setAddres(addres);
		 dto.setGender(Gender.valueOf(gender));
		 dto.setContactNo(contactNo);
		 hos.creatPatient(dto);
		 }
		 
		/* System.out.println("Enter Patient ID");
		  int id1 = sc.nextInt();
		 System.out.println("Enter Patient Name");
           String name1 = sc.next(); 
         System.out.println("Enter the Patient Addres");
           String addres1 = sc.next();	
         System.out.println("Enter the Patient ContactNo");
           long contactNo1 = sc.nextLong();

         System.out.println("Enter Patient ID");
		  int id2 = sc.nextInt();
		 System.out.println("Enter Patient Name");
           String name2 = sc.next(); 
         System.out.println("Enter the Patient Addres");
           String addres2 = sc.next();	
         System.out.println("Enter the Patient ContactNo");
           long contactNo2 = sc.nextLong();*/
		 
		
		 
		/* PatientDTO dto1 = new PatientDTO();
		 dto1.setId(id1);
		 dto1.setName(name1);
		 dto1.setAddres(addres1);
		 //dto1.setGender(Gender.female);
		 dto1.setContactNo(contactNo1);
		 
		 PatientDTO dto2 = new PatientDTO();
		 dto2.setId(id2);
		 dto2.setName(name2);
		 dto2.setAddres(addres2);
		 //dto2.setGender(Gender.male);
		 dto2.setContactNo(contactNo2);*/
		 
		/* PatientDTO dto3 = new PatientDTO();
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
		 dto4.setContactNo(465136465l);*/
		 
		 
		 //hos.creatPatient(dto1);
		// hos.creatPatient(dto2);
		 //hos.creatPatient(dto3);
		 //hos.creatPatient(dto4);
		 hos.getPatientDetails();
		/* System.out.println("Enter the existing id for update address");
		 int existingId = sc.nextInt();
		 System.out.println("Enter the address to be update");
		 String updatedAddress = sc.nextLine();
		 hos.updatePatientAddresById(existingId,updatedAddress);
		 hos.getPatientDetails();
		 
		 hos.getPatientDetails();
		 System.out.println("enter the existing name for update contactNo");
		 String existingName = sc.next();
		 System.out.println("Enter the contactNo to be update");
		 long updatedContactNo = sc.nextLong();
		 hos.updatePatientContactNoByName(existingName,updatedContactNo);*/
		
		 System.out.println("enter the name of patient to be delete");
		 String existingName1 = sc.next();
		 hos.deletePatientByName(existingName1);
		 hos.getPatientDetails();
		 
		 System.out.println("enter the id of patient to be delete");
		 int existingId = sc.nextInt();
		 hos.deletePatientById(existingId);
		 hos.getPatientDetails();
		 
		 }
}