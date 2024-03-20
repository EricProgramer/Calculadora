package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1,numero2, resultado;
	String operacao, IngressarNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(37, 37, 37));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 306, 389);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setBackground(new Color(55, 55, 55));
		txtField.setForeground(new Color(192, 192, 192));
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtField.setBounds(10, 10, 272, 84);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(new Color(185, 95, 55));
		btnC.setBackground(Color.DARK_GRAY);
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnC.setBounds(10, 104, 57, 37);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.DARK_GRAY);
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn7.setBounds(10, 151, 57, 37);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.DARK_GRAY);
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);
				
			}
		});
		btn4.setBounds(10, 198, 57, 37);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn1.setBounds(10, 245, 57, 37);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btnDivisao = new JButton("÷");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "÷";
			}
		});
		btnDivisao.setForeground(new Color(185, 95, 55));
		btnDivisao.setBackground(Color.DARK_GRAY);
		btnDivisao.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDivisao.setBounds(225, 103, 57, 37);
		frmCalculadora.getContentPane().add(btnDivisao);
		
		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "x";
			}
		});
		btnMultiplicacao.setForeground(new Color(185, 95, 55));
		btnMultiplicacao.setBackground(Color.DARK_GRAY);
		btnMultiplicacao.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnMultiplicacao.setBounds(225, 151, 57, 37);
		frmCalculadora.getContentPane().add(btnMultiplicacao);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnSubtracao.setForeground(new Color(185, 95, 55));
		btnSubtracao.setBackground(Color.DARK_GRAY);
		btnSubtracao.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSubtracao.setBounds(225, 197, 57, 37);
		frmCalculadora.getContentPane().add(btnSubtracao);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnSoma.setForeground(new Color(185, 95, 55));
		btnSoma.setBackground(Color.DARK_GRAY);
		btnSoma.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSoma.setBounds(225, 245, 57, 37);
		frmCalculadora.getContentPane().add(btnSoma);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(Color.DARK_GRAY);
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn8.setBounds(77, 151, 57, 37);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(Color.DARK_GRAY);
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn9.setBounds(144, 151, 57, 37);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn5.setBounds(77, 198, 57, 37);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.DARK_GRAY);
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn6.setBounds(144, 198, 57, 37);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn2.setBounds(77, 245, 57, 37);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.DARK_GRAY);
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn3.setBounds(144, 245, 57, 37);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btnPonto.getText();
				txtField.setText(IngressarNumero);
				
			}
		});
		btnPonto.setForeground(Color.WHITE);
		btnPonto.setBackground(Color.DARK_GRAY);
		btnPonto.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnPonto.setBounds(146, 293, 57, 37);
		frmCalculadora.getContentPane().add(btnPonto);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngressarNumero = txtField.getText()+btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setForeground(Color.WHITE);
		btn0.setBackground(Color.DARK_GRAY);
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn0.setBounds(77, 293, 57, 37);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
				} else if(operacao.equals("-")) {
					resultado = numero1 - numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
				} else if(operacao.equals("x")) {
					resultado = numero1*numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
				} else if(operacao.equals("÷")) {
					resultado = numero1/numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
				}
					
				}
				
		});
		
		btnIgual.setForeground(Color.WHITE);
		btnIgual.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnIgual.setBackground(new Color(185, 95, 55));
		btnIgual.setBounds(225, 292, 57, 37);
		frmCalculadora.getContentPane().add(btnIgual);
		
		JButton btnRaiz = new JButton("√");
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				resultado = Math.sqrt(numero1);
				String selecionar = String.format("%.0f", resultado);
				txtField.setText(selecionar);
			}
		});
		btnRaiz.setForeground(new Color(185, 95, 55));
		btnRaiz.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnRaiz.setBackground(Color.DARK_GRAY);
		btnRaiz.setBounds(77, 104, 57, 37);
		frmCalculadora.getContentPane().add(btnRaiz);
		
		JButton btnPotencia = new JButton("aⁿ");
		btnPotencia.setForeground(new Color(185, 95, 55));
		btnPotencia.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPotencia.setBackground(Color.DARK_GRAY);
		btnPotencia.setBounds(144, 104, 57, 37);
		frmCalculadora.getContentPane().add(btnPotencia);
	}
}
