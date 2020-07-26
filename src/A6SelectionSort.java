import java.util.Scanner;

public class A6SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A6SelectionSort ob = new A6SelectionSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers in an array: ");
		int num = sc.nextInt();
		int arr1[] = new int[num];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < num; i++) {
			arr1[i] = sc.nextInt();
		}
		int len = arr1.length;
		sort(arr1);
		System.out.println("Sorted array");
		printArray(arr1);
	}

	private static void printArray(int[] arr1) {
		// TODO Auto-generated method stub
		int n1 = arr1.length;
		for (int i = 0; i < n1; ++i)
			System.out.print(arr1[i] + " ");
		System.out.println();
	}

	static void sort(int[] arr1) {
		// TODO Auto-generated method stub
		int n = arr1.length;
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < (n - 1); i++) {
			// Find the minimum element in unsorted array
			int index = i;
			for (int j = i + 1; j < n; j++)
				if (arr1[j] < arr1[index])
					index = j;
			// Swap the found minimum element with the first
			// element
			int temp = arr1[index];
			arr1[index] = arr1[i];
			arr1[i] = temp;
		}
	}

}
