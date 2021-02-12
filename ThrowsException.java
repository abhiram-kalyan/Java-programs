import java.util.*;
class ScoreException extends Exception{
 ScoreException(String msg) {
 super(msg);
 }
}
class TestScore {
 String id;
 int marks;
 public TestScore(String id , int marks) throws ScoreException {
 
	if(marks < 100 && marks > 0) 
	{
		this.id = id;
		this.marks = marks;
		System.out.println("The student with id " + id +" has scored " + marks);
	}
	else
	{
		throw new ScoreException("Enter valid marks your score in test is 0");
	}
 }
}
public class ThrowsException{
 public static void main(String[] args) throws ScoreException{
  Scanner sc =new Scanner(System.in);
  String id;
  int marks;
  TestScore c[]=new TestScore[5];
  for(int i=0;i<5;i++)
  {
 	System.out.println("Enter student Id and Marks ");
 	id=sc.next();
 	marks=sc.nextInt();
 	try
	{
		c[i]=new TestScore(id,marks);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
  }

 } 
}