class PunjabNationalBank extends Bank1{
          
		@Override
		public void getInterest(double interest){
		
		     System.out.print("the PunjabNotional bank");
		interest = interest + 5.5 ;

         super.getInterest(interest);

		 
		}



}