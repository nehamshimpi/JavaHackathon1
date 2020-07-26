import java.util.Scanner;

public class A2FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		long factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		a = sc.nextInt();
		sc.close();
		for (int i = 1; i <= a; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of number is: " + factorial);
	}

}
