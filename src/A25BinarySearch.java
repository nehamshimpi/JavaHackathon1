import java.util.Scanner;

public class A25BinarySearch {

	public static void main(String[] args) {
		int c, first, last, middle, n, search;
		Scanner in = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter " + 5 + " integers");
		if (array.length != 5) {
			System.out.println("Please enter 5 values");
		}
		for (c = 0; c < 5; c++)
			array[c] = in.nextInt();
		System.out.println("Enter value to find");
		search = in.nextInt();
		first = 0;
		last = 5 - 1;
		middle = (first + last) / 2;
		while (first <= last) {
			if (array[middle] < search)
				first = middle + 1;
			else if (array[middle] == search) {
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else
				last = middle - 1;
			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(search + " is not present in the list.\n");
	}

}
