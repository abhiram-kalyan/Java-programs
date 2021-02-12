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
public class DemoTurners2{
 public static void main(String[] args){
 Leaf l = new Leaf();
 Page p=new Page();
 Pancake c=new Pancake();
 Switch rt= new Switch();
 Direction he = new Direction(); 
 l.turn();
 p.turn();
 c.turn();
 rt.turn();
 he.turn();
 }
}