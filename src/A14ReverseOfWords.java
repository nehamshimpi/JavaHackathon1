import java.util.Scanner;
import java.util.regex.Pattern;

public class A14ReverseOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		sc.close();
		System.out.println(reverseWords(str));
	}

	private static String reverseWords(String string) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("\\s");
		String temp[] = pattern.split(string);
		String result = " ";
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = " " + temp[i] + result;
		}
		return result;
	}
}
