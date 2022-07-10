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
	

}
