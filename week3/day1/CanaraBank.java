package week3.day1;

public abstract class CanaraBank implements Payment{

	public void userDetails() 
	{
	System.out.println("To record user details of canara bank who use amazon");
	}
	
	abstract void recordPaymentDetails();
	
}
