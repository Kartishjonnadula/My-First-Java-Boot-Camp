package com.wipro.bank.acc;

public abstract class Account {
   int tenure;
   float principle;
   float rateOfInterest;
   public void setInterest(int age, String gender)
   {  
	   if(gender.equalsIgnoreCase("Male"))
	   {  
		   if(age<60)
	     {
		   this.rateOfInterest=9.8f;
	     }
	      else
	      {
		   this.rateOfInterest=10.5f;
	      }
	   }
	   else
	   {
		   if(age<58)
		   {
			   this.rateOfInterest=10.2f;
		   }
		   else
		   {
			   this.rateOfInterest=10.8f;
		   }
	   }
	   
   }
   
   
   public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest)
   {
	   return 	totalPrincipleDeposited+maturityInterest;
   }
   
   
   public abstract float calculateInterest();
   
   public abstract float calculateAmountDeposited();
}
