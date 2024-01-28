package hcl.org;

public class Arrayy {

	public static void main(String[] args) {
		int [] ar = {7,9,1,3,4,5,6,3,6};
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {

				if (ar[i]>ar[j]) {
//	Descending
//				if (ar[i]<ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;

				}
			}
			System.out.println(ar[i]);
		}
	}

}
