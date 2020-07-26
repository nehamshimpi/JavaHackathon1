import java.util.Scanner;

public class A10StringSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";
		CharSequence str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		str = sc.nextLine();
		sc.close();
		str1 = str.subSequence(1,8);
		System.out.println(str1);
	}
}
