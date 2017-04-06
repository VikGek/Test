import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.MatteBorder;
import javax.swing.JTextField;

public class Calc extends JFrame {

	private JPanel contentPane;
	CalcCore calculator = new CalcCore();
	private JTextField textField;
	
	ActionListener buttonPress = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = ((JButton)e.getSource()).getText();
			calculator.SymbolEnter(s);
			textField.setText(calculator.display);
		}

	};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0,
				0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("0");
		btnNewButton.setBackground(new Color(216, 191, 216));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(75, 0, 130));
		btnNewButton.setBounds(115, 228, 55, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(buttonPress);

		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(buttonPress);
		btnNewButton_1.setBackground(new Color(216, 191, 216));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.setForeground(new Color(75, 0, 130));
		btnNewButton_1.setBounds(35, 194, 55, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(buttonPress);
		btnNewButton_2.setBackground(new Color(216, 191, 216));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_2.setForeground(new Color(75, 0, 130));
		btnNewButton_2.setBounds(115, 194, 55, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(buttonPress);
		btnNewButton_3.setBackground(new Color(216, 191, 216));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_3.setForeground(new Color(75, 0, 130));
		btnNewButton_3.setBounds(192, 194, 56, 23);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(buttonPress);
		btnNewButton_4.setBackground(new Color(216, 191, 216));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_4.setForeground(new Color(75, 0, 130));
		btnNewButton_4.setBounds(35, 160, 55, 23);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(buttonPress);
		btnNewButton_5.setBackground(new Color(216, 191, 216));
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_5.setForeground(new Color(75, 0, 130));
		btnNewButton_5.setBounds(115, 160, 55, 23);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(buttonPress);
		btnNewButton_6.setBackground(new Color(216, 191, 216));
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_6.setForeground(new Color(75, 0, 130));
		btnNewButton_6.setBounds(192, 160, 56, 23);
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(buttonPress);
		btnNewButton_7.setBackground(new Color(216, 191, 216));
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_7.setForeground(new Color(75, 0, 130));
		btnNewButton_7.setBounds(35, 126, 55, 23);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(buttonPress);
		btnNewButton_8.setBackground(new Color(216, 191, 216));
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_8.setForeground(new Color(75, 0, 130));
		btnNewButton_8.setBounds(115, 126, 55, 23);
		contentPane.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(buttonPress);
		btnNewButton_9.setBackground(new Color(216, 191, 216));
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_9.setForeground(new Color(75, 0, 130));
		btnNewButton_9.setBounds(192, 126, 56, 23);
		contentPane.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("=");
		btnNewButton_10.addActionListener(buttonPress);
		btnNewButton_10.setBackground(new Color(216, 191, 216));
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_10.setForeground(new Color(75, 0, 130));
		btnNewButton_10.setBounds(192, 228, 56, 23);
		contentPane.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(buttonPress);
		btnNewButton_11.setBackground(new Color(216, 191, 216));
		btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_11.setForeground(new Color(75, 0, 130));
		btnNewButton_11.setBounds(308, 126, 55, 23);
		contentPane.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(buttonPress);
		btnNewButton_12.setBackground(new Color(216, 191, 216));
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_12.setForeground(new Color(75, 0, 130));
		btnNewButton_12.setBounds(308, 160, 55, 23);
		contentPane.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("*");
		btnNewButton_13.addActionListener(buttonPress);
		btnNewButton_13.setBackground(new Color(216, 191, 216));
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_13.setForeground(new Color(75, 0, 130));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_13.setBounds(308, 194, 55, 23);
		contentPane.add(btnNewButton_13);

		JButton button = new JButton("/");
		button.addActionListener(buttonPress);
		button.setBackground(new Color(216, 191, 216));
		button.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button.setForeground(new Color(75, 0, 130));
		button.setBounds(308, 228, 55, 23);
		contentPane.add(button);

		JButton btnNewButton_14 = new JButton("C");
		btnNewButton_14.addActionListener(buttonPress);
		btnNewButton_14.setBounds(35, 228, 70, 23);
		contentPane.add(btnNewButton_14);

		textField = new JTextField();
		textField.setBounds(10, 11, 353, 74);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
