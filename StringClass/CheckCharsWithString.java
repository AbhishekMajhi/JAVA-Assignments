package StringClassPrograms;

import java.util.*;

/****
 * Write a program to check whether two given strings contains same set of characters as well as having 
 * same length.

 input
 String s1 = "amar";
 String s2= "rama";
 ******/

public class CheckCharsWithString {

	public boolean find(char []s1, char []s2) {
		int len = s1.length;
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i = 0; i < len; i ++) {
			if (s1[i] != s2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		CheckCharsWithString obj = new CheckCharsWithString();
		String s1 = "Dude";
		String s2 = "uDee";
		if(s1.length() != s2.length()) {
			System.out.println(" Strings don't have same lenght");
			System.exit(0);
		}
		
		int cnt = 0;
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		if (obj.find(ch1, ch2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
		
//		for(int i = 0; i < s1.length(); i ++) {
//			for(int j = 0; j < s2.length(); j++) {
//				if (s1.charAt(i) == s2.charAt(j)) {
//					System.out.println("found match "+s2.charAt(j)+ " for "+ s1.charAt(i));
//					cnt ++;	
//				}
//			}
//			
//		}
		
		
//		if (cnt == s1.length())
//			System.out.println("Both string s1 and s2 have same chars.");
//		else
//			System.out.println("String s1 and s2 don't have same chars.");
		
	}

}
