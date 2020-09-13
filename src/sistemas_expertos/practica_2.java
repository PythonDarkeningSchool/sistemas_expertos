package sistemas_expertos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import java.util.List;
import java.util.Arrays;

import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.VetoableChangeListener;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class practica_2 {

	private JFrame frame;
	
	private int min_value = 1;
	private int max_value = 4;
	
	private String a1_value = "1";
	private String a2_value;
	private String a3_value = "2";
	private String a4_value;
	private String b1_value;
	private String b2_value = "4";
	private String b3_value = "3";
	private String b4_value;
	private String c1_value;
	private String c2_value;
	private String c3_value = "1";
	private String c4_value;
	private String d1_value;
	private String d2_value;
	private String d3_value = "4";
	private String d4_value;
	private JTextField b1;
	private JTextField c1;
	private JTextField d1;
	private JTextField a1;
	private JTextField a2;
	private JTextField a3;
	private JTextField a4;
	private JTextField b2;
	private JTextField b3;
	private JTextField b4;
	private JTextField c2;
	private JTextField c3;
	private JTextField c4;
	private JTextField d2;
	private JTextField d3;
	private JTextField d4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practica_2 window = new practica_2();
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
	public practica_2() {
		initialize();
	}
	
	private boolean value_verification(JTextField textField, String value){
		// Verify if the new value in on range, otherwise set the old value
		if (!(Integer.parseInt(value) >= min_value && Integer.parseInt(value) <= max_value)){
			textField.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "El valor debe estar entre 1 y 4!");
			return false;
		}
		else { return true; }
	}
	
	private void evaluate_sudoku(JTextField textField, String location, String value){
		
		if(value.isEmpty()){
			textField.setBackground(Color.WHITE);
			JOptionPane.showMessageDialog(null, "El valor no puede estar vacio!");
			return;
		}
		
		if(!value_verification(textField, value))
			return;
		
		if(location.equals("a2")){
			List<String> evaluate_1 = Arrays.asList(a1_value, a3_value, a4_value);
			List<String> evaluate_2 = Arrays.asList(b2_value, c2_value, d2_value);

			if(evaluate_1.contains(value) || evaluate_2.contains(value)){
				textField.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, String.format("El valor: %s, ya existe!", value));
			}
			else {
				textField.setBackground(Color.GREEN);
			}
		}
		else if(location.equals("a4")){
			List<String> evaluate_1 = Arrays.asList(a1_value, a2_value, a3_value);
			List<String> evaluate_2 = Arrays.asList(b4_value, c4_value, d4_value);

			if(evaluate_1.contains(value) || evaluate_2.contains(value)){
				textField.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, String.format("El valor: %s, ya existe!", value));
			}
			else {
				textField.setBackground(Color.GREEN);
			}
		}
		else if(location.equals("b1")){
			List<String> evaluate_1 = Arrays.asList(a1_value, c1_value, d1_value);
			List<String> evaluate_2 = Arrays.asList(b2_value, b3_value, b4_value);

			if(evaluate_1.contains(value) || evaluate_2.contains(value)){
				textField.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, String.format("El valor: %s, ya existe!", value));
			}
			else {
				textField.setBackground(Color.GREEN);
			}
		}
		else if(location.equals("b4")){
			List<String> evaluate_1 = Arrays.asList(b1_value, b2_value, b3_value);
			List<String> evaluate_2 = Arrays.asList(a4_value, c4_value, d4_value);

			if(evaluate_1.contains(value) || evaluate_2.contains(value)){
				textField.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, String.format("El valor: %s, ya existe!", value));
			}
			else {
				textField.setBackground(Color.GREEN);
			}
		}
		else if(location.equals("c1")){
			List<String> evaluate_1 = Arrays.asList(a1_value, b1_value, d1_value);
			List<String> evaluate_2 = Arrays.asList(c2_value, c3_value, c4_value);

			if(evaluate_1.contains(value) || evaluate_2.contains(value)){
				textField.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, String.format("El valor: %s, ya existe!", value));
			}
			else {
				textField.setBackground(Color.GREEN);
			}
		}
		else if(location.equals("c2")){
			List<String> evaluate_1 = Arrays.asList(c1_value, c3_value, c4_value);
			List<String> evaluate_2 = Arrays.asList(a2_value, b2_value, b4_value);

			if(evaluate_1.contains(value) || evaluate_2.contains(value)){
				textField.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, String.format("El valor: %s, ya existe!", value));
			}
			else {
				textField.setBackground(Color.GREEN);
			}
		}
		else if(location.equals("c4")){
			List<String> evaluate_1 = Arrays.asList(c1_value, c2_value, c3_value);
			List<String> evaluate_2 = Arrays.asList(a4_value, b4_value, d4_value);

			if(evaluate_1.contains(value) || evaluate_2.contains(value)){
				textField.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, String.format("El valor: %s, ya existe!", value));
			}
			else {
				textField.setBackground(Color.GREEN);
			}
		}
		else if(location.equals("d1")){
			List<String> evaluate_1 = Arrays.asList(d2_value, d3_value, d4_value);
			List<String> evaluate_2 = Arrays.asList(a1_value, b1_value, c1_value);

			if(evaluate_1.contains(value) || evaluate_2.contains(value)){
				textField.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, String.format("El valor: %s, ya existe!", value));
			}
			else {
				textField.setBackground(Color.GREEN);
			}
		}	
		else if(location.equals("d2")){
			List<String> evaluate_1 = Arrays.asList(d1_value, d3_value, d4_value);
			List<String> evaluate_2 = Arrays.asList(a2_value, b2_value, c2_value);

			if(evaluate_1.contains(value) || evaluate_2.contains(value)){
				textField.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, String.format("El valor: %s, ya existe!", value));
			}
			else {
				textField.setBackground(Color.GREEN);
			}
		}	
		else if(location.equals("d4")){
			List<String> evaluate_1 = Arrays.asList(d1_value, d2_value, d3_value);
			List<String> evaluate_2 = Arrays.asList(a4_value, b4_value, c4_value);

			if(evaluate_1.contains(value) || evaluate_2.contains(value)){
				textField.setBackground(Color.RED);
				JOptionPane.showMessageDialog(null, String.format("El valor: %s, ya existe!", value));
			}
			else {
				textField.setBackground(Color.GREEN);
			}
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// ==============================
		a1 = new JTextField();
		a1.setEnabled(false);
		a1.setEditable(false);
		a1.setBackground(Color.GREEN);
		a1.setText("1");
		a1.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		a1.setColumns(10);
		a1.setBounds(44, 31, 67, 49);
		frame.getContentPane().add(a1);
		
		a2 = new JTextField();
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a2_value = a2.getText();
				evaluate_sudoku(a2, "a2", a2_value);
			}
		});
		a2.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		a2.setColumns(10);
		a2.setBounds(44, 83, 67, 49);
		frame.getContentPane().add(a2);
		
		a3 = new JTextField();
		a3.setEnabled(false);
		a3.setEditable(false);
		a3.setBackground(Color.GREEN);
		a3.setText("2");
		a3.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		a3.setColumns(10);
		a3.setBounds(44, 137, 67, 49);
		frame.getContentPane().add(a3);
		
		a4 = new JTextField();
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a4_value = a4.getText();
				evaluate_sudoku(a4, "a4", a4_value);
			}
		});
		a4.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		a4.setColumns(10);
		a4.setBounds(44, 190, 67, 49);
		frame.getContentPane().add(a4);
		
		//==============================
		b1 = new JTextField();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1_value = b1.getText();
				evaluate_sudoku(b1, "b1", b1_value);
			}
		});
		b1.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		b1.setBounds(108, 31, 67, 49);
		frame.getContentPane().add(b1);
		b1.setColumns(10);
		
		b2 = new JTextField();
		b2.setEnabled(false);
		b2.setEditable(false);
		b2.setBackground(Color.GREEN);
		b2.setText("4");
		b2.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		b2.setColumns(10);
		b2.setBounds(108, 83, 67, 49);
		frame.getContentPane().add(b2);
		
		b3 = new JTextField();
		b3.setEnabled(false);
		b3.setEditable(false);
		b3.setBackground(Color.GREEN);
		b3.setText("3");
		b3.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		b3.setColumns(10);
		b3.setBounds(108, 137, 67, 49);
		frame.getContentPane().add(b3);
		
		b4 = new JTextField();
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4_value = b4.getText();
				evaluate_sudoku(b4, "b4", b4_value);
			}
		});
		b4.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		b4.setColumns(10);
		b4.setBounds(108, 190, 67, 49);
		frame.getContentPane().add(b4);
		
		//==============================
		c1 = new JTextField();
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1_value = c1.getText();
				evaluate_sudoku(c1, "c1", c1_value);
			}
		});
		c1.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		c1.setColumns(10);
		c1.setBounds(171, 31, 67, 49);
		frame.getContentPane().add(c1);
		
		c2 = new JTextField();
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c2_value = c2.getText();
				evaluate_sudoku(c2, "c2", c2_value);
			}
		});
		c2.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		c2.setColumns(10);
		c2.setBounds(171, 83, 67, 49);
		frame.getContentPane().add(c2);
		
		c3 = new JTextField();
		c3.setEnabled(false);
		c3.setEditable(false);
		c3.setBackground(Color.GREEN);
		c3.setText("1");
		c3.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		c3.setColumns(10);
		c3.setBounds(171, 137, 67, 49);
		frame.getContentPane().add(c3);
		
		c4 = new JTextField();
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c4_value = c4.getText();
				evaluate_sudoku(c4, "c4", c4_value);
			}
		});
		c4.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		c4.setColumns(10);
		c4.setBounds(171, 190, 67, 49);
		frame.getContentPane().add(c4);
		
		//==============================
		d1 = new JTextField();
		d1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evaluate_sudoku(d1, "d1", d1.getText());
			}
		});
		d1.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		d1.setColumns(10);
		d1.setBounds(234, 31, 67, 49);
		frame.getContentPane().add(d1);
		
		d2 = new JTextField();
		d2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d2_value = d2.getText();
				evaluate_sudoku(d2, "d2", d2_value);
			}
		});
		d2.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		d2.setColumns(10);
		d2.setBounds(234, 83, 67, 49);
		frame.getContentPane().add(d2);
		
		d3 = new JTextField();
		d3.setEnabled(false);
		d3.setEditable(false);
		d3.setBackground(Color.GREEN);
		d3.setText("4");
		d3.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		d3.setColumns(10);
		d3.setBounds(234, 137, 67, 49);
		frame.getContentPane().add(d3);
		
		d4 = new JTextField();
		d4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d4_value = d4.getText();
				evaluate_sudoku(d4, "d4", d4_value);
			}
		});
		d4.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		d4.setColumns(10);
		d4.setBounds(234, 190, 67, 49);
		frame.getContentPane().add(d4);
		
		JLabel lblPresionaLaTecla = new JLabel("Presiona la tecla \"ENTER\" despues de insertar un valor");
		lblPresionaLaTecla.setBounds(44, 6, 349, 16);
		frame.getContentPane().add(lblPresionaLaTecla);
	}
}
