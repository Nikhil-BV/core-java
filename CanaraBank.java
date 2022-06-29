class CanaraBank extends Bank1{
          
		@Override
		public void getInterest(double interest){
		
		     System.out.print("the canara bank");
		interest = interest + 3.0 ;

         super.getInterest(interest);

		 
		}



}