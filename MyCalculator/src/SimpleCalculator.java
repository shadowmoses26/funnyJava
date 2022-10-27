import javax.swing.*;
import java.awt.FlowLayout;



public class SimpleCalculator {

	public static void main(String[] args) {
	
		
		//Создание панели
		
		JPanel windowContent = new JPanel ();
		
		//Менеджер отображения для этой панели
		
		
		FlowLayout f1 = new FlowLayout ();
		windowContent.setLayout(f1);
		
		
		//Создание компонентов в памяти
		
		JLabel label1 = new JLabel ("Номер 1:");
		JTextField field1 = new JTextField (10);
		JLabel label2 = new JLabel ("Номер 2:");
		JTextField field2 = new JTextField (10);
		JLabel label3 = new JLabel ("Сумма:");
		JTextField result  = new JTextField (10);
		JButton go = new JButton ("Добавить");
		
		
		// Добавление компонентов на панель
		
		
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
		
		// Создание фрейма и создание для него панели
		
		JFrame frame = new JFrame ("Мой funny калькулятор!");
		frame.setContentPane(windowContent);
		
		// Размер и видимость фрейма
		
		
		frame.setSize(400, 100);
		frame.setVisible(true);

		
		

	}

}
