import java.util.Arrays;

public class A26Merge2SortedArray {
	

	public static void main(String[] args) {
		int arr1[]= {1,2,4,6,9,10,-1,-1,-1,-1};
		int arr2[]= {3,5,7,8};
		int n=arr2.length;
		int m=(arr1.length-n);
		int k=m+n-1;
		while(m>0 && n>0)
			if(arr1[m-1]>arr2[n-1])
			{
				arr1[k--]=arr1[m-1];
				m--;
			}else
			{
				arr1[k--]=arr2[n-1];
				n--;
			}
		while(n>0)
		{
			arr1[k--]=arr2[n-1];
			n--;
		}
		System.out.println("Mergerd arrays are: " +Arrays.toString(arr1));
	} 

	}

