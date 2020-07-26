import java.util.Scanner;

public class A4Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("How many numbers do u want in the array: ");
		int size=sc.nextInt();
		//sc.close();
		int arr[]=new int[size];
		System.out.println("Enter all numbers: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		int i=size-1;
		for(int j=0;j<size/2;j++,i--)
		{
			 if(i>(size/2))
			 {
				 if(arr[i]==arr[j])
				 {
					 flag=1;
				 }
			 }
		}
		
		if(flag==1)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}

	
}


