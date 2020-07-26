import java.util.Scanner;

public class A11SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		str = sc.nextLine();
		sc.close();
		String arr[] = str.split(":");
		for (String a : arr)
			System.out.println(a);
	}
}
