class BookMyMovieTester{

   public static void main(String a[])
   {
      String movies[] = {"Om", "Milana", "A", "Autoraja", "Gaalipata", "Pritvi", "Uppi2"};
	  String snacks[] = {"Lays", "coca cola","samosa","PopCorn","Masala PopCorn"};
      BookMyMovie bookMyMovie = new BookMyMovie("Navaranga", 450, movies,  snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie.theaterName);
	  bookMyMovie.showTime(12, "Nikhil", "Gaalipata");
	  bookMyMovie.buySnacks("samosa", 20,55);
	  System.out.println("------------------------------------");
	  
	  BookMyMovie bookMyMovie1 = new BookMyMovie("Narthaki", 350, movies, snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie1.theaterName);
	  bookMyMovie1.showTime(10, "Sunil", "Om");
	  bookMyMovie1.buySnacks("Masala PopCorn", 15,29);
	  System.out.println("====================================");
	  
	  BookMyMovie bookMyMovie2 = new BookMyMovie("PVR", 300, movies, snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie2.theaterName);
	  bookMyMovie2.showTime(8, "Abhi", "Uppi2");
	  bookMyMovie2.buySnacks("coca Cola", 11,45);
	  
   }

}