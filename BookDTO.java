class BookDTO{
    
	 public BookDTO(){
		 System.out.println("Book const created");
	 }
	 
	 private int id;
	 private String bookName;
	 private String author;
	 private String language;
	 private String publisher;
	 
	 public int getId(){
		 return id ;
	 }
	 public void setId(int id){
		 this.id = id;
	 }
	 
	 public String getBookName(){
		 return bookName;
	 }
	 public void setBookName(String bookName){
		 this.bookName = bookName;
	 }
	 
	 public String getAuthor(){
		 return author;
	 }
	 public void setAuthor(String author){
		 this.author= author;
	 }
	 
	 public String getLanguage(){
		 return language;
	 }
     public void setLanguage(String language){
		 this.language = language;
	 }
	 
	 public String getPublisher(){
		 return publisher;
	 }
	 public void setPublisher(String publisher){
		 this.publisher = publisher;
	 }
	 
}