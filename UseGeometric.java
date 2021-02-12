abstract class GeometricFigure {
 int height, width;
 String figureType;
 int area;
 abstract void Area(int h, int w);
}
class Square extends GeometricFigure{
 Square(int a, int b){
 super.height=a;
 super.width=b; 
 Area(a,b);
 }
 void Area(int h, int w) {
 super.area=(h*w);
 }
}
class Triangle extends GeometricFigure{
 Triangle(int a, int b){
 super.height=a;
 super.width=b;
 Area(a,b);
 }
 void Area(int h, int w) {
 area=(h*w)/2;
 }

}
public class UseGeometric {
 public static void main(String[] args){
 GeometricFigure f[]=new GeometricFigure[2];
 Square s=new Square(20,20);
 Triangle t=new Triangle(10,20);
 f[0]=s;
 f[1]=t;
 }

} 