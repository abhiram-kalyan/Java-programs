import java.util.*;
public class InchConversion
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of inches");
		Double a=sc.nextDouble();
		inctofeet(a);
		inctoyard(a);
	}
	public static void inctofeet(double x)
	{
		Double feet= x/12;
		System.out.println("The number of feet in "+ x +" inches is "+feet);
	}
	public static void inctoyard(double x)
	{
		Double yard= x/48;
		System.out.println("The number of yard in "+ x +" inches is "+yard);
	}
}