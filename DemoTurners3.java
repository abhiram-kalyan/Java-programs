interface Turner {
 public void turn();
}
class Leaf implements Turner{
 public void turn() {
 System.out.println("Changing colors");
 } 
}
class Page implements Turner{
 public void turn() {
 System.out.println("Going to the next page");
 }
}
class Pancake implements Turner{
 public void turn() {
 System.out.println("Flipping");
 }
}
class  Switch implements Turner{
 public void turn() {
 System.out.println("Turn on/off the Switch");
 }
}
class Direction  implements Turner{
 public void turn() {
 System.out.println("chanching the direction");
 }
}
public class DemoTurners3 {
 public static void main(String[] args){
 Turner t;
 t = new Leaf();
 t.turn();
 t=new Page();
 t.turn();
 t=new Pancake();
 t.turn(); 
 t= new Switch();
 t.turn();
 t = new Direction();
 t.turn();
 }
}