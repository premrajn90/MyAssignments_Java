package week1.day2.HomeAsgmnt;

public class ToChkPalindrome {

	public static void main(String[] args) {
		int input=12341,output=0,rem=input;
		
		
		for (; rem != 0; rem /= 10)
		{
			output=output*10 + rem % 10;
		}
		{
			if (input==output)
			{
				System.out.println("The given number is Palindrome");
			}
			else
			{
				System.out.println("The given number is not a palindrome");
			}
			}

	

}
}