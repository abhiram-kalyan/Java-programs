import java.util.*;
class CollegeCourse
{
 double Ch = 120.00;
 String dpt;
 int num;
 int c;
 double cf;
 CollegeCourse(String d, int n, int nc)
 {
 dpt = d.toUpperCase();
 num = n;
 c = nc;
 cf = Ch * c;
 }
 String getdpt()
 {
 return dpt;
 }
 int getcourseNo()
 {
 return num;
 } 
 int getCredits()
 {
 return c;
 }
 double getcourseFee()
 {
 return cf;
 }
 void display()
 {
 System.out.println("department " + this.getdpt());
 System.out.println("Course number " + this.getcourseNo());
 System.out.println("Credit hours " + this.getCredits());
 System.out.println("Course fee " + this.getcourseFee());
 }
}
class LabCourse extends CollegeCourse
{
 double lf = 50.00;
 double cf;
 LabCourse(String dpt, int cn, int c)
 {
 super(dpt, cn, c);
 cf = super.getcourseFee() + lf;
 }
 double getLabCourseFee()
 {
 return cf; 
 }
 void display()
 {
 System.out.println("department " + super.getdpt());
 System.out.println("Course number " + super.getcourseNo());
 System.out.println("Credit hours " + super.getCredits());
 System.out.println("Course fee " + this.getLabCourseFee());
 }
}
public class UseCourse{
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the department of the course: ");
 String dept = sc.nextLine();
 System.out.print("Enter the number of the courses ");
 int number = sc.nextInt();
 System.out.print("Enter the credit hours of the courses ");
 int hours = sc.nextInt();
 if(dept.equals("BIO") || dept.equals("CHM")|| dept.equals("CIS") || dept.equals("PHY"))
 {
 LabCourse l = new LabCourse(dept, number, hours);
 l.display();
 }
 else
 {
 CollegeCourse c = new CollegeCourse(dept, number, hours);
 c.display();
 } 
 }
} 