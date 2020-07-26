import java.util.Scanner;

public class A19OccOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		str = sc.nextLine();
		sc.close();
		int arr[] = new int[150];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				arr[str.charAt(i)]++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > 1) {
				System.out.println((char) (j) + " is occured " + arr[j] + " times ");
			}
		}
	}

}
