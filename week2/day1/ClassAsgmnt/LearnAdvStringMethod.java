package week2.day1.ClassAsgmnt;

import java.util.Arrays;

public class LearnAdvStringMethod {

	public static void main(String[] args) {
		String string1= "course";
		String string2 = "sours";
		//Checking length
		if (string1.length() == string2.length())
		{
			System.out.println("Both have same length");
			char[] charArray1 = string1.toCharArray();
			char[] charArray2 = string2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			//System.out.println("Sorted character array: ");
			
			if (Arrays.equals(charArray1, charArray2))
			{
			System.out.println("The given string is Anagram");
			}
			else {
				System.out.println("The given string are not anagram");
				}
			}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			}
	}

}
