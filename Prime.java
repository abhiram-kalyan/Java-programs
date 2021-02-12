import java.util.*;
class Thread1 extends Thread
{
	Scanner sc = new Scanner(System.in);
	int num;
	public void run()
	{
		num = sc.nextInt();
	}
}
class Thread2 extends Thread1
{
	public void run()
	{
		System.out.println(num);
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) 
	    {
	      if (num % i == 0) 
	      {
	        flag = true;
	        break;
	      }
	    }
	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	 }
}
public class Prime 
{
	public static void main(String args[]) throws InterruptedException
	{
		Thread1 t1 = new Thread1();
		t1.start();
		t1.join();
		Thread2 t2 = new Thread2();
		t2.start();
	}
}