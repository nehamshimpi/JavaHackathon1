import java.util.Scanner;

public class A5UniqueAndDuplicateNums {
	public static void main(String[] args) {
// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers in an array: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int len = arr.length;
		printDuplicate(arr, len);
		printUnique(arr, len);
	}

	static void printDuplicate(int arr[], int size) {
		int i, j;
		System.out.println("Duplicate elements are: ");
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[i] + " ");
			}
		}
	}

	static void printUnique(int arr[], int size) {
		int i, j;
		for (i = 0; i < size; i++) {
			int pivot = arr[i];
			for (j = i + 1; j < size; j++) {
				if (pivot == arr[j]) {
					arr[j] = 0;
					arr[i] = 0;
				}
			}
		}
		System.out.println(("The unique elements are: "));
		for (int x = 0; x < size; x++) {
			if (arr[x] != 0) {
				System.out.println(arr[x]);
			}
		}
	}
}