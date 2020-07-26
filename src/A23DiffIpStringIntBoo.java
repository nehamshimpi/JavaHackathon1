import java.util.Scanner;

public class A23DiffIpStringIntBoo {
	static boolean isNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)) == false) {
				return false;
			}
			return true;
		}

		return false;

	}

	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("The string is : ");
		String Str = sc.nextLine();
		sc.close();
		System.out.println("The input is:" + Str);
		if (isNumber(Str)) {
			System.out.println("The input is integer:- " + Str);
		} else if (Str.equals("true") || Str.equals("false")) {
			System.out.println("The input is boolean:- " + Str);
		} else
			System.out.println("The input is String:- " + Str);
	}

}
