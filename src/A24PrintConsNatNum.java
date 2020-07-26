import java.util.Scanner;

public class A24PrintConsNatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		//sc.close();
		for (int i = 1; i < num; i++) {
			StringBuffer sb = new StringBuffer();
			int sum = i;
			sb.append(i).append(" ");
			for (int j = i + 1; sum < num; j++) {
				sb.append(j).append(" ");
				sum = sum + j;
				if (sum == num) {
					System.out.println(sb.toString());
				}
			}
		}

	}

}
