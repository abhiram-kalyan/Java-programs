import java.util.*;
public class DistanceFromAverageWithExceptionHandling{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double[] a=new double[5];
 double sum=0;
 int i=0,k=0;
 double avg,n=0;
 int size=5;
 int p=1;
 while(p!=0){
 try {
 System.out.println("Enter array size");
 size=Integer.parseInt(sc.nextLine());
 p=0;
 }
 catch (NumberFormatException e) {
 System.out.println("Size should be a number");
 }
 }
 try{
 a= new double[size];
 } 
 catch(NegativeArraySizeException e){
 size=5;
 System.out.println("Array size can not be negative value taking 5 as default value of size");
 }
 while(i<a.length){
 try{
 System.out.println("Enter the value");
 a[i]=Double.parseDouble(sc.nextLine());
 sum=sum+a[i];
 n=a[i];
 if(n==9999){
 k=i;
 i=a.length;
 }
 i++;
 }
 catch(Exception e){
 System.out.println("Value should be double");
 }
 }
 if(n==9999){
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
