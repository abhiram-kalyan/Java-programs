class Patient{
 int Id,age;
 String Blood,Rh;
 Patient(){
 this.Id = 0;
 this.age =0;
 this.Rh="+";
 this.Blood = "O";
 }
 Patient(int Id,int age,String Blood,String Rh){
 this.Id = Id;
 this.age=age;
 this.Rh=Rh;
 this.Blood = Blood;
 }
 void getId(){
 System.out.println("Patient Id number is " + this.Id);
 } 
 void getage(){
 System.out.println("Age of thr Patient is " + this.age + " years old");
 }
 void getBlood(){
 System.out.println("Blood type is " + this.Blood);
 }
 void getRh(){
 System.out.println("Rh factor of Blood is " + this.Rh);
 }
}
public class TestPatient{
 public static void main(String[] args) {
 Patient p1 = new Patient();
 Patient p2 = new Patient(152685,48,"B","-");
 System.out.println("Details of Default Patient");
 p1.getId();
 p1.getage();
 p1.getBlood();
 p1.getRh();
 System.out.println("\n Details of Patient");
 p2.getId();
 p2.getage();
 p2.getBlood();
 p2.getRh();
 }
}