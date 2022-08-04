package com.xworkz.pubapp;

public class Bouncer {
	
	public void check(int age) throws PubException {
		
		if(age >=18) {
			System.out.println("please enter and enjoy");
		}
		else {
			
			//PubException exception = new PubException();
			throw new PubException() ;
		}
		
		System.out.println("Check method ended");
	}

}
