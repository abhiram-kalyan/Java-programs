import java.util.*; 
public class Buffer 
{ 
	public static void main(String[] args) throws InterruptedException 
    {  
        final PC pc = new PC(); 
        Thread t1 = new Thread(new Runnable() 
        { 
            public void run() 
            { 
                try 
                { 
                    pc.produce(); 
                } 
                catch (InterruptedException e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        });
        Thread t2 = new Thread(new Runnable() 
        { 
            public void run() 
            { 
                try 
                { 
                    pc.consume(); 
                } 
                catch (InterruptedException e)
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
        t1.start(); 
        t2.start(); 
        
        t1.join(); 
        t2.join(); 
    } 
	public static class PC
	{ 
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>(); 
        int capacity = 5; 
        int N;
        int sum = 0;
        public void produce() throws InterruptedException 
        { 
        	System.out.println("Enter no.of elements");
        	N = sc.nextInt();
            int value[] = new int[capacity]; 
            if(N % 5 == 0 && N != 0)
			{
				while (sum < N) 
				{	 
					synchronized (this) 
					{ 
						while (queue.size() == capacity) 
						{
							wait();
						}							
						System.out.println("------------------------------------------"); 
						for(int i = 0; i < capacity; i++)
						{
							System.out.println("Enter the amount to produced");
							value[i] = sc.nextInt();
						}
						System.out.println("------------------------------------------"); 
						for(int i = 0; i < capacity; i++)
						{
							queue.add(value[i]); 
							System.out.println("Producer produced "+ value[i]); 
							Thread.sleep(500); 
						}
						notify(); 
					}
					sum = sum + 5;					
				}
			}
			else
			{
				System.out.println("check that no.of elements should be multiple of 5");
			}				
        } 
        public void consume() throws InterruptedException 
        { 
			while (sum <= N) 
			{ 
				synchronized (this) 
				{ 
					while (queue.size() == 0) 
						wait(); 
					int val [] = new int[capacity];
					System.out.println("------------------------------------------"); 
					for(int i = 0; i < capacity; i++)
					{
						val[i] = queue.remove(); 
						System.out.println("Consumer consumed " + val[i]); 
						Thread.sleep(500); 
					} 
					notify(); 
				} 
				sum = sum + 5;
			}
			
        } 
    } 
}