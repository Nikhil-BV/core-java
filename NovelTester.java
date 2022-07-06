class NovelTester{
      
	  public static void main(String args[]){
	  
	      Novel no = new Novel();
		  
		  no.setTitle("Death");
		  no.setAuthor("Jaggi Vasudev");
		  no.setLength(349);
		  no.setPublisher("Penguin Random House");
		  no.setPrice(350.00);
		  
		  System.out.println(no.getTitle()+" "+no.getAuthor()+" "+no.getLength()+" "+no.getPublisher()+" "+no.getPrice());
	  
	  }


}