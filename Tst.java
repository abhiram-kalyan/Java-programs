class person{
 String firstName;
 String lastName;
 String address;
 int pincode;
 long phonenum;
 void person(String x,String y,String z,int a,long b)
 {
  String firstName=x;
  String lastName=y;
  String address=z;
  int pincode=a;
  long phonenum=b;
 }
 void setFirstName(String firstName){
 this.firstName= firstName;
 }
 void setLastName(String lastName){
 this.lastName=lastName; 
 }
 void setAddress(String address){
 this.address = address;
 }
 void setPincode(int pincode){
 this.pincode = pincode;
 }
 void setphonenum(long phonenum){
 this.phonenum= phonenum;
 }
 void display(){
 System.out.println(this.firstName + " " + this.lastName + "'s " + "Address is " +
this.address + "," + this.pincode + ".Mobile number is " + this.phonenum);
 }
}
class CollegeEmployee extends Person{
 int sn;
 double a;
 String dept;
 void setSnum(int n){
 this.sn=n;
 }
 void setAsal(double b){
 this.a=b;
 }
 void setdept(String dept){
 this.dept=dept;
 } 
 void display(){
 super.display();
 System.out.println("His Security number is "+this.sn+" and Annual salary is"+this.a+". He belongs to Department of "+this.dept+".");
 }
}
class Faculty extends CollegeEmployee
{
 boolean tenured;
 void setTenured(boolean t){
 this.tenured=t;
 }

 public void display()
 {
 super.display();
 if(tenured){
 System.out.println("Faculty member is tenured");
 }
 else{
 System.out.println("Faculty member is not tenured");
 }

 }
}
class Student extends Person
{
 String major; 
 double avg;
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
 }
 public class Tst{
 	public void main(String[]args)
 	{
 		System.out.println("abhiram");
 	}
 }