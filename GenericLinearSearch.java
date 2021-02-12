import java.util.*;
public class GenericLinearSearch{
 static <T> int linearSearch(T[]a,T n){
 for(int i=0;i<a.length;i++){
 if(a[i].equals(n)){
 return i;
 }
 }
 return 0;
 }
 static <T> void printArray(T[] a){
 for(int i=0;i<a.length;i++){
 System.out.print(a[i]+" ");
 }
 System.out.println();
 }
 public static void main(String[] args) {
 Integer [] a={1,2,3,4,5,6,7,8,9};
 Integer k1=5;
 printArray(a);
 int k = linearSearch(a,k1);
 System.out.println(k1 + " is found at index " + k);
 String [] str = {"Abhiram","Karthik","Santhosh","Kalyan","Adithya"};
 String k2="Kalyan";
 printArray(str);
 int p = linearSearch(str,k2);
 System.out.println(k2 + " is found at index " + p); 
 }
}