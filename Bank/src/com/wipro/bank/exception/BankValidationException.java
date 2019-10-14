package com.wipro.bank.exception;

public class BankValidationException extends Exception {
	public BankValidationException()
	{
		//super(s);
	}
	public String toString()
	{
		return "Invalid Data";
	}

}
