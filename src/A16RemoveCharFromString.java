import java.util.Scanner;

public class A16RemoveCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		System.out.println("Enter the character u want to remove: ");
		String str1 = sc.nextLine();
		sc.close();
		if (str.contains(str1)) {
			String newstr = str.replace(str1, " ");
			System.out.println(newstr);
		} else
			System.out.println(str1 + "Not found in a string");

	}

}
