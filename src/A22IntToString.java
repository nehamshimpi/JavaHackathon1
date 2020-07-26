
public class A22IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1234;
		int b = -1234;
		String str1 = Integer.toString(a);
		String str2 = Integer.toString(b);
		System.out.println("String str1 = " + str1);
		System.out.println("String str2 = " + str2);
		String str3 = String.valueOf(a);
		System.out.println("String str3 = " + str3);
	}
}
