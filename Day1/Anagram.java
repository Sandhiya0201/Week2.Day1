package Week2.Day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[]args) {
	String text1="Dna";
	String text2="And";
	if(text1.length()==text2.length())
	{
		char[]charArray1=text1.toCharArray();
		char[]charArray2=text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		boolean result = Arrays.equals(charArray1, charArray2);
		if(result) {
			System.out.println(text1 + "and" + text2 + "are anagram.");
		}
		else {
			System.out.println(text1 + "and" + text2 + "are not anagram.");
		}

	}
}
}
