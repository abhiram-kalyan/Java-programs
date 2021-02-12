public class PhoneCallArray{
 public static void main(String[] args) {
 IncomingPhoneCall in[]=new IncomingPhoneCall[3];
 OutgoingPhoneCall out[]=new OutgoingPhoneCall[5];
 in[0]=new IncomingPhoneCall("9856412345");
 in[1]=new IncomingPhoneCall("94851265126");
 in[2]=new IncomingPhoneCall("78843204566");
 out[0]= new OutgoingPhoneCall("8456131361",50);
 out[1]= new OutgoingPhoneCall("9456123789",60);
 out[2]= new OutgoingPhoneCall("7541237896",70);
 out[3]= new OutgoingPhoneCall("7148529632",80);
 out[4]= new OutgoingPhoneCall("8794561235",90);
 for(int i=0;i<3;i++){
 in[i].getInf();
 }
 for(int j=0;j<5;j++){
 out[j].getInf();
 }
 } 
} 