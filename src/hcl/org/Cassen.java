//package hcl.org;
//
//public class Cassen {
//
//	public static void main(String[] args) {
//		
//		String s1 ="this is a string";
//		String s2 =" ";
//		String[] split = s2.split(s1);
//		
//		for (String cassen : split) {
//			char c = cassen.charAt(0);
//			char case1 = Character.toUpperCase(c);
//			String st = cassen.substring(1);
//			s2 = s1 + case1 + st +" ";
//		}
//		System.out.println(s2);
//	}
//
//}

package hcl.org;

public class Cassen {

    public static void main(String[] args) {

        String s1 = " ";
        String s2 = "this is a string";
        String[] split = s2.split(s1);

        for (String cassen : split) {
            char c = cassen.charAt(0);
            char case1 = Character.toUpperCase(c);
            String st = cassen.substring(1);
            s1 = s1 + case1 + st + " ";
        }
        System.out.println(s1);
    }

}