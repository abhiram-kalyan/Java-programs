import java.lang.Math;
public class MathTest{
 public static void main(String[] args) {
 double a = 37;
 System.out.println("Square root of " + a + " is " + Math.sqrt(a));
 double b = 300;
 double n=Math.toRadians(b);
 System.out.println("Sine of " + b + " is " + Math.sin(n));
 System.out.println("Cosine of " + b + " is " + Math.cos(n));
 double c = 22.8;
 System.out.println("Floor value of " + c + " is " + Math.floor(c));
 System.out.println("ceiling value of " + c + " is " + Math.ceil(c));
 System.out.println("Round value of " + c + " is " + Math.round(c));
 if ((char)(Math.max('D',71)) == 'D'){
 System.out.println("Largest of Character 'D' and integer 71 is 'D'");
 }
 else {
 System.out.println("Largest of Character 'D' and integer 71 is 71.");
 } 
 if ((char)(Math.min('D',71)) == 'D'){
 System.out.println("Smallest of Character 'D' and integer 71 is 'D'");
 }
 else {
 System.out.println("Smallest of Character 'D' and integer 71 is 71.");
 }
 System.out.println("A random number between 0 and 20 is " + 20*Math.random());
 }
}