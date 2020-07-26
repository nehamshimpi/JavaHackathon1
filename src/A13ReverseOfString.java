import java.util.Scanner;

public class A13ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = sc.nextLine();
		String[] chars = input.split("");
		sc.close();
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}

	}
}
