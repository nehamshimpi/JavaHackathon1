import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A20ReapetUcaseLcaseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printRepeatedOccurrence(str);
		sc.close();
	}

	private static void printRepeatedOccurrence(String str) {
		char[] input = str.toCharArray();
		Map<Character, Integer> occurrence = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length; i++) {
			if (occurrence.containsKey(input[i])) {
				int occurred = occurrence.get(input[i]);
				occurrence.put(input[i], Integer.valueOf(++occurred));
			} else {
				occurrence.put(input[i], Integer.valueOf(1));
			}
		}
		for (Map.Entry<Character, Integer> entry : occurrence.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}

}
