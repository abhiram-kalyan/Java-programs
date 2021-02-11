public class Chat 
{
	boolean flag = false;
	public synchronized void Ask(String msg) 
	{
		if (flag) 
		{
			try 
			{
				wait();
	        } 	
			catch (InterruptedException e) 
			{
	            e.printStackTrace();
	        }
		}
	    System.out.println(msg);
	    flag = true;
	    notify();
	}

	public synchronized void Reply(String msg)
	{
	      
		if (!flag) 
		{
			try 
			{
	            wait();
	        } 
			catch (InterruptedException e) 
			{
	            e.printStackTrace();
	        }
		}
		System.out.println(msg);
		flag = false;
	    notify();
	}
	public static void main(String[] args) 
	{
		Chat m = new Chat();
	    new Herbert(m);
	    new Schildt(m);
	}
}
class Herbert implements Runnable 
{
	Chat m;
	String[] s1 = { "User1 : Hi", "User1 : R u Preparing for exams", "User1 : ok.Bye"};
	public Herbert(Chat m1) 
	{
		this.m = m1;
	    new Thread(this, "Question").start();
	}
	public void run() 
	{
		for (int i = 0; i < s1.length; i++) 
		{
	         m.Ask(s1[i]);
		}
	}
}
class Schildt implements Runnable 
{
	Chat m;
	String[] s2 = {"user2 : Hello","user2 : Yes","user2 : Bye."};
	public Schildt(Chat m2) 
	{
		this.m = m2;
	    new Thread(this, "Answer").start();
	}
	public void run() 
	{
		for (int i = 0; i < s2.length; i++) 
		{
			m.Reply(s2[i]);
	    }
	}
}