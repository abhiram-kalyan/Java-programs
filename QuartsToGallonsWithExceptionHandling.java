import java.util.*;
public class QuartsToGallonsWithExceptionHandling{
 public static void main(String[] args) {
 Scanner sc=new Scanner (System.in);
 int qg = 4;
 int p=1;
 while(p!=0){
 try{
 System.out.println("Enter the quarts");
 int n = Integer.parseInt(sc.nextLine());
 System.out.println("A job that needs " + n + " quarts required " + n/qg + "gallons plus " +n%qg + " quarts");
 p=0;
 }
 catch(Exception e){
 System.out.println("Input error. Input should be Integer");
 }
 }
 } 
} 