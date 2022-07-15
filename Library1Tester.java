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
		 System.out.println("Enter the existing id for update language");
		 int existingId = sc.nextInt();
		 System.out.println("Enter the address to be update");
		 String updatedLanguage = sc.nextLine();
		 lib.updateBookLanguageById(existingId,updatedLanguage);
		 lib.getBookDetails();
		 
		 lib.getBookDetails();
		 System.out.println("enter the existing name for update Author");
		 String existingName = sc.next();
		 System.out.println("Enter the Author to be update");
		 String updatedAuthor = sc.next();
		 lib.updateBookAuthorByName(existingName,updatedAuthor);
		 lib.getBookDetails();
		 
		 System.out.println("enter the Author of Book to be delete");
		 String existingAuthor1 = sc.next();
		 lib.deleteBookByAuthor(existingAuthor1);
		 lib.getBookDetails();
		 
		 System.out.println("enter the Id of Book to be delete");
		 int existingId = sc.nextInt();
		 lib.deleteBookById(existingId);
		 lib.getBookDetails();
			  
		  }

}