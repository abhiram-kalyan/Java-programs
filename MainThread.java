import java.util.*;
class AdditionThread implements Runnable
{
int num;
Addition add;
Thread t;
int A1[][];
AdditionThread(int n, Addition add,int[][] A)
{
num = n;
this.add = add;
A1=A;
t = new Thread(this, "thread");
}
public synchronized void run()
{
add.AC(num,A1);
}
}
class Addition
{
static int col1=1;
static int col2=4;
static int col3=5;
static int col4=3;
static int col5=2;
public synchronized void AC(int num,int[][] A)
{
if(num==0)
{
for (int i=0; i<5; i++)
{
col1+= A[num][i];
}
}
else if(num==1)
{
for (int i=0; i<5; i++)
{
col2+= A[num][i];
}
}
else if(num==2)
{
for (int i=0; i<5; i++)
{
col3+= A[num][i];
}
}
else if(num==3)
{
for (int i=0; i<5; i++)
{
col4+= A[num][i];
}
}
else if(num==4)
{
for (int i=0; i<5; i++)
{
col5+= A[num][i];
}
}
}
}
public class MainThread
{
public static void main(String[] args)
{
Random rand = new Random();
int A[][]=new int[5][5];
for (int i = 0; i < A.length; i++)
{
for (int j = 0; j < A[i].length; j++)
{
A[i][j]=rand.nextInt(100);
}
}
Addition add= new Addition();
AdditionThread ob0 = new AdditionThread(0,add,A);
AdditionThread ob1 = new AdditionThread(1,add,A);
AdditionThread ob2 = new AdditionThread(2,add,A);
AdditionThread ob3 = new AdditionThread(3,add,A);
AdditionThread ob4 = new AdditionThread(4,add,A);
ob0.t.start();
ob1.t.start();
ob2.t.start();
ob3.t.start();
ob4.t.start();
int sum;
sum=add.col1+add.col2+add.col3+add.col4+add.col5;
System.out.println(sum);
}
}