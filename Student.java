import java.util.*;
public class Student
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