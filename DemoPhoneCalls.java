abstract class PhoneCall
{
 String phn;
 double price;
 PhoneCall(String phn)
 {
 this.phn = phn;
 this.price = 0.0;
 }
 abstract String getPhoneNumber();
 abstract double getPrice(); 
 abstract void getInf();
 abstract void setPrice();
} 
class IncomingPhoneCall extends PhoneCall {
 double r=0.02;
 IncomingPhoneCall(String phoneNumber){
 super(phoneNumber);
 setPrice();
 }
 void setPrice() {
 super.price = 0.02;
 }
 void getInf(){
 System.out.println("Incoming phone call for "+getPhoneNumber()+",Price for a call is$"+getPrice());
 }
 String getPhoneNumber()
 {
 return super.phn;
 }
 double getPrice()
 {
 return super.price;
 }
}
class OutgoingPhoneCall extends PhoneCall {
 double r = 0.04;
 int minutes; 
 OutgoingPhoneCall(String phoneNumber, int minutes){
 super(phoneNumber);
 this.minutes = minutes;
 setPrice();
 }
 void setPrice() {
 super.price = 0.04;
 }
 void getInf() {
 System.out.println("Outgoing phone call for " + getPhoneNumber() + " "+ r + " per minute at " +
minutes + " minutes is $" + price*minutes);
 }
 public String getPhoneNumber()
 {
 return super.phn;
 }
 public double getPrice()
 {
 return super.price;
 }
} 
public class DemoPhoneCalls {
public static void main(String [] args) {
 IncomingPhoneCall in=new IncomingPhoneCall("9014914993");
 OutgoingPhoneCall out=new OutgoingPhoneCall("9456552237",40);
 in.getInf();
 out.getInf();
 }
}