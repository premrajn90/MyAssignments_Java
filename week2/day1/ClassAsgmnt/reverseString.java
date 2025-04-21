package week2.day1.ClassAsgmnt;

public class reverseString {

	public static void main(String[] args) {

		String companyName= "TestLeaf";
		 char[] charArray = companyName.toCharArray();
		 
		 System.out.println("Reversed String");
		 for (int i = charArray.length - 1; i >= 0; i--)
			 
		 {
			// System.out.println("Reversed String");
		System.out.println(charArray[i]);
		 }
		
	}

}
