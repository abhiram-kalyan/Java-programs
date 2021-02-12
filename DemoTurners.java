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
public class DemoTurners {
 public static void main(String[] args){
 Leaf l = new Leaf();
 Page p=new Page();
 Pancake c=new Pancake();
 l.turn();
 p.turn();
 c.turn();
 }
} 
