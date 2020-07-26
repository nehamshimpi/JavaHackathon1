import java.util.Arrays;
import java.util.Scanner;

public class A3SortNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int len=arr.length;
		Arrays.sort(arr);
		for(int num:arr)
		{
			System.out.println(num);
		}
		
	}

}
