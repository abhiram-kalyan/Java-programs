import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyWindowAdapter extends WindowAdapter{
 public void windowClosing(WindowEvent we) {
 System.exit(0);
 }

}
class Listeners {
 static int pars= 600;
 static int pos = 750;
 static int ls = 825;
 static int b1= 75;
 static int b2 = 150;
 static int b3 = 225;
 static int m = 200;
 static int lr = 0;
 static int br = 0;
 static int mc = 0;
 static JRadioButton park,pool,lake,one,two,three,yes,no;
 static JButton Cal;
 static JTextField total;
 static class ClickMeListener implements ActionListener{ 
 public void actionPerformed(ActionEvent e)
 {
 Object source = e.getSource();
 if(source == Cal){
 double totalRent = lr + br + mc;
 total.setText("Total amount $ " + totalRent);
 }
 }
}
 static class blistener implements ItemListener{
 public void itemStateChanged(ItemEvent e){
 Object source = e.getItem();
 if(source == one){
 br = b1;
 }
 else if(source == two){
 lr = pars;
 }
 else if(source == lake){
 lr=ls;
 }
 else{
 lr=0;
 }
 }
}
static class llistener implements ItemListener{
 public void itemStateChanged(ItemEvent e)
 {
 Object source = e.getItem(); 
 if(source == park){
 lr = pars;
 }
 else if(source == pool){
 lr = pos;
 }
 else if(source == lake){
 lr = ls;
 }
 else{
 lr=0;
 }
 }
}
static class mlistener implements ItemListener{
 public void itemStateChanged(ItemEvent e)
 {
 Object source = e.getItem();
 if(source == yes){
 mc = m;
 }
 else if(source == no){
 mc = 0;
 }
 else{
 mc= 0;
 }
 }
}
}
public class JVacationRental{ 
 public static void main(String[] args) {
 Listeners y = new Listeners();
 Frame f = new JFrame("Rental price calculator");
 f.setSize(350,160);
 Panel p = new Panel();
 p.setLayout(new FlowLayout());
 y.park= new JRadioButton("park side");
 y.pool= new JRadioButton("pool side");
 y.lake= new JRadioButton("lake side");
 y.one= new JRadioButton("one room");
 y.two= new JRadioButton("two room");
 y.three= new JRadioButton("three room");
 y.yes= new JRadioButton("Yes");
 y.no= new JRadioButton("No");
 y.Cal= new JButton("Total");
 y.total=new JTextField(15);
 ButtonGroup l=new ButtonGroup();
 l.add(y.park);
 l.add(y.pool);
 l.add(y.lake);
 ButtonGroup b=new ButtonGroup();
 b.add(y.one);
 b.add(y.two);
 b.add(y.three);
 ButtonGroup yn=new ButtonGroup();
 yn.add(y.yes);
 yn.add(y.no);
 p.add(new JLabel("Location"));
 p.add(y.park);
 p.add(y.pool);
 p.add(y.lake); 
 p.add(new JLabel("Rooms"));
 p.add(y.one);
 p.add(y.two);
 p.add(y.three);
 p.add(new JLabel("Meals"));
 p.add(y.yes);
 p.add(y.no);
 p.add(y.Cal);
 p.add(y.total);
 y.park.addItemListener(new Listeners.llistener());
 y.pool.addItemListener(new Listeners.llistener());
 y.lake.addItemListener(new Listeners.llistener());
 y.one.addItemListener(new Listeners.blistener());
 y.two.addItemListener(new Listeners.blistener());
 y.three.addItemListener(new Listeners.blistener());
 y.yes.addItemListener(new Listeners.mlistener());
 y.no.addItemListener(new Listeners.mlistener());
 y.Cal.addActionListener(new Listeners.ClickMeListener());
 f.add(p);
 f.addWindowListener(new MyWindowAdapter());
 f.setVisible(true);
 }
} 