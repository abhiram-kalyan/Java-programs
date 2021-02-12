import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyWindowAdapter extends WindowAdapter{
 public void windowClosing(WindowEvent we) {
 System.exit(0);
 }

}
class DataType{
 int single=40;
 int dual=75;
 int pet=95;
 int onl=90;
 int sum=0;
 JCheckBox ib,ob,sb,tb,pb;
 JTextField total;
}
class CheckMeListener extends DataType implements ItemListener{
 public void itemStateChanged(ItemEvent e){
 Object source=e.getSource();
 int select=e.getStateChange();
 if(source==ib)
 {

 if(select==ItemEvent.SELECTED){
 sum+=single;
 }
 else{
 sum-=single;
 }
 }
 else if(source==ob)
 {
 if(select==ItemEvent.SELECTED){
 sum+=onl;
 }
 else{
 sum-=onl;
 }
 }
 else if(source==sb)
 {
 if(select==ItemEvent.SELECTED){
 sum+=single;
 }
 else{
 sum-=single;
 }
 }
 else if(source==tb)
 {
 if(select==ItemEvent.SELECTED){
 sum+=dual;
 } 
 else{
 sum-=dual;
 }
 }
 else if(source==pb)
 {
 if(select==ItemEvent.SELECTED){
 sum+=pet;
 }
 else{
 sum-=pet;
 }
 }
 total.setText("$"+sum);
 }
}
public class JPhotoFrame{
 public static void main(String[] args) {
 CheckMeListener y=new CheckMeListener();
 JFrame f = new JFrame("Photo price calculator");
 f.setSize(400,150);
 Panel p = new Panel();
 p.setLayout(new FlowLayout());
 y.ib=new JCheckBox("In studio");
 y.ob=new JCheckBox("out studio");
 y.sb=new JCheckBox("One Person");
 y.tb=new JCheckBox("Two Subjects");
 y.pb=new JCheckBox("Pet");
 y.total=new JTextField("TOTAL",15);
 ButtonGroup lg=new ButtonGroup(); 
 lg.add(y.ib);
 lg.add(y.ob);
 p.add(new JLabel("Select one location"));
 p.add(y.ib);
 p.add(y.ob);
 ButtonGroup m=new ButtonGroup();
 m.add(y.sb);
 m.add(y.tb);
 m.add(y.pb);
 p.add(new JLabel("Select one Subject"));
 p.add(y.sb);
 p.add(y.tb);
 p.add(y.pb);
 y.ib.addItemListener(y);
 y.ob.addItemListener(y);
 y.sb.addItemListener(y);
 y.tb.addItemListener(y);
 y.pb.addItemListener(y);
 p.add(y.total);
 f.add(p);
 f.addWindowListener(new MyWindowAdapter());
 f.setVisible(true);
 }
}