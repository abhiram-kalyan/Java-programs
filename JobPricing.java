import java.util.*;
class JobPricing
{
	static int estimatecost(int a,int b,int c)
	{
		return a+35*b+12*c;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the job :");
		String name=sc.nextLine();
		System.out.println("Enter the cost of the materials required");
		int mcost=sc.nextInt();
		System.out.println("Enter the number of hours required :");
		int rtime=sc.nextInt();
		System.out.println("Enter the number of hours travel time :");
		int ttime=sc.nextInt();
		int cost=estimatecost(mcost,rtime,ttime);
		System.out.println("The estimated cost of "+name+" is $"+cost);
		
	}
}