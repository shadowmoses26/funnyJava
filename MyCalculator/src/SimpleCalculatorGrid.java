import javax.swing.*;
import java.awt.*;

public class SimpleCalculatorGrid {

	public static void main(String[] args) {

		JPanel windowContent = new JPanel ();
		
		GridLayout gl = new GridLayout (4,2);
		windowContent.setLayout(gl);
		
		JLabel labell = new JLabel ("����� 1:");
		JTextField field1 = new JTextField (10);
		JLabel label2 = new JLabel ("����� 2:");
		JTextField field2 = new JTextField (10);
		JLabel label3 = new JLabel ("�����:");
		JTextField result  = new JTextField (10);
		JButton go = new JButton ("��������");
		
		windowContent.add(labell);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
		
		JFrame frame = new JFrame ("��� funny calc!");
		frame.setContentPane(windowContent);
		
		frame.setSize (400, 100);
		frame.setVisible (true);
		
		
	}

}
