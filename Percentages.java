public class Percentages
{
	public static void main(String[]args)
	{
		double x=2.0;
		double y=5.0;
		computePercen(x,y);
		computePercen(y,x);
	}
	public static void computePercen(double x,double y)
	{
		double z=x/y;
		double percent=z*100;
		System.out.println(x +" is "+ percent + " percent of "+y);
	}
}