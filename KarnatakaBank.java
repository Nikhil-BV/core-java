class KarnatakaBank extends Bank1{
          
		@Override
		public void getInterest(double interest){
		
		     System.out.print("the Karnataka bank");
		interest = interest + 4.5 ;

         super.getInterest(interest);

		 
		}



}