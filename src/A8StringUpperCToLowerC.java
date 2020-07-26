import java.util.Scanner;

public class A8StringUpperCToLowerC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,str1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		sc.close();
		str1=str.toLowerCase();
		System.out.println(str1);
	}

}
