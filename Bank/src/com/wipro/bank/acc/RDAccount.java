package com.wipro.bank.acc;

public class RDAccount extends Account{
	public RDAccount(int tenure, float principal)
			{ 
		    
		       
			}
	public float calculateAmountDeposited()
	{
		return principle*tenure*12;
	}
	
	public float calculateInterest()
	{  
		float prevVal=0.0f;
		int i;
		float r=rateOfInterest/100;
	   for(i=tenure*12;i>0;i--)
	   	{
		   float t=i/12.0f;
		   float nt=4.0f*t;
		   float val=(1+r/4.0f);
		   val=(float)(Math.pow(val, nt));
		   val=val-1;
		   val=principle*val;
		   prevVal=prevVal+val;
	   	}
	     return prevVal;

}
}
