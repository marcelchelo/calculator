import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class calc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	double numA;
	double numB;
	double result;
	String	operation;
	String printAnswer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc frame = new calc();
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
	public calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 582, 644);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(82, 6, 434, 61);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().contains("Error")) {
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + button9.getText();
				textField.setText(EnterNumber);	
			}
		});
		button9.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		button9.setBounds(310, 169, 100, 100);
		contentPane.add(button9);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().contains("Error")) {
					textField.setText("");
				}
				
				
				String EnterNumber = textField.getText() + button8.getText();
				textField.setText(EnterNumber);	
				
			}
		});
		button8.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		button8.setBounds(171, 169, 100, 100);
		contentPane.add(button8);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(textField.getText().contains("Error")) {
					textField.setText("");
				}
				
				
				
				String EnterNumber = textField.getText() + button7.getText();
				textField.setText(EnterNumber);	
			}
		});
		button7.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		button7.setBounds(38, 169, 100, 100);
		contentPane.add(button7);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().contains("Error")) {
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + button6.getText();
				textField.setText(EnterNumber);	
			}
		});
		button6.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		button6.setBounds(310, 281, 100, 100);
		contentPane.add(button6);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().contains("Error")) {
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + button5.getText();
				textField.setText(EnterNumber);	
			}
		});
		button5.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		button5.setBounds(171, 281, 100, 100);
		contentPane.add(button5);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().contains("Error")) {
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + button4.getText();
				textField.setText(EnterNumber);	
			}
		});
		button4.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		button4.setBounds(38, 281, 100, 100);
		contentPane.add(button4);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().contains("Error")) {
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + button3.getText();
				textField.setText(EnterNumber);	
			}
		});
		button3.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		button3.setBounds(310, 393, 100, 100);
		contentPane.add(button3);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().contains("Error")) {
					textField.setText("");
				}
				String EnterNumber = textField.getText() + button2.getText();
				textField.setText(EnterNumber);	
			}
		});
		button2.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		button2.setBounds(171, 393, 100, 100);
		contentPane.add(button2);
		
		JButton button1 = new JButton("1");
		button1.setForeground(Color.BLACK);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().contains("Error")) {
					textField.setText("");
				}
				
				String EnterNumber = textField.getText() + button1.getText();
				textField.setText(EnterNumber);	
			}
		});
		button1.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		button1.setBounds(38, 393, 100, 100);
		contentPane.add(button1);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().contains("Error")) {
					textField.setText("");
				}
				
				
				if (textField.getText().isEmpty()) {					
					
					textField.setText(button0.getText());
					
				}
				
				if(textField.getText().contains("0.")) {
					
					String enterNumber = textField.getText() + button0.getText();
					textField.setText(enterNumber);	
				}
				
				
				if (textField.getText().isEmpty() == false && ( Double.parseDouble(textField.getText()) >0  || Double.parseDouble(textField.getText()) <0   ) ) {					
					String enterNumber = textField.getText() + button0.getText();
					textField.setText(enterNumber);
					
				}
				
				if(textField.getText().equals("00")  || textField.getText().equals("0") ) {
					
					textField.setText(button0.getText());	
				}
				
				
			}
		});
		button0.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		button0.setBounds(36, 505, 100, 100);
		contentPane.add(button0);
		
		
		
		JButton buttondot = new JButton(".");
		
		buttondot.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent e) {
					
					
				
					if(textField.getText().isEmpty()) {
						textField.setText(button0.getText());
						String EnterNumber = (  textField.getText()   + buttondot.getText());
						textField.setText(EnterNumber);	
						buttondot.setEnabled(false);
						
					}
					
					
					else {
						String EnterNumber = (  textField.getText()   + buttondot.getText());
						textField.setText(EnterNumber);	
						buttondot.setEnabled(false);
						
						
					}
					

						}
			
					}
			
		);

		

		buttondot.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		buttondot.setBounds(171, 505, 100, 100);
		contentPane.add(buttondot);
		
		JButton buttoneq = new JButton("=");
		buttoneq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer ;
				
				DecimalFormat format = new DecimalFormat("#.#####");
				
				
				numB  = Double.parseDouble(textField.getText());
				
				//addition
				if(operation == "+") {
					result =  numA + numB;
					//answer = String.valueOf(result);
					answer= String.valueOf(format.format(result));
					textField.setText(answer);
					
					if(textField.getText().contains(".")) {
						 buttondot.setEnabled(false);
						 
					 }
					 else  buttondot.setEnabled(true);
					
				}
				//subtraction 
				if(operation == "-") {
					result = numA - numB;
					answer= String.valueOf(format.format(result));
					textField.setText(answer);
					
					if(textField.getText().contains(".")) {
						 buttondot.setEnabled(false);
						 
					 }
					 else  buttondot.setEnabled(true);
							
					
				}
				
				//multiplication
				 if(operation == "*") {
					 result = numA *numB;
				
					 answer= String.valueOf(format.format(result));
					 textField.setText(answer);
					
					 if(textField.getText().contains(".")) {
						 buttondot.setEnabled(false);
						 
					 }
					 else  buttondot.setEnabled(true);
					
					 
						
				 }
				 
				 //division
				 if (operation == "/") {
					 if (numB != 0) {
					 result = numA / numB;
					 answer= String.valueOf(format.format(result));
					 textField.setText(answer);
					
					 	if(textField.getText().contains(".")) {
						 buttondot.setEnabled(false);
						 
					 	}
					 		else  buttondot.setEnabled(true);
					 }
						
					 else 	{
						 textField.setText("Error, Division by 0");
						  
						 
					 
					 }
					 
					 
				 }
			
				
			}
		});
		buttoneq.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		buttoneq.setBounds(283, 505, 168, 100);
		contentPane.add(buttoneq);
		
		JButton buttonplus = new JButton("+");
		buttonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				numA = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
				buttondot.setEnabled(true);
			}
		
		});
		buttonplus.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		buttonplus.setBounds(463, 505, 100, 100);
		contentPane.add(buttonplus);
		
		JButton buttontimes = new JButton("X");
		buttontimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numA = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
				buttondot.setEnabled(true);
				
			}
		});
		buttontimes.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		buttontimes.setBounds(463, 281, 100, 100);
		contentPane.add(buttontimes);
		
		JButton buttonminus = new JButton("-");
		buttonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numA = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
				buttondot.setEnabled(true);
				
			}
			
		});
		buttonminus.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		buttonminus.setBounds(463, 393, 100, 100);
		contentPane.add(buttonminus);
		
		JButton buttondivide = new JButton("÷");
		buttondivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numA = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
				buttondot.setEnabled(true);
				
			}
		});
		buttondivide.setFont(new Font("Lucida Grande", Font.PLAIN, 90));
		buttondivide.setBounds(463, 169, 100, 100);
		contentPane.add(buttondivide);
		
		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				buttondot.setEnabled(true);
			}
		});
		buttonC.setFont(new Font("Lucida Grande", Font.PLAIN, 86));
		buttonC.setBounds(38, 77, 141, 80);
		contentPane.add(buttonC);
		
		JButton buttonsign = new JButton("+/-");
		buttonsign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//if its 0
				
				if(textField.getText().equals("0")) {
					textField.setText(button0.getText());
						}
				
				
				//if it is positive 
				
				else if( Double.parseDouble(textField.getText())  > 0 ) {	
					String hold =textField.getText();
					textField.setText("-"  + hold);
					hold = "";
				
				}
				
				// if it contains -
				else if( textField.getText().startsWith("-") ) {
					textField.setText(textField.getText().substring(1));   
					
				}		
				
				
				
				
			}}
		);
		buttonsign.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		buttonsign.setBounds(385, 79, 178, 80);
		contentPane.add(buttonsign);
		
		JButton buttonAC = new JButton("AC");
		buttonAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numA= 0;
				numB =0;
				textField.setText(null);
				buttondot.setEnabled(true);
			}
		});
		buttonAC.setFont(new Font("Lucida Grande", Font.PLAIN, 75));
		buttonAC.setBounds(220, 79, 141, 80);
		contentPane.add(buttonAC);
	}
}
