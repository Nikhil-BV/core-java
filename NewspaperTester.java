class NewspaperTester{

         public static void main (String args[]){
		 
		 Newspaper np = new Newspaper();
		 
		 np.setName("Vijaya Vani");
		 np.setType("Daily");
         np.setLanguage("Kannada");
         np.setPrice(5.00);

           System.out.println(np.getName()+" "+np.getType()+" "+np.getLanguage()+" "+np.getPrice());		 
		 }

}