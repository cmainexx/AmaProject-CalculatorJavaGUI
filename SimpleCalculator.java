import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculator {

	private JFrame frmSimpleCalculator;
	private JTextField firstNumberText;
	private JTextField secondNumberText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frmSimpleCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimpleCalculator = new JFrame();
		frmSimpleCalculator.setTitle("Simple Calculator");
		frmSimpleCalculator.setBounds(100, 100, 603, 519);
		frmSimpleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleCalculator.getContentPane().setLayout(null);
		
		firstNumberText = new JTextField();
		firstNumberText.setBounds(281, 66, 163, 34);
		frmSimpleCalculator.getContentPane().add(firstNumberText);
		firstNumberText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Number");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel.setBounds(126, 73, 105, 16);
		frmSimpleCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblSecondNumber.setBounds(126, 120, 127, 16);
		frmSimpleCalculator.getContentPane().add(lblSecondNumber);
		
		secondNumberText = new JTextField();
		secondNumberText.setColumns(10);
		secondNumberText.setBounds(281, 113, 163, 34);
		frmSimpleCalculator.getContentPane().add(secondNumberText);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblResult.setBounds(126, 169, 59, 16);
		frmSimpleCalculator.getContentPane().add(lblResult);
		
		JButton subtractButton = new JButton("SUBTRACT");
		subtractButton.setBounds(292, 222, 152, 43);
		frmSimpleCalculator.getContentPane().add(subtractButton);
		
		JButton multiplyButton = new JButton("MULTIPLY");
		
		multiplyButton.setBounds(126, 278, 152, 43);
		frmSimpleCalculator.getContentPane().add(multiplyButton);
		
		JButton divideButton = new JButton("DIVIDE");
		divideButton.setBounds(292, 278, 152, 43);
		frmSimpleCalculator.getContentPane().add(divideButton);
		
		JButton resetButton = new JButton("RESET");
		resetButton.setBounds(126, 334, 152, 43);
		frmSimpleCalculator.getContentPane().add(resetButton);
		
		JButton quitButton = new JButton("QUIT");
		quitButton.setBounds(292, 334, 152, 43);
		frmSimpleCalculator.getContentPane().add(quitButton);
		
		JLabel resultText = new JLabel("");
		resultText.setFont(new Font("Verdana", Font.PLAIN, 16));
		resultText.setBounds(197, 169, 247, 16);
		frmSimpleCalculator.getContentPane().add(resultText);
		
		JButton addButton = new JButton("ADD");
		addButton.setBounds(126, 222, 152, 43);
		frmSimpleCalculator.getContentPane().add(addButton);
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					int numberOne, numberTwo, answer;
					
					numberOne = Integer.parseInt(firstNumberText.getText());
					numberTwo = Integer.parseInt(secondNumberText.getText());
					
					answer = numberOne + numberTwo;
					resultText.setText(Integer.toString(answer));
					
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
				
			}
		});
		
		
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					int numberOne, numberTwo, answer;
					
					numberOne = Integer.parseInt(firstNumberText.getText());
					numberTwo = Integer.parseInt(secondNumberText.getText());
					
					answer = numberOne - numberTwo;
					resultText.setText(Integer.toString(answer));
					
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
				
			}
		});
		
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					int numberOne, numberTwo, answer;
					
					numberOne = Integer.parseInt(firstNumberText.getText());
					numberTwo = Integer.parseInt(secondNumberText.getText());
					
					answer = numberOne * numberTwo;
					resultText.setText(Integer.toString(answer));
					
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
				
			}
		});
		
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					double numberOne, numberTwo, answer;
					
					numberOne = Double.parseDouble(firstNumberText.getText());
					numberTwo = Double.parseDouble(secondNumberText.getText());
					
					answer = numberOne / numberTwo;
					resultText.setText(Double.toString(answer));
					
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
				
			}
		});
		
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstNumberText.setText("");
				secondNumberText.setText("");
				resultText.setText("");
				
			}
		});
		
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,
					    "This will terminate the program!", "Exit", JOptionPane.INFORMATION_MESSAGE);
				
			    System.exit(0);  
			    
			}
		});
		
	}
}
