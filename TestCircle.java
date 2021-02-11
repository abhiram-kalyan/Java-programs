import java.lang.Math;
class Circle{
 double r;
 double d;
 double area;
 Circle(){
 this.r = 1;
 this.d = 2*1;
 this.area = Math.PI*1*1;
 }
 void setRadius(double r){
 this.r = r;
 this.d = 2*r;
 this.area = Math.PI*r*r; 
 }
 void getRadius(){
 System.out.println(this.r + "radius circle has " + this.d + " diameter and " + this.area
+ " area.");
 }
} 
public class TestCircle{
 public static void main(String[] args) {
 Circle c1 = new Circle();
 Circle c2 = new Circle();
 Circle c3 = new Circle();
 c1.setRadius(10);
 c2.setRadius(50);
 System.out.println("Values of small radius circle.");
 c1.getRadius();
 System.out.println("\nValues of larger radius circle.");
 c2.getRadius();
 System.out.println("\nValues of default constructed circle.");
 c3.getRadius();
 } 
}