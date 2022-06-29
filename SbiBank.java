class SbiBank extends Bank1{
          
		@Override
		public void getInterest(double interest){
		
		     System.out.print("the SBI bank");
		interest = interest + 4.0 ;

         super.getInterest(interest);

		 
		}



}