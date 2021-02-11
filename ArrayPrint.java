import java.util.*;
public class ArrayPrint{
 static <T> void printArray(T[] a){
 for(int i=0;i<a.length;i++){
 System.out.print(a[i]+" ");
 }
 System.out.println();
 }
 public static void main(String[] args) {
 Integer [] a={1,2,3,4,5,6,7,8,9};
 String [] str = {"Abhiram","Karthik","Santhosh","Kalyan","Adithya"};
 printArray(a);
 printArray(str);
 }
}