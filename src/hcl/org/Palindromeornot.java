package hcl.org;

import java.util.Scanner;

public class Palindromeornot {

	public static void main(String[] args) {

		
//	    type of string
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value of string: ");
		
		String s = sc1.nextLine();
		String s1 = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			s1 = s1+c;
		}
		System.out.println("The given value: "+s1);
		System.out.println("The reversed to: "+s1);
		
		if (s.equals(s1)) {
			System.out.println("a palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

}
