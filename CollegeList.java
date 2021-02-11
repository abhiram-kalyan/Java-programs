import java.util.*;
class Person{
 String firstName;
 String lastName;
 String address;
 int pincode;
 long phonenum;
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

 public double getAvg()
 {
 return avg;
 }

 public void display()
 {
 super.display();
 System.out.println("His major is " + getMajor() + " and his average is " + getAvg());
 }
}

public class CollegeList
{
 public static void main(String[] args) 
 {
 CollegeEmployee[] c = new CollegeEmployee[4];
 Faculty[] f = new Faculty[3];
 Student[] s = new Student[7];
 Scanner sc = new Scanner(System.in);
 String response,fname,lname,address,dept,major;
 int pin,securitynum;
 double salary,avg;
 long phone;
 boolean tenured;
 String cont ="y";
 String QUIt = "Q";
 int i=0;
 int j=0;
 int k=0;
 System.out.println("Enter C for CollegeEmployee entry or F fot Faculty entry or S for Studententry");
 response = sc.nextLine();
 while(response!="Q"){
 if(response.equals("C")){
 while(cont.equals("y"))
 {
 c[i]=new CollegeEmployee();
 System.out.println("Enter first name");
 fname = sc.nextLine();
 c[i].setFirstName(fname);
 System.out.println("Enter last name");
 lname = sc.nextLine();
 c[i].setLastName(lname);
 System.out.println("Enter address");
 address = sc.nextLine(); 
 c[i].setAddress(address);
 System.out.println("Enter pin code");
 pin = sc.nextInt();
 c[i].setPincode(pin);
 System.out.println("Enter phone number");
 phone = sc.nextLong();
 c[i].setphonenum(phone);
 System.out.println("Enter security number");
 securitynum = sc.nextInt();
 c[i].setSnum(securitynum);
 System.out.println("Enter Anual salary");
 salary = sc.nextDouble();
 sc.nextLine();
 c[i].setAsal(salary);
 System.out.println("Enter department name");
 dept = sc.nextLine();
 c[i].setdept(dept);
 System.out.println("Enter more entries? (y/n)");
 cont = sc.nextLine();
 if(i==3){
 System.out.println("Entered maxium number of entries");
 cont="n";
 }
 i++;
 }
 System.out.println("Enter C for CollegeEmployee entry or F fot Faculty entry or S for Studententry");
 response = sc.nextLine();
 cont ="y";
 }
 if(response.equals("F")){ 
 while(cont.equals("y"))
 {
 f[j]=new Faculty();
 System.out.println("Enter first name: ");
 fname = sc.nextLine();
 f[j].setFirstName(fname);
 System.out.println("Enter last name");
 lname = sc.nextLine();
 f[j].setLastName(lname);
 System.out.println("Enter address");
 address = sc.nextLine();
 f[j].setAddress(address);
 System.out.println("Enter pin code");
 pin = sc.nextInt();
 f[j].setPincode(pin);
 System.out.println("Enter phone number");
 phone = sc.nextLong();
 f[j].setphonenum(phone);
 System.out.println("Enter security number");
 securitynum = sc.nextInt();
 f[j].setSnum(securitynum);
 System.out.println("Enter Anual salary");
 salary = sc.nextDouble();
 f[j].setAsal(salary);
 System.out.println("Enter department name");
 dept = sc.nextLine();
 sc.nextLine();
 f[j].setdept(dept);
 System.out.println("Enter true if tenured or enter false if not tenured");
 tenured=sc.nextBoolean();
 sc.nextLine(); 
 f[j].setTenured(tenured);
 System.out.println("Enter more entries ? (y/n)");
 cont = sc.nextLine();
 if(j==2){
 System.out.println("Entered maxium number of entries");
 cont="n";
 }
 j++;
 }
 System.out.println("Enter C for CollegeEmployee entry or F fot Faculty entry or S for Studententry");
 response = sc.nextLine();
 cont ="y";
 }
 if(response.equals("S")){
 while(cont.equals("y"))
 {
 s[k]=new Student();
 System.out.println("Enter first name");
 fname = sc.nextLine();
 s[k].setFirstName(fname);
 System.out.println("Enter last name");
 lname = sc.nextLine();
 s[k].setLastName(lname);
 System.out.println("Enter address");
 address = sc.nextLine();
 s[k].setAddress(address);
 System.out.println("Enter pin code");
 pin = sc.nextInt();
 s[k].setPincode(pin);
 System.out.println("Enter phone number"); 
 phone = sc.nextLong();
 sc.nextLine();
 s[k].setphonenum(phone);
 System.out.println("Enter major");
 major =sc.nextLine();
 s[k].setMajor(major);
 System.out.println("Enter average");
 avg=sc.nextDouble();
 sc.nextLine();
 s[k].setAvg(avg);
 System.out.println("Enter more entries? (y/n)");
 cont = sc.nextLine();
 if(k==6){
 System.out.println("Entered maxium number of entries");
 cont="n";
 }
 k++;
 }
 System.out.println("quiting");
 response="Q";


 }
 }
 if(response.equals("Q")){

 for (int p =0;p<i;p++){
 c[p].display();
 }
 for(int q=0;q<j;q++){
 f[q].display(); 
 }
 for(int r=0;r<k;r++){
 s[r].display();
 }
 }
 int h = 4-i;
 if(h!=0){
 System.out.println(h +" CollegeEmployee data not Entered");
 }
 h=3-j;
 if(h!=0){
 System.out.println(h+ " Faculty data not Entered");
 }
 h=7-k;
 if(h!=0){
 System.out.println(h + " Student data not Entered");
 }

 }
}