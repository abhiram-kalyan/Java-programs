class Person
{
String firstName;
String lastName;
String address;
int pincode;
long phonenum;
Person(String firstName,String lastName,String address,int pincode,long
phonenum)
{
this.firstName=firstName;
this.lastName=lastName;
this.address=address;
this.pincode=pincode;
this.phonenum=phonenum;
}
void setFirstName(String firstName)
{
this.firstName= firstName;
}
void setLastName(String lastName)
{
this.lastName=lastName;
}
void setAddress(String address)
{
this.address = address;
}
void setPincode(int pincode)
{
this.pincode = pincode;
}
void setphonenum(long phonenum)
{
this.phonenum= phonenum;
}
public String toString()
{
System.out.println();
return this.firstName + " " + this.lastName + "'s " + "Address is " +
this.address + "," + this.pincode + ".Mobile number is " + this.phonenum;
}
}
class Student extends Person
{
String major;
double avg;
Student(String firstName,String lastName,String address,int pincode,long
phonenum,String major,double avg)
{
super(firstName,lastName,address,pincode,phonenum);
this.major=major;
this.avg=avg;
}
void setMajor(String major)
{
this.major = major;
}
void setAvg(double avg)
{
this.avg = avg;
}
public String getMajor()
{
return major;
}
public double getAvg()
{
return avg;
}
public String toString()
{
String str=super.toString();
System.out.println(str);
return "His major is " + getMajor() + " and his average is " + getAvg();
}
}
class Faculty extends CollegeEmployee
{
boolean tenured;
Faculty(String firstName,String lastName,String address,int pincode,Long
phonenum,int f,double g,String h,boolean i)
{
super(firstName,lastName,address,pincode,phonenum,f,g,h);
this.tenured=i;
}
void setTenured(boolean t)
{
this.tenured=t;
}
public String toString()
{
String str=super.toString();
System.out.println(str);
if(tenured)
{
return "Faculty member is tenured";
}
else
{
return "Faculty member is not tenured";
}
}
}
class CollegeEmployee extends Person
{
int sn;
double a;
String dept;
CollegeEmployee(String firstName,String lastName,String address,int
pincode,Long phonenum,int f,double g,String h)
{
super(firstName,lastName,address,pincode,phonenum);
this.sn=f;
this.a=g;
this.dept=h;
}
void setSnum(int n)
{
this.sn=n;
}
void setAsal(double b)
{
this.a=b;
}
void setdept(String dept)
{
this.dept=dept;
}
public String toString()
{
String str=super.toString();
System.out.println(str);
return "His Security number is "+this.sn+" and Annual salary is "+this.a+".He belongs to Department of "+this.dept+".";
}
}
interface GenericQueuable<T>
{
public void insertEnd(T e);
public void removeBegin();
public void printQueue();
public boolean isQueueEmpty();
}
class GenericQueue<T> implements GenericQueuable<T>
{
int front,rear;
int max;
T a[];
GenericQueue(int max)
{
this.max=max;
front=rear=0;
a=(T[]) new Object[max];
}
public void insertEnd(T e)
{
if(rear==max)
{
System.out.println("Queue is full");
}
else
{
a[rear]=e;
rear++;
}
}
public void removeBegin()
{
if(front==rear)
{
System.out.println("Queue is empty");
}
else
{
for(int j=0;j<rear-1;j++)
{
a[j]=a[j+1];
}
rear--;
}
}
public void printQueue()
{
for(int i=front;i<rear;i++)
{
System.out.print(a[i] + " ");
}
System.out.println();
}
public boolean isQueueEmpty()
{
if(rear==front)
{
return true;
}
else
{
return false;
}
}
}
public class GenericQueueDemo
{
public static void main(String[] args)
{
GenericQueue<Person> gq= new GenericQueue<Person>(3);
Person p1=new Person("Abhriam","Madduru","Nellore",524003,9908421937L);
 Person p2=new CollegeEmployee("Karamasetty"," Kaushik","Hyderabad",500038,9030438751L,64,800000,"CSE");
 Person p3=new Faculty("nilesh","kota","guntur",522001,7555799528L,54,1100000,"CSE",true);
 Person p4=new Student("Tom","riddle","Chennai",524511,9014548993L,"ECE",8.89);

gq.insertEnd(p1);
gq.insertEnd(p2);
gq.insertEnd(p3);
gq.printQueue();
gq.removeBegin();
gq.insertEnd(p4);
gq.printQueue();
}
}
