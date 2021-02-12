import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FXSandwich
{
String sandwichIngredients [] = {"Chicken", "Mutton", "Veg"};
String breadTypes[] = {"Hero","Hoagie", "Submarine"};
JFrame jf;
JPanel p1, p2, p3, p4, mainP;
JList ingredient, bread;
JLabel ingL, breadL, amountL;
JTextField amountT;
JButton amountB, exitB; FXSandwich()
{
jf = new JFrame("Sandwich Shop"); p1 = new JPanel();
p2 = new JPanel();
p3 = new JPanel();
p4 = new JPanel();
mainP = new JPanel();
ingredient = new JList<String>(sandwichIngredients);
bread = new JList<String>(breadTypes);
ingL = new JLabel("Select Sandwich Ingredients");
breadL = new JLabel("Select Bread Types");
amountL = new JLabel("Amount: ");
amountT = new JTextField(5);
amountB = new JButton("Check Amount");
exitB = new JButton("Exit");
p1.add(ingL);
p1.add(ingredient);
p2.add(breadL);
p2.add(bread);
p3.add(amountL);
p3.add(amountT);
p4.add(amountB);
p4.add(exitB);
mainP.add(p1);
mainP.add(p2);
mainP.add(p3);
mainP.add(p4);
mainP.setLayout(new GridLayout(4, 1)); jf.add(mainP);
jf.setVisible(true);
jf.setSize(400, 300); exitB.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
System.exit(0);
}
});
amountB.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
int indexIngredient = ingredient.getSelectedIndex(); int indexBread =
bread.getSelectedIndex();
if(indexIngredient == 0 && indexBread == 0) amountT.setText("150");
if(indexIngredient == 0 && indexBread == 1) amountT.setText("170");
if(indexIngredient == 0 && indexBread == 2) amountT.setText("200");
if(indexIngredient == 1 && indexBread == 0) amountT.setText("180");
if(indexIngredient == 1 && indexBread == 1) amountT.setText("200");
if(indexIngredient == 1 && indexBread == 2) amountT.setText("230");
if(indexIngredient == 2 && indexBread == 0) amountT.setText("100");
if(indexIngredient == 2 && indexBread == 1) amountT.setText("120");
if(indexIngredient == 2 && indexBread == 2) amountT.setText("150");
}
});
}
public static void main(String[] args)
{
new FXSandwich();
}
}