package com.xworkz.atm;

public class AtmException extends RuntimeException {
	
	@Override
	public String toString()
	{
		return "you are reached max.transaction amount ...please enter valid amount";
		
	}
	

}
