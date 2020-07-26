import java.util.Scanner;

public class A28FactOdNumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj = new Calculation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		sc.close();
		int a = obj.fact(num);
		System.out.println("The factorial of the number is : " + a);
	}

}

class Calculation {
	int fact(int n) {
		int result;

		if (n == 1)
			return 1;

		result = fact(n - 1) * n;
		return result;
	}
}
