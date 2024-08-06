package tw.howard.wwww;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Howard16 extends JFrame {

	private JButton b1, b2, b3;

	public Howard16() {
		b1 = new JButton("機會");
		b2 = new JButton("命運");
		b3 = new JButton("...");		
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Howard16();
	}

}
