class KotakBank extends Bank1{
          
		@Override
		public void getInterest(double interest){
		
		     System.out.print("the kotak bank");
		interest = interest + 2.5 ;

         super.getInterest(interest);

		 
		}



}