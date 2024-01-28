package hcl.org;

import java.util.Scanner;

public class Binarynum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int a = sc.nextInt();
		int count = 0;

		for (int i = 0; i < a; i++) {
			if (a%10 > 1) {

				count++;

			}
			a/=10;
		}
		if (count==0) {
			System.out.println("binary");
		} else {
			System.out.println("not a binary");
		}

	}

}
