import java.util.Scanner;
public class QuartsToGallonsInteractive{
public static void main(String args[]) {
 Scanner sc=new Scanner (System.in);
 int qg = 4;
 System.out.println("Enter the quarts");
 int n = sc.nextInt();
 System.out.println("A job that needs " + n + " quarts required " + n/qg + " gallons plus "+n%qg + " quarts");
}
} 