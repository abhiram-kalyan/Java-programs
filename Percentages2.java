import java.util.*;
public class Percentages2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value");
		double x=sc.nextDouble();
		System.out.println("Enter the Second value");
		double y=sc.nextDouble();
		computePercen(x,y);
		computePercen(y,x);
	}
	public static void computePercen(double x,double y)
	{
		double z=x/y;
		double percent=z*100;
		System.out.println(x +" is "+ percent + " percent of"+y);
	}
}