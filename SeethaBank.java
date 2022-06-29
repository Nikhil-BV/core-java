class SeethaBank extends Bank1{
          
		@Override
		public void getInterest(double interest){
		
		     System.out.print("the Seetha bank");
		interest = interest + 3.5 ;

         super.getInterest(interest);

		 
		}



}