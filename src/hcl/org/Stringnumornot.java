package hcl.org;

import java.util.Scanner;

public class Stringnumornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		
		String s = sc.next();
		char[] ch = s.toCharArray();
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] > 0 && ch[i] < 9) {
				count++;
			}
		}
		if (count==ch.length) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
