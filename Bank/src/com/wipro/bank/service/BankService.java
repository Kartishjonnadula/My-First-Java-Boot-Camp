package com.wipro.bank.service;

import com.wipro.bank.exception.BankValidationException;

public class BankService {

	public boolean validateData(float principal, int tenure,int age, String gender)throws BankValidationException
	{

		if(principal >=500.0f  && (tenure==5 || tenure==10) && (age>=1 && age<=100) && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")))
			
		{
			return true;
		}
		else {
			throw new BankValidationException();
		}
		
	}
	public void calculate(float principal,int tenure, int age, String gender)
	{  boolean f=validateData(principal,tenure,age,gender);
	  if (f==true)
	  {
		RDAccount r=new RDAccount();
		r.setInterest()
		
	  }
	}
}
