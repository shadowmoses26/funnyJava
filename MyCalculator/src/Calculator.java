import javax.swing.*;
import java.awt.*;

public class Calculator {

	
	
	JPanel windowContent;
	JFormattedTextField displayField;
	JButton buttons [];
	JButton buttonPoint;
	
	JButton buttonEqual;
	JPanel p1;
	
	JButton buttonPlus;
	JButton buttonMinus;
	JButton buttonSplit;
	JButton buttonMultiply;
	JPanel p2; 
	
	
	
		Calculator (){
			
			windowContent = new JPanel ();
			buttons = new JButton [10];
			
			BorderLayout bl = new BorderLayout ();
			windowContent.setLayout(bl);
			
			displayField = new JFormattedTextField ();
			displayField.setHorizontalAlignment(SwingConstants.RIGHT);
			windowContent.add ("North", displayField);
			
			
			
			for (int i = 9; i >= 0; i--) {
				buttons [i] = new JButton (String.valueOf(i));
			}
			
			buttonPoint = new JButton (".");
			buttonEqual = new JButton ("=");
			buttonPlus = new JButton ("+");
			buttonMinus = new JButton ("-");
			buttonSplit = new JButton ("/");
			buttonMultiply = new JButton ("*");
			
			p1 = new JPanel ();
			GridLayout gl = new GridLayout (4,3);
			p1.setLayout(gl);
			
			for (int i = 9; i >= 0; i--) {
				p1.add(buttons[i]);
			}
			
			p1.add(buttonPoint);
			p1.add(buttonEqual);
			
			windowContent.add("Center", p1);
			
			p2 = new JPanel ();
			GridLayout gl1 = new GridLayout (4,3);
			p2.setLayout(gl1);
			
			p2.add(buttonPlus);
			p2.add(buttonMinus);
			p2.add(buttonSplit);
			p2.add(buttonMultiply);
			
			windowContent.add("East", p2);
			
			JFrame frame = new JFrame ("Calculator");
			frame.setContentPane(windowContent);
			
			frame.pack();
			
			frame.setVisible(true);
			
		}
		public static void main (String [] args) {
			
			Calculator calc = new Calculator();
		}
	

	}


