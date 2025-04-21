package week1.day2.HomeAsgmnt;

public class IsPrimeNumber {

public static void main(String[] args) {
	
	int n= 13;
	
	
for (int i=2; i<=n; i++)
{
	if(n%i == 0) 
		{
System.out.println("The given num ber is not Prime");
		}
		else
{
System.out.println("The given number is Not Prime");
}
	

	}
}

}
			

/*for (int num=1; num<=13; num++)
{
	if (num%num==0 && num/num==1)
{
	System.out.println("Number " +num+" is a prime number");
}
else
{
	System.out.println("Number " +num+" is not a prime number");
}
}*/