import java.util.*;
public class PaintCalculator
{
	public static void  main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length");
		double len=sc.nextDouble();
		System.out.println("Enter the Width");
		double wid=sc.nextDouble();
		System.out.println("Enter the Height");
		double height=sc.nextDouble();
		double area=areacalc(len,wid,height);
		double price=pricecalc(area);
		System.out.println("The cost to paint a "+len+"-by-"+wid+"-foot room with "+height+"-foot ceilings is $" +price);
	}
	public static double areacalc(double a,double b,double c)
	{
		double x=2*a*c;
		double y=2*b*c;
		double area = x+y;
		return area;
	}
	public static double pricecalc(double p)
	{
		double a=p/350;
		System.out.println("The number of gallons of paint required to paint the room is "+a);
		double price =a*32;
		return price;
	}

}