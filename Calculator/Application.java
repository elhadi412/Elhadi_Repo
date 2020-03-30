import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class Calculy {
    
    private JFrame frame;
    private JButton add;
    private JButton subtract;
    private JTextField answer;
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
    private int num1=0, ans=0;
    private float divNum1=0, divNum2 = 0,divAns=0;
    int num2 = 0;
    private int index = 0;
    private Stack<Object> answerStack = new Stack<>();
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculy window = new Calculy();
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
    public Calculy() {
        initialize();
    }
    
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame("First Project");
        frame.getContentPane().setBackground(new Color(204, 204, 153));
        frame.setBounds(100, 100, 447, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        
        //ADD Button
        add = new JButton("ADD (+)");
        add.setForeground(new Color(51, 153, 153));
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                
                try{
                    //
                    answer.setText(answer.getText() + " + ");
                    
                    index = answer.getText().toString().indexOf("+");
                    System.out.println("Index: " + index);
                    
                    if(index==1){
                        JOptionPane.showMessageDialog(null, "MUST ENTER 1st Number");
                        answer.setText("");
                    }
                    else{
                        num1 = Integer.parseInt(answer.getText().substring(0,index-1));
                        System.out.println("NUM1: " + num1);
                    }
                    
                }
                catch (Exception e1) {
                    // TODO: handle exception
                    //JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
                    e1.printStackTrace();
                }
                
            }
        });
        add.setBounds(6, 117, 84, 29);
        frame.getContentPane().add(add);
        
        //Subtract Button
        subtract = new JButton("SUB (-)");
        subtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //				float num1, num2, ans;
                
                
                try{
                    answer.setText(answer.getText() + " - ");
                    
                    index = answer.getText().toString().indexOf("-");
                    System.out.println("Index: " + index);
                    
                    if(index==1){
                        JOptionPane.showMessageDialog(null, "MUST ENTER 1st Number");
                        answer.setText("");
                    }
                    else{
                        num1 = Integer.parseInt(answer.getText().substring(0,index-1));
                        System.out.println("NUM1: " + num1);
                    }
                    
                    
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
        answer.setBounds(81, 48, 239, 42);
        frame.getContentPane().add(answer);
        answer.setColumns(10);
        
        lblElhadisCalculator = new JLabel("Elhadi's Calculator");
        lblElhadisCalculator.setFont(new Font("Apple Chancery", Font.PLAIN, 16));
        lblElhadisCalculator.setForeground(new Color(102, 102, 153));
        lblElhadisCalculator.setBounds(0, 306, 155, 29);
        frame.getContentPane().add(lblElhadisCalculator);
        
        JButton oneBtn = new JButton("1");
        oneBtn.setForeground(new Color(0, 191, 255));
        oneBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                try{
                    //					if(roller == 0000){
                    //						textFieldNum1.setText("1");
                    //						roller = 21;
                    //					}
                    //					else{
                    //						textFieldNum2.setText("1");
                    //						roller = 0000;
                    //					}
                    answer.setText(answer.getText() +"1");
                    
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
                    //					if(roller == 0000){
                    //						textFieldNum1.setText("2");
                    //						roller = 21;
                    //					}
                    //					else{
                    //						textFieldNum2.setText("2");
                    //						roller = 0000;
                    //					}\
                    answer.setText(answer.getText() +"2");
                    
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
                    //					if(roller == 0000){
                    //						textFieldNum1.setText("3");
                    //						roller = 21;
                    //					}
                    //					else{
                    //						textFieldNum2.setText("3");
                    //						roller = 0000;
                    //					}
                    answer.setText(answer.getText() +"3");
                    
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
                    //					if(roller == 0000){
                    //						textFieldNum1.setText("4");
                    //						roller = 21;
                    //					}
                    //					else{
                    //						textFieldNum2.setText("4");
                    //						roller = 0000;
                    //					}
                    answer.setText(answer.getText() +"4");
                    
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
                    //					if(roller == 0000){
                    //						textFieldNum1.setText("5");
                    //						roller = 21;
                    //					}
                    //					else{
                    //						textFieldNum2.setText("5");
                    //						roller = 0000;
                    //					}
                    answer.setText(answer.getText() +"5");
                    
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
                    //					if(roller == 0000){
                    //						textFieldNum1.setText("6");
                    //						roller = 21;
                    //					}
                    //					else{
                    //						textFieldNum2.setText("6");
                    //						roller = 0000;
                    //					}
                    answer.setText(answer.getText() +"6");
                    
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
                    //					if(roller == 0000){
                    //						textFieldNum1.setText("7");
                    //						roller = 21;
                    //					}
                    //					else{
                    //						textFieldNum2.setText("7");
                    //						roller = 0000;
                    //					}
                    answer.setText(answer.getText() +"7");
                    
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
                    //					if(roller == 0000){
                    //						textFieldNum1.setText("8");
                    //						roller = 21;
                    //					}
                    //					else{
                    //						textFieldNum2.setText("8");
                    //						roller = 0000;
                    //					}
                    answer.setText(answer.getText() +"8");
                    
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
                    //					if(roller == 0000){
                    //						textFieldNum1.setText("9");
                    //						roller = 21;
                    //					}
                    //					else{
                    //						textFieldNum2.setText("9");
                    //						roller = 0000;
                    //					}
                    answer.setText(answer.getText() +"9");
                    
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
        
        multiply = new JButton("MUL (*)");
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //				float num1,num2,ans;
                try {
                    
                    answer.setText(answer.getText() + " * ");
                    
                    index = answer.getText().toString().indexOf("*");
                    System.out.println("Index: " + index);
                    
                    if(index==1){
                        JOptionPane.showMessageDialog(null, "MUST ENTER 1st Number");
                        answer.setText("");
                    }
                    else{
                        num1 = Integer.parseInt(answer.getText().substring(0,index-1));
                        System.out.println("NUM1: " + num1);
                    }
                    
                } catch (Exception e2) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, "ERROR*MULT");
                }
            }
        });
        multiply.setForeground(new Color(51, 153, 153));
        
        multiply.setBounds(6, 180, 84, 29);
        frame.getContentPane().add(multiply);
        
        divide = new JButton("DIV (/)");
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //				float num1, num2=(float) 0.0;
                //				float ans;
                
                try{
                    answer.setText(answer.getText() + " / ");
                    
                    index = answer.getText().toString().indexOf("/");
                    System.out.println("Index: " + index);
                    
                    if(index==1){
                        JOptionPane.showMessageDialog(null, "MUST ENTER 1st Number");
                        answer.setText("");
                    }
                    else{
                        //						num1 = Integer.parseInt(answer.getText().substring(0,index-1));
                        divNum1 = Float.parseFloat(answer.getText().substring(0,index-1));
                        
                        System.out.println("NUM1: " + num1);
                    }
                    
                }
                catch (Exception e1) {
                    // TODO: handle exception
                    if(divNum2==0){
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
                    //					if(roller == 0000){
                    //						textFieldNum1.setText("0");
                    //						roller = 21;
                    //					}
                    //					else{
                    //						textFieldNum2.setText("0");
                    //						roller = 0000;
                    //					}
                    answer.setText(answer.getText() +"0");
                    
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
                    //roller = 0000;
                    //textFieldNum1.setText(" ");
                    //textFieldNum2.setText(" ");
                    answer.setText("");
                } catch (Exception e2) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, "ERROR (CLR)");
                }
            }
        });
        btnClr.setBounds(340, 106, 84, 50);
        frame.getContentPane().add(btnClr);
        
        JButton btnEnter = new JButton("ENTER");
        btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if(answer.getText().contains("+")){
                        num2 = Integer.parseInt(answer.getText().substring(index+2,answer.getText().length()));
                        finalAnswer = num1 + num2;
                        answer.setText(answer.getText() + " = " + finalAnswer);
                        System.out.println("NUM2: " + num2 + " Finalanswer: " + finalAnswer);
                        answerStack.push(finalAnswer);
                    }
                    
                    if(answer.getText().contains("-")){
                        num2 = Integer.parseInt(answer.getText().substring(index+2,answer.getText().length()));
                        finalAnswer = num1 - num2;
                        answer.setText(answer.getText() + " = " + finalAnswer);
                        System.out.println("NUM2: " + num2 + " Finalanswer: " + finalAnswer);
                        answerStack.push(finalAnswer);
                    }
                    
                    if(answer.getText().contains("*")){
                        num2 = Integer.parseInt(answer.getText().substring(index+2,answer.getText().length()));
                        finalAnswer = num1 * num2;
                        answer.setText(answer.getText() + " = " + finalAnswer);
                        System.out.println("NUM2: " + num2);
                        answerStack.push(finalAnswer);
                        
                    }
                    
                    if(answer.getText().contains("/")){
                        divNum2 = Float.parseFloat(answer.getText().substring(index+2,answer.getText().length()));
                        
                        //							num2 = Integer.parseInt(answer.getText().substring(index+2,answer.getText().length()));
                        //							finalAnswer = num1/num2;
                        divAns = divNum1/divNum2;
                        //							answer.setText(answer.getText() + " = " + finalAnswer);
                        answer.setText(answer.getText() + " = " + divAns);
                        
                        //							System.out.println("NUM2: " + num2);
                        System.out.println("NUM2: " + divNum2);
                        
                        //							answerStack.push(finalAnswer);
                        answerStack.push(divAns);
                        
                        
                    }
                    
                    
                } catch (Exception e2) {
                    // TODO: handle exception
                }
                
            }
        });
        
        btnEnter.setForeground(Color.BLACK);
        btnEnter.setBounds(340, 223, 84, 50);
        frame.getContentPane().add(btnEnter);
        
        JButton prevAnswer = new JButton("ANS");
        prevAnswer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answer.setText(answerStack.pop().toString());
                
            }
        });
        prevAnswer.setForeground(Color.BLACK);
        prevAnswer.setBounds(340, 164, 84, 50);
        frame.getContentPane().add(prevAnswer);
        
        
        
    }
    
}
