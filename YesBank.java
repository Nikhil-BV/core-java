class YesBank extends Bank1{
          
		@Override
		public void getInterest(double interest){
		
		     System.out.print("the Yes bank");
		interest = interest + 2.0 ;

         super.getInterest(interest);

		 
		}



}