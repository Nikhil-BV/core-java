class PatientTester{
       
	   
	   public static void main(String args[]){
	        
			 PatientDTO dto = new PatientDTO();
			 dto.setId(1);
			 dto.setName("Nilhil");
			 System.out.println(dto);
			 //int uniqueNumber = dto.hashCode();
			 PatientDTO dto1 = new PatientDTO();
			 dto1.setId(1);
			 dto1.setName("abcd");
			 System.out.println(dto1);
			// int uniqueNumber1 = dto1.hashCode();
			 //System.out.println("Hasacode for Patient id " +dto.hashCode());
			 //System.out.println("Hasacode for Patient id " +dto1.hashCode());
			 //System.out.println(dto.equals(dto1));
			 
			 String hero = "yash";
			 String hero1 = "Yash";
			 System.out.println(hero.equalsIgnoreCase(hero1));
	   } 
}