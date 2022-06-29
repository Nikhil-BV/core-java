class IciciBank extends Bank1{
          
		@Override
		public void getInterest(double interest){
		
		     System.out.print("the Icici bank");
		interest = interest + 1.0 ;

         super.getInterest(interest);

		 
		}



}