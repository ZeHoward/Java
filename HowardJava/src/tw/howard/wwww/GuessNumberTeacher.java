package tw.howard.wwww;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumberTeacher extends JFrame implements ActionListener {
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	private String answer;
	private int counter;

	public GuessNumberTeacher() {
		super("猜數字遊戲");

		input = new JTextField();
		guess = new JButton("猜");
		log = new JTextArea();

		setLayout(new BorderLayout());

		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);

		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		init();
		initEvent();
	}

	private void init() {
		answer = createAnswer(4);
		counter = 0;
//		System.out.println(answer);
	}

	private void initEvent() {
		guess.addActionListener(this);
	}

	private static String createAnswer(int d) {
		final int nums = 10;
		int[] poker = new int[nums];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;

		for (int i = nums - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < d; i++) {
			sb.append(poker[i]);
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		new GuessNumberTeacher();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;

		String g = input.getText();
		String result = checkAB(g, answer);
		log.append(String.format("%d. %s => %s\n", counter, g, result));

		input.setText("");

		if (result.equals("4A0B")) {
			JOptionPane.showMessageDialog(null, "WINNER");
		} else if (counter == 10) {
			JOptionPane.showMessageDialog(null, "Loser:" + answer);
		}

	}

	private static String checkAB(String g, String a) {
		int A = 0, B = 0;

		for (int i = 0; i < a.length(); i++) {
			if (g.charAt(i) == a.charAt(i)) {
				A++;
			} else if (a.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		return String.format("%dA%dB", A, B);
	}

}