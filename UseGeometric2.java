abstract class GeometricFigure {
 int height, width;
 String figureType;
 int area,sides;
 abstract void Area(int h, int w);
}
interface SidedObject{
 public void display();
}
class Square2 extends GeometricFigure implements SidedObject{
 Square2(int a, int b){
 super.height=a;
 super.width=b;
 super.sides=4;
 Area(a,b);
 }
 void Area(int h, int w) { 
 super.area=(h*w);
 }
 public void display(){
 System.out.println("Area of the figure is " + super.area + " and number of sides are " +
super.sides);
 }
}
class Triangle2 extends GeometricFigure implements SidedObject{
 Triangle2(int a, int b){
 super.height=a;
 super.width=b;
 super.sides=3;
 Area(a,b);
 }
 void Area(int h, int w) {
 super.area=(h*w)/2;
 }
 public void display(){
 System.out.println("Area of the figure is " + super.area + " and number of sides are " +
super.sides);
 }
}
public class UseGeometric2 {
 public static void main(String[] args){
 Square2 s=new Square2(15,15);
 Triangle2 t=new Triangle2(20,30);
 s.display();
 t.display();
 } 
}