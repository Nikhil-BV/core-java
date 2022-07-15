import java.util.Arrays;
class Library1{
	
	BookDTO[] dtos ;
	
	int index;
	
	public Library1(int size){
		dtos = new BookDTO[size];
		System.out.println("Library1 const created");
	}
	
	public boolean bookDetails(BookDTO dto){
	   System.out.println("inside bookDetails");
	   boolean isRequired = false;
	   if(dto != null && dto.getBookName()!=null){
			 this.dtos[index++] = dto;
			 isRequired = true;
			System.out.println("Book present in the library"); 
		 }
		 else{
			 System.out.println("Book not avaliable");
		 }
		 
		 return isRequired;
		 
	 }
	 
	 public void getBookDetails(){
		 System.out.println("inside getBookDetails()");
		 
		 for (int i=0 ; i<dtos.length ;i++){
			 System.out.println(dtos[i].getId()+" "+dtos[i].getBookName()+" "+dtos[i].getAuthor()+" "+dtos[i].getLanguage()+" "+dtos[i].getPublisher());
		 }
	 }
	 
	 public boolean updateBookLanguageById(int id ,String language){
		  System.out.println("inside updateFoodItemNameById");
		  boolean updatedLanguage=false;
		  for (int i=0 ; i<dtos.length ; i++){
			  if(dtos[i].getId() == id){
				  dtos[i].setLanguage(language);
				  updatedLanguage= true;
			  }
			  else{
				  System.out.println("Id is not matching");
			  }
		  }
		  
		  return updatedLanguage;
	  }
	  
	  public boolean updateBookAuthorByName(String name , String author){
		  System.out.println("inside updateFoodItemPriceByName");
		  boolean updatedAuthor=false;
		  for(int i=0; i<dtos.length;i++){
		  if(dtos[i].getBookName().equals(name)){
			  dtos[i].setAuthor(author);
			  updatedAuthor = true;
		  }
		  else{
			  System.out.println("Name is not matching");
		  }
		 }
		 
		 return updatedAuthor;
	  }
	  
	   public boolean deleteBookByAuthor(String name){
		  boolean bookdeleted = false;
		  System.out.println("inside deleteBookByAuthor");
		  int i,j;
		  for (i=0,j=0 ; j<dtos.length; j++){
			  if (!dtos[j].getAuthor().equals(author)){
				 // dtos[i] = null ;
				 
				 dtos[i++] = dtos[j];
				 bookdeleted = true;
			  }
			  else{
				  System.out.println("book name not found");
			  }
		  }
			  dtos =  Arrays.copyOf(dtos,i);
		   	  return bookdeleted;  
	 }
	 
	 public boolean deleteBookById(int id){
		  boolean bookdeleted = false;
		  System.out.println("inside deleteBookById");
		  int i,j;
		  for (i=0,j=0 ; j<dtos.length; j++){
			  if (!dtos[j].getId().equals(id)){
				 // dtos[i] = null ;
				 
				 dtos[i++] = dtos[j];
				 bookdeleted = true;
			  }
			  else{
				  System.out.println("book id not found");
			  }
		  }
			  dtos =  Arrays.copyOf(dtos,i);
		   	  return bookdeleted;  
	 }
	

}
