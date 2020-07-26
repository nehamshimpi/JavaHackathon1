
public class A1TwoBooleanRTrue {

	static boolean twoOrMoreTrue(boolean a, boolean b,boolean c)
	{
		return((a&&b)||(a&&c)||(b&&c));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a =true;
		boolean b =false;
		boolean c =true;
		System.out.println(" a && b " +(a&&b));
		System.out.println(" a && c " +(a&&c));
		System.out.println(" b && c " +(b&&c));
		System.out.println(twoOrMoreTrue(a,b,c));
		
	}

}
