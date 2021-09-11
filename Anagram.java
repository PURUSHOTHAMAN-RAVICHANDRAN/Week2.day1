package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "helloworld";
		String str2 = "doroellhwl";
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int len1=arr1.length;
		int len2=arr2.length;
		boolean result = Arrays.equals(arr1, arr2);
		if(len1==len2)
		{
			if(result)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an Anagram");
			}
		}
		else
		{
			System.out.println("not Same");
		}
		

	}

}
