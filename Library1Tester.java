import java.util.Scanner;

class Library1Tester{
          
		  public static void main(String args[]){
			  
			  Scanner sc = new Scanner(System.in);
			  
			  System.out.println("Enter the no of Book required");
			    int size = sc.nextInt();
				
			Library1 lib = new Library1(size);

            for (int i=0; i<size ;i++){
				BookDTO dto = new BookDTO();
				
		  System.out.println("Enter book ID");
		    int id = sc.nextInt();
		  System.out.println("Enter book Name");
            String bookName = sc.next(); 
          System.out.println("Enter the author ");
            String author = sc.next();	
		  System.out.println("Enter the book Language");
		    String language = sc.next();
		  System.out.println("Enter the Publisher");
		    String publisher = sc.next();
			
		  dto.setId(id);
          dto.setBookName(bookName);
          dto.setAuthor(author);
          dto.setLanguage(language);
          dto.setPublisher(publisher);		
       
          lib.bookDetails(dto);	   
			}			
			
			lib.getBookDetails();
			  
		  }

}