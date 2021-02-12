import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuBar extends JFrame  implements ActionListener
{
    JFrame f1;
    JMenu country,color,font;
    JMenu Type,Size;
    JMenuItem Australia,India,England,Bangladesh,Srilanka,UAE,Africa;
    JMenuItem bold,italic,s12,s14,s16,s18;
    JMenuItem custom;
    JTextArea ta;
    MenuBar()
    {
        f1 = new JFrame("MENU");
        
        JMenuBar mb = new JMenuBar();
        country = new JMenu("Country");
        color =  new JMenu("Color");
        font = new JMenu("Font");
        
        mb.add(country);
        mb.add(font);
        mb.add(color);
        
        f1.add(mb);
        f1.setJMenuBar(mb);
        
        Australia = new JMenuItem("Australia");
        Australia.addActionListener(this);
        India = new JMenuItem("India");
        India.addActionListener(this);
        England = new JMenuItem("England");
        England.addActionListener(this);
        Bangladesh = new JMenuItem("Bangladesh");
        Bangladesh.addActionListener(this);
        UAE = new JMenuItem("UAE");
        UAE.addActionListener(this);
        Srilanka = new JMenuItem("Srilanka");
        Srilanka.addActionListener(this);
        Africa = new JMenuItem("Africa");
        Africa.addActionListener(this);
        
        Type = new JMenu("Type");
        Size = new JMenu("Size");
        
        custom = new JMenuItem("custom");
        custom.addActionListener(this);
        
        country.add(Australia);
        country.add(India);
        country.add(England);
        country.add(Bangladesh);
        country.add(UAE);
        country.add(Srilanka);
        country.add(Africa);
        
        font.add(Type);
        font.add(Size);
        
        bold = new JMenuItem("Bold");
        italic = new JMenuItem("Italic");
        
        s12 = new JMenuItem("12");
        s12.addActionListener(this);
        s14 = new JMenuItem("14");
        s14.addActionListener(this);
        s16 = new JMenuItem("16");
        s16.addActionListener(this);
        s18 = new JMenuItem("18");
        s12.addActionListener(this);
                
        Type.add(bold);
        Type.add(italic);
        
        Size.add(s12);
        Size.add(s14);
        Size.add(s16);
        Size.add(s18);
        
        color.add(custom);
        
        ta = new JTextArea();
        ta.setBounds(5,5,390,390);
        f1.add(ta);
        
        f1.setSize(400,400);  
        f1.setLayout(null);  
        f1.setVisible(true);  
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    public void actionPerformed(ActionEvent e) 
    {
        String s = ta.getText();
        if(e.getSource() == Australia)
        {
            s = "Australia";
            ta.setText(s);
        }
        else if(e.getSource() == India)
        {
            s ="India";
            ta.setText(s);
        }
        else if(e.getSource() == Bangladesh)
        {
            s ="Bangladesh";
            ta.setText(s);
        }
		else if(e.getSource() == UAE)
        {
            s ="UAE";
            ta.setText(s);
        }
		else if(e.getSource() == Srilanka)
        {
            s ="Srilanka";
            ta.setText(s);
        }
		else if(e.getSource() == Africa)
        {
            s ="Africa";
            ta.setText(s);
        }
		else if(e.getSource() == England)
        {
            s ="England";
            ta.setText(s);
        }
        if(e.getSource() == custom)
        {
            Color c = JColorChooser.showDialog(this, s , Color.red);
            ta.setForeground(c);
        }
    }
    public static void main(String args[]) 
    {
        MenuBar m = new MenuBar();
    }
}