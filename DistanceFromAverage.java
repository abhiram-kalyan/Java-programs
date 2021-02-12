import java.util.Scanner;
public class DistanceFromAverage{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double[] a=new double[15];
 double sum=0;
 int i=0,k=0;
 double avg,n=0;
 System.out.println("For exiting enter 9999 as value");
 while(i<a.length){
 System.out.println("Enter the value");
 a[i]=Double.parseDouble(sc.nextLine());
 sum=sum+a[i];
 n=a[i];
 if(n==99999){
 k=i;
 i=a.length;
 }
 i++;
 } 
 if(n==99999){
 i=k;
 System.out.println((a.length-i) + " values not entered");
 }
 else{
 avg=sum/(i+1);
 for(int j=0;j<a.length;j++){
 System.out.println(a[j] + " is ," + (a[j]-avg) + " distance away from average "+avg);
 }
 }
 }
} 