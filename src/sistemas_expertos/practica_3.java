package sistemas_expertos;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

public class practica_3 {

	private JFrame frame;
	private JTextField green_a1;
	private JTextField blue_b1;
	private JTextField green_c1;
	private JTextField blue_d1;
	private JTextField blue_f1;
	private JTextField green_e1;
	private JTextField green_g1;
	private JTextField blue_h1;
	private JTextField green_i1;
	private JTextField blue_a2;
	private JTextField red_b2;
	private JTextField yellow_c2;
	private JTextField red_d2;
	private JTextField red_f2;
	private JTextField yellow_e2;
	private JTextField yellow_g2;
	private JTextField red_h2;
	private JTextField blue_i2;
	private JTextField green_a3;
	private JTextField cyan_b3;
	private JTextField white_c3;
	private JTextField cyan_d3;
	private JTextField cyan_f3;
	private JTextField white_e3;
	private JTextField white_g3;
	private JTextField cyan_h3;
	private JTextField green_i3;
	private JTextField blue_a4;
	private JTextField red_b4;
	private JTextField yellow_c4;
	private JTextField red_d4;
	private JTextField red_f4;
	private JTextField yellow_e4;
	private JTextField yellow_g4;
	private JTextField red_h4;
	private JTextField blue_i4;
	private JTextField green_a5;
	private JTextField blue_b5;
	private JTextField green_c5;
	private JTextField blue_d5;
	private JTextField green_e5;
	private JTextField blue_f5;
	private JTextField green_g5;
	private JTextField blue_h5;
	private JTextField green_i5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practica_3 window = new practica_3();
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
	public practica_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		green_a1 = new JTextField();
		green_a1.setBounds(6, 6, 31, 34);
		frame.getContentPane().add(green_a1);
		green_a1.setColumns(10);
		
		blue_b1 = new JTextField();
		blue_b1.setColumns(10);
		blue_b1.setBounds(33, 6, 31, 34);
		frame.getContentPane().add(blue_b1);
		
		green_c1 = new JTextField();
		green_c1.setColumns(10);
		green_c1.setBounds(60, 6, 31, 34);
		frame.getContentPane().add(green_c1);
		
		blue_d1 = new JTextField();
		blue_d1.setColumns(10);
		blue_d1.setBounds(88, 6, 31, 34);
		frame.getContentPane().add(blue_d1);
		
		blue_f1 = new JTextField();
		blue_f1.setColumns(10);
		blue_f1.setBounds(147, 6, 31, 34);
		frame.getContentPane().add(blue_f1);
		
		green_e1 = new JTextField();
		green_e1.setColumns(10);
		green_e1.setBounds(117, 6, 31, 34);
		frame.getContentPane().add(green_e1);
		
		green_g1 = new JTextField();
		green_g1.setColumns(10);
		green_g1.setBounds(176, 6, 31, 34);
		frame.getContentPane().add(green_g1);
		
		blue_h1 = new JTextField();
		blue_h1.setColumns(10);
		blue_h1.setBounds(204, 6, 31, 34);
		frame.getContentPane().add(blue_h1);
		
		green_i1 = new JTextField();
		green_i1.setColumns(10);
		green_i1.setBounds(232, 6, 31, 34);
		frame.getContentPane().add(green_i1);
		
		blue_a2 = new JTextField();
		blue_a2.setColumns(10);
		blue_a2.setBounds(6, 44, 31, 34);
		frame.getContentPane().add(blue_a2);
		
		red_b2 = new JTextField();
		red_b2.setColumns(10);
		red_b2.setBounds(33, 44, 31, 34);
		frame.getContentPane().add(red_b2);
		
		yellow_c2 = new JTextField();
		yellow_c2.setColumns(10);
		yellow_c2.setBounds(60, 44, 31, 34);
		frame.getContentPane().add(yellow_c2);
		
		red_d2 = new JTextField();
		red_d2.setColumns(10);
		red_d2.setBounds(88, 44, 31, 34);
		frame.getContentPane().add(red_d2);
		
		red_f2 = new JTextField();
		red_f2.setColumns(10);
		red_f2.setBounds(147, 44, 31, 34);
		frame.getContentPane().add(red_f2);
		
		yellow_e2 = new JTextField();
		yellow_e2.setColumns(10);
		yellow_e2.setBounds(117, 44, 31, 34);
		frame.getContentPane().add(yellow_e2);
		
		yellow_g2 = new JTextField();
		yellow_g2.setColumns(10);
		yellow_g2.setBounds(176, 44, 31, 34);
		frame.getContentPane().add(yellow_g2);
		
		red_h2 = new JTextField();
		red_h2.setColumns(10);
		red_h2.setBounds(204, 44, 31, 34);
		frame.getContentPane().add(red_h2);
		
		blue_i2 = new JTextField();
		blue_i2.setColumns(10);
		blue_i2.setBounds(232, 44, 31, 34);
		frame.getContentPane().add(blue_i2);
		
		green_a3 = new JTextField();
		green_a3.setColumns(10);
		green_a3.setBounds(6, 84, 31, 34);
		frame.getContentPane().add(green_a3);
		
		cyan_b3 = new JTextField();
		cyan_b3.setColumns(10);
		cyan_b3.setBounds(33, 84, 31, 34);
		frame.getContentPane().add(cyan_b3);
		
		white_c3 = new JTextField();
		white_c3.setColumns(10);
		white_c3.setBounds(60, 84, 31, 34);
		frame.getContentPane().add(white_c3);
		
		cyan_d3 = new JTextField();
		cyan_d3.setColumns(10);
		cyan_d3.setBounds(88, 84, 31, 34);
		frame.getContentPane().add(cyan_d3);
		
		cyan_f3 = new JTextField();
		cyan_f3.setColumns(10);
		cyan_f3.setBounds(147, 84, 31, 34);
		frame.getContentPane().add(cyan_f3);
		
		white_e3 = new JTextField();
		white_e3.setColumns(10);
		white_e3.setBounds(117, 84, 31, 34);
		frame.getContentPane().add(white_e3);
		
		white_g3 = new JTextField();
		white_g3.setColumns(10);
		white_g3.setBounds(176, 84, 31, 34);
		frame.getContentPane().add(white_g3);
		
		cyan_h3 = new JTextField();
		cyan_h3.setColumns(10);
		cyan_h3.setBounds(204, 84, 31, 34);
		frame.getContentPane().add(cyan_h3);
		
		green_i3 = new JTextField();
		green_i3.setColumns(10);
		green_i3.setBounds(232, 84, 31, 34);
		frame.getContentPane().add(green_i3);
		
		blue_a4 = new JTextField();
		blue_a4.setColumns(10);
		blue_a4.setBounds(6, 122, 31, 34);
		frame.getContentPane().add(blue_a4);
		
		red_b4 = new JTextField();
		red_b4.setColumns(10);
		red_b4.setBounds(33, 122, 31, 34);
		frame.getContentPane().add(red_b4);
		
		yellow_c4 = new JTextField();
		yellow_c4.setColumns(10);
		yellow_c4.setBounds(60, 122, 31, 34);
		frame.getContentPane().add(yellow_c4);
		
		red_d4 = new JTextField();
		red_d4.setColumns(10);
		red_d4.setBounds(88, 122, 31, 34);
		frame.getContentPane().add(red_d4);
		
		red_f4 = new JTextField();
		red_f4.setColumns(10);
		red_f4.setBounds(147, 122, 31, 34);
		frame.getContentPane().add(red_f4);
		
		yellow_e4 = new JTextField();
		yellow_e4.setColumns(10);
		yellow_e4.setBounds(117, 122, 31, 34);
		frame.getContentPane().add(yellow_e4);
		
		yellow_g4 = new JTextField();
		yellow_g4.setColumns(10);
		yellow_g4.setBounds(176, 122, 31, 34);
		frame.getContentPane().add(yellow_g4);
		
		red_h4 = new JTextField();
		red_h4.setColumns(10);
		red_h4.setBounds(204, 122, 31, 34);
		frame.getContentPane().add(red_h4);
		
		blue_i4 = new JTextField();
		blue_i4.setColumns(10);
		blue_i4.setBounds(232, 122, 31, 34);
		frame.getContentPane().add(blue_i4);
		
		green_a5 = new JTextField();
		green_a5.setColumns(10);
		green_a5.setBounds(6, 161, 31, 34);
		frame.getContentPane().add(green_a5);
		
		blue_b5 = new JTextField();
		blue_b5.setColumns(10);
		blue_b5.setBounds(33, 161, 31, 34);
		frame.getContentPane().add(blue_b5);
		
		green_c5 = new JTextField();
		green_c5.setColumns(10);
		green_c5.setBounds(60, 161, 31, 34);
		frame.getContentPane().add(green_c5);
		
		blue_d5 = new JTextField();
		blue_d5.setColumns(10);
		blue_d5.setBounds(88, 161, 31, 34);
		frame.getContentPane().add(blue_d5);
		
		green_e5 = new JTextField();
		green_e5.setColumns(10);
		green_e5.setBounds(117, 161, 31, 34);
		frame.getContentPane().add(green_e5);
		
		blue_f5 = new JTextField();
		blue_f5.setColumns(10);
		blue_f5.setBounds(147, 161, 31, 34);
		frame.getContentPane().add(blue_f5);
		
		green_g5 = new JTextField();
		green_g5.setColumns(10);
		green_g5.setBounds(176, 161, 31, 34);
		frame.getContentPane().add(green_g5);
		
		blue_h5 = new JTextField();
		blue_h5.setColumns(10);
		blue_h5.setBounds(204, 161, 31, 34);
		frame.getContentPane().add(blue_h5);
		
		green_i5 = new JTextField();
		green_i5.setColumns(10);
		green_i5.setBounds(232, 161, 31, 34);
		frame.getContentPane().add(green_i5);
		
		JButton btnVerde = new JButton("Verde");
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<JTextField> elements = Arrays.asList(
						green_a1, green_a3, green_a5, green_c1, 
						green_c5, green_e1, green_e5, green_g1, 
						green_g5, green_i1, green_i3, green_i5);
				
				for(JTextField element: elements)
					element.setBackground(Color.GREEN);
			}
		});
		btnVerde.setBounds(2, 227, 85, 29);
		frame.getContentPane().add(btnVerde);
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<JTextField> elements = Arrays.asList(
						blue_a2, blue_a4, blue_b1, blue_b5, blue_d1, 
						blue_d5, blue_f1, blue_f5, blue_h1, blue_h5, 
						blue_i2, blue_i4);
				
				for(JTextField element: elements)
					element.setBackground(Color.BLUE);
			}
		});
		btnAzul.setBounds(78, 227, 85, 29);
		frame.getContentPane().add(btnAzul);
		
		JButton btnRojo = new JButton("Rojo");
		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<JTextField> elements = Arrays.asList(red_b2, red_b4, red_d2, red_d4, red_f2, red_f4, red_h2, red_h4);
				
				for(JTextField element: elements)
					element.setBackground(Color.RED);
			}
		});
		btnRojo.setBounds(163, 227, 85, 29);
		frame.getContentPane().add(btnRojo);
		
		JButton btnCyan = new JButton("Cyan");
		btnCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<JTextField> elements = Arrays.asList(cyan_b3, cyan_d3, cyan_f3, cyan_h3);
				
				for(JTextField element: elements)
					element.setBackground(Color.CYAN);
			}
		});
		btnCyan.setBounds(242, 227, 85, 29);
		frame.getContentPane().add(btnCyan);
		
		JButton btnAmarillo = new JButton("Amarillo");
		btnAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<JTextField> elements = Arrays.asList(yellow_c2, yellow_c4, yellow_e2, yellow_e4, yellow_g2, yellow_g4);
				
				for(JTextField element: elements)
					element.setBackground(Color.YELLOW);
			}
		});
		btnAmarillo.setBounds(325, 227, 85, 29);
		frame.getContentPane().add(btnAmarillo);
	}
}
