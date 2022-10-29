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
			
			
			
			for (int i = 7; i <= 9; i ++) {
				buttons [i] = new JButton (String.valueOf(i));
			}
			for (int b = 4; b <= 6; b ++) {
				buttons [b] = new JButton (String.valueOf(b));
			}
			for (int c = 1; c <= 3; c ++) {
				buttons [c] = new JButton (String.valueOf(c));
			}
			for (int d = 0; d <= 0; d ++) {
				buttons [d] = new JButton (String.valueOf(d));
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
			
			for (int i = 7; i <= 9; i ++) {
				p1.add(buttons[i]);
			}
			for (int b = 4; b <= 6; b ++) {
				p1.add(buttons[b]);
			}
			for (int c = 1; c <= 3; c ++) {
				p1.add(buttons[c]);
			}
			for (int d = 0; d <= 0; d ++) {
				p1.add(buttons[d]);
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


