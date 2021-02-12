import java .util.*;
class th implements Runnable
{  	int x=1;
	int y=2;
	Thread t=new Thread(this,"demo");
	
	public void run()
	{
		System.out.println(x+y);
		System.out.println(x*y);
	}

}
public class demothread
{ 
	public static void main(String[]args)
	{
		th nt =new th();
		nt.t.start();
		try{

		Thread.sleep(1000);
	}
	catch(InterruptedException e){
		System.out.println("abhiram");
	}

		System.out.println("end");
	}
	
}