package test.main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Mission extends JFrame{
		public Mission(String title) {
			super(title);
			
			setBounds(100, 100, 500, 500);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setLayout(new BorderLayout());
			
			JTextArea ta = new JTextArea();
			add(ta, BorderLayout.CENTER);
			
			JButton saveBtn = new JButton("저장");
			this.add(saveBtn, BorderLayout.NORTH);
			
			setVisible(true);
		}
		
		public static void main(String[] args) {
			new Mission("나의 프레임");
		}
}
