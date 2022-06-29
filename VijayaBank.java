class VijayaBank extends Bank1{
          
		@Override
		public void getInterest(double interest){
		
		     System.out.print("the Vijaya bank");
		interest = interest + 4.2 ;

         super.getInterest(interest);

		 
		}



}