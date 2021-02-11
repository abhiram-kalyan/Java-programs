class BloodData{
 String Blood,Rh;
 BloodData(){
 this.Blood = "O";
 this.Rh = "+";
 }
 BloodData(String Blood,String Rh){
 this.Blood=Blood;
 this.Rh=Rh;
 }
 void setBlood(String Blood){
 this.Blood=Blood; 
 }
 void setRh(String Rh){
 this.Rh=Rh;
 }
 void getBlood(){
 System.out.println("Blood type is " + this.Blood);
 }
 void getRh(){
 System.out.println("Rh factor of Blood " + this.Blood + " is " + this.Rh);
 }
}
public class TestBloodData{
 public static void main(String[] args) {
 BloodData b1 = new BloodData();
 BloodData b2 = new BloodData("AB","-");
 b1.getBlood();
 b1.getRh();
 b2.getBlood();
 b2.getRh();
 b1.setBlood("A");
 b1.setRh("-");
 System.out.println("After using set methods");
 b1.getBlood();
 b1.getRh();
}
}