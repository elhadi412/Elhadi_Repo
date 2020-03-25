import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class Application {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JButton add;
	private JButton subtract;
	private JTextField answer;
	private JLabel answerLbl;
	private JLabel lblElhadisCalculator;
	private JButton fourBtn;
	private JButton fiveBtn;
	private JButton sixBtn;
	private JButton sevenBtn;
	private JButton eightBtn;
	private JButton nineBtn;
	private JButton multiply;
	private JButton divide;
	private JButton zeroBtn;
	private int roller = 0000;
	private int finalAnswer;
	private JButton btnClr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("First Project");
		frame.getContentPane().setBackground(new Color(204, 204, 153));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(73, 76, 107, 29);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(213, 76, 107, 29);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		//ADD Button
		add = new JButton("ADD");
		add.setForeground(new Color(51, 153, 153));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2,ans;

				try{
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 + num2;
					finalAnswer = ans;
					answer.setText(Integer.toString(ans));
					
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		add.setBounds(6, 117, 84, 29);
		frame.getContentPane().add(add);
		
		//Subtract Button
		subtract = new JButton("SUB");
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
			
				
				try{
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 - num2;
					finalAnswer = ans;
					answer.setText(Integer.toString(ans));
					
					
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
				
			}
		});
		subtract.setForeground(new Color(51, 153, 153));
		subtract.setBounds(6, 150, 84, 29);
		frame.getContentPane().add(subtract);
		
		answer = new JTextField();
		answer.setBounds(81, 22, 239, 42);
		frame.getContentPane().add(answer);
		answer.setColumns(10);
		
		answerLbl = new JLabel("Answer");
		answerLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		answerLbl.setBackground(Color.WHITE);
		answerLbl.setForeground(new Color(173, 255, 47));
		answerLbl.setBounds(19, 34, 61, 16);
		frame.getContentPane().add(answerLbl);
		
		lblElhadisCalculator = new JLabel("Elhadi's Calculator");
		lblElhadisCalculator.setFont(new Font("Apple Chancery", Font.PLAIN, 16));
		lblElhadisCalculator.setForeground(new Color(102, 102, 153));
		lblElhadisCalculator.setBounds(314, 248, 155, 29);
		frame.getContentPane().add(lblElhadisCalculator);
		
		JButton oneBtn = new JButton("1");
		oneBtn.setForeground(new Color(0, 191, 255));
		oneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					if(roller == 0000){
						textFieldNum1.setText("1");
						roller = 21;
					}
					else{
						textFieldNum2.setText("1");
						roller = 0000;
					}
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "False");
				}
			}
		});
		oneBtn.setBounds(126, 128, 49, 29);
		frame.getContentPane().add(oneBtn);
		
		JButton twoBtn = new JButton("2");
		twoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(roller == 0000){
						textFieldNum1.setText("2");
						roller = 21;
					}
					else{
						textFieldNum2.setText("2");
						roller = 0000;
					}
				}
				
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "False");
				}
			}
			
		});
		twoBtn.setForeground(new Color(0, 191, 255));
		twoBtn.setBounds(184, 128, 49, 29);
		frame.getContentPane().add(twoBtn);
		
		JButton threeBtn = new JButton("3");
		threeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(roller == 0000){
						textFieldNum1.setText("3");
						roller = 21;
					}
					else{
						textFieldNum2.setText("3");
						roller = 0000;
					}
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "False");
				}
			}
			
		});
		threeBtn.setForeground(new Color(0, 191, 255));
		threeBtn.setBounds(242, 128, 49, 29);
		frame.getContentPane().add(threeBtn);
		
		fourBtn = new JButton("4");
		fourBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(roller == 0000){
						textFieldNum1.setText("4");
						roller = 21;
					}
					else{
						textFieldNum2.setText("4");
						roller = 0000;
					}
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "False");
				}
			
			}
		});
		fourBtn.setForeground(new Color(0, 191, 255));
		fourBtn.setBounds(126, 161, 49, 29);
		frame.getContentPane().add(fourBtn);
		
		fiveBtn = new JButton("5");
		fiveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(roller == 0000){
						textFieldNum1.setText("5");
						roller = 21;
					}
					else{
						textFieldNum2.setText("5");
						roller = 0000;
					}
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "False");
				}
			
			}
		});
		fiveBtn.setForeground(new Color(0, 191, 255));
		fiveBtn.setBounds(184, 161, 49, 29);
		frame.getContentPane().add(fiveBtn);
		
		sixBtn = new JButton("6");
		sixBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(roller == 0000){
						textFieldNum1.setText("6");
						roller = 21;
					}
					else{
						textFieldNum2.setText("6");
						roller = 0000;
					}
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "False");
				}
			
			}
		});
		sixBtn.setForeground(new Color(0, 191, 255));
		sixBtn.setBounds(242, 161, 49, 29);
		frame.getContentPane().add(sixBtn);
		
		sevenBtn = new JButton("7");
		sevenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(roller == 0000){
						textFieldNum1.setText("7");
						roller = 21;
					}
					else{
						textFieldNum2.setText("7");
						roller = 0000;
					}
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "False");
				}
			
			}
		});

		sevenBtn.setForeground(new Color(0, 191, 255));
		sevenBtn.setBounds(126, 191, 49, 29);
		frame.getContentPane().add(sevenBtn);
		
		eightBtn = new JButton("8");
		eightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(roller == 0000){
						textFieldNum1.setText("8");
						roller = 21;
					}
					else{
						textFieldNum2.setText("8");
						roller = 0000;
					}
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "False");
				}
			
			}
		});
		eightBtn.setForeground(new Color(0, 191, 255));
		eightBtn.setBounds(184, 191, 49, 29);
		frame.getContentPane().add(eightBtn);
		
		nineBtn = new JButton("9");
		nineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(roller == 0000){
						textFieldNum1.setText("9");
						roller = 21;
					}
					else{
						textFieldNum2.setText("9");
						roller = 0000;
					}
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "False");
				}
			
			}
		});
		nineBtn.setForeground(new Color(0, 191, 255));
		nineBtn.setBounds(242, 191, 49, 29);
		frame.getContentPane().add(nineBtn);
		
		multiply = new JButton("MUL");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 * num2;
					finalAnswer = ans;
					answer.setText(Integer.toString(ans));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "ERROR*MULT");
				}
			}
		});
		multiply.setForeground(new Color(51, 153, 153));
	
		multiply.setBounds(6, 180, 84, 29);
		frame.getContentPane().add(multiply);
		
		divide = new JButton("DIV");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2=0;
				double ans;

				try{
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 / num2;
					//finalAnswer = ans;
					answer.setText(Double.toString(ans));
					
				}
				catch (Exception e1) {
					// TODO: handle exception
					if(num2==0){
						JOptionPane.showMessageDialog(null, "Undefined");
					}
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		divide.setForeground(new Color(51, 153, 153));
		divide.setBounds(6, 212, 84, 29);
		frame.getContentPane().add(divide);
		zeroBtn = new JButton("0");
		zeroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(roller == 0000){
						textFieldNum1.setText("0");
						roller = 21;
					}
					else{
						textFieldNum2.setText("0");
						roller = 0000;
					}
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "False");
				}
			
			}
		});
		zeroBtn.setForeground(new Color(0, 191, 255));
		zeroBtn.setBounds(184, 223, 49, 29);
		frame.getContentPane().add(zeroBtn);
		
		btnClr = new JButton("CLR");
		btnClr.setForeground(new Color(255, 0, 0));
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					roller = 0000;
					textFieldNum1.setText(" ");
					textFieldNum2.setText(" ");
					answer.setText(" ");
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "ERROR (CLR)");
				}
			}
		});
		btnClr.setBounds(339, 139, 84, 50);
		frame.getContentPane().add(btnClr);
		
		

	
	}
}
