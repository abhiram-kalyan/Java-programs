import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TemperatureSwing {
	TemperatureSwing(){
		JFrame jfrm = new JFrame("Temperature Calculation");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300, 300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NumberFormat format = DecimalFormat.getInstance();
		
		JLabel cel = new JLabel("Enter Temperature in Celsius");
		jfrm.add(cel);
		JFormattedTextField celInput = new JFormattedTextField(format);
		celInput.setColumns(20);
		jfrm.add(celInput);
		
		JLabel kel = new JLabel("Temperature in Kelvin: ");
		jfrm.add(kel);
		JFormattedTextField kelOut = new JFormattedTextField(format);
		kelOut.setColumns(20);
		kelOut.setEditable(false);
		jfrm.add(kelOut);
		
		JLabel fah = new JLabel("Temperature in Fahrenheit: ");
		jfrm.add(fah);
		JFormattedTextField fahOut = new JFormattedTextField(format);
		fahOut.setColumns(20);
		fahOut.setEditable(false);
		jfrm.add(fahOut);
		
		JButton calc = new JButton("Calculate");
		calc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double kelOutNumber = (((Number)celInput.getValue()).doubleValue() + 273.15);
				double fahOutNumber = (((Number)celInput.getValue()).doubleValue() * 9/5) + 32;
				kelOut.setText(String.valueOf(kelOutNumber));
				fahOut.setText(String.valueOf(fahOutNumber));
			}
		});
		jfrm.add(calc);
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new TemperatureSwing();
			}
		});
	}
}