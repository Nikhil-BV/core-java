class HdfcBank extends Bank1{
          
		@Override
		public void getInterest(double interest){
		
		     System.out.print("the Hdfc bank");
		interest = interest + 4.0 ;

         super.getInterest(interest);

		 
		}



}