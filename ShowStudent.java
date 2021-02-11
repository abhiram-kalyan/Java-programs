import java.util.*;
 class Student
{
   private int studentID;
   int hours;
   int points;
   double gradepoints;

public void setID(int ID)
{
 studentID=ID;
}
public int getID()
{
 return studentID;
}
 public void setHour(int hour)
{
 hours= hour;
}
 public int getHour()
{
 return hours;
}
public void setPoints(int point)
{
 points = point;
}
public double getPoints()
{
 return points;
}
public double calculateGPA()
{
   gradepoints = points/(double)hours;
   return gradepoints;
}
}

public class ShowStudent
{
public static void main (String args[])
{
    Scanner sin=new Scanner(System.in);
    Student pupil = new Student();
    System.out.println("Enter the Student ID: ");
    int ID=sin.nextInt();
    System.out.println("Enter the number of hours: ");
    int hour=sin.nextInt();
    System.out.println("Enter the Student's Points: ");
    int point=sin.nextInt();
    pupil.setID(ID);
    pupil.setHour(hour);
    pupil.setPoints(point);
    pupil.getID();
    pupil.getPoints();
    pupil.getHour();
    System.out.println("The grade point average is "+ pupil.calculateGPA());
    System.out.println(" ");
    }
}