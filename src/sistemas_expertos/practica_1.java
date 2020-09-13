package sistemas_expertos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;

import javafx.scene.control.ComboBox;

import javax.swing.event.ChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class practica_1 {

	private JFrame frame;
	
	private boolean pepeCheckbox;
	private boolean juanCheckbox;
	private boolean rafaelCheckbox;
	private boolean anaCheckbox;
	private boolean conchisCheckbox;
	private boolean evaCheckbox;
	
	private String gift = "";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practica_1 window = new practica_1();
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
	public practica_1() {
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
		
		JCheckBox chckbxPepe = new JCheckBox("Pepe");
		chckbxPepe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPepe.isSelected()){
					pepeCheckbox = true;
					System.out.println(String.format("Pepe checkbox is selected, value is: %s", pepeCheckbox));
				}
				else {
					pepeCheckbox = false;
					System.out.println(String.format("Pepe checkbox is unselected, value is: %s", pepeCheckbox));					
				}
			}
		});
		chckbxPepe.setBounds(10, 50, 128, 23);
		frame.getContentPane().add(chckbxPepe);
		
		JCheckBox chckbxRafael = new JCheckBox("Rafael");
		chckbxRafael.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRafael.isSelected()){
					rafaelCheckbox = true;
					System.out.println(String.format("Rafael checkbox is selected, value is: %s", rafaelCheckbox));
				}
				else {
					rafaelCheckbox = false;
					System.out.println(String.format("Rafael checkbox is unselected, value is: %s", rafaelCheckbox));					
				}
			}
		});
		chckbxRafael.setBounds(10, 120, 128, 23);
		frame.getContentPane().add(chckbxRafael);
		
		JCheckBox chckbxAna = new JCheckBox("Ana");
		chckbxAna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAna.isSelected()){
					anaCheckbox = true;
					System.out.println(String.format("Ana checkbox is selected, value is: %s", anaCheckbox));
				}
				else {
					anaCheckbox = false;
					System.out.println(String.format("Ana checkbox is unselected, value is: %s", anaCheckbox));					
				}
			}
		});
		chckbxAna.setBounds(10, 155, 128, 23);
		frame.getContentPane().add(chckbxAna);
		
		JCheckBox chckbxConchis = new JCheckBox("Conchis");
		chckbxConchis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxConchis.isSelected()){
					conchisCheckbox = true;
					System.out.println(String.format("Conchis checkbox is selected, value is: %s", conchisCheckbox));
				}
				else {
					conchisCheckbox = false;
					System.out.println(String.format("Conchis checkbox is unselected, value is: %s", conchisCheckbox));					
				}
			}
		});		
		chckbxConchis.setBounds(10, 190, 128, 23);
		frame.getContentPane().add(chckbxConchis);
		
		JCheckBox chckbxEva = new JCheckBox("Eva");
		chckbxEva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxEva.isSelected()){
					evaCheckbox = true;
					System.out.println(String.format("Eva checkbox is selected, value is: %s", evaCheckbox));
				}
				else {
					evaCheckbox = false;
					System.out.println(String.format("Eva checkbox is unselected, value is: %s", evaCheckbox));					
				}
			}
		});
		chckbxEva.setBounds(10, 225, 128, 23);
		frame.getContentPane().add(chckbxEva);
		
		JCheckBox chckbxJuan = new JCheckBox("Juan");
		chckbxJuan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxJuan.isSelected()){
					juanCheckbox = true;
					System.out.println(String.format("Juan checkbox is selected, value is: %s", juanCheckbox));
				}
				else {
					juanCheckbox = false;
					System.out.println(String.format("Juan checkbox is unselected, value is: %s", juanCheckbox));					
				}
			}
		});
		chckbxJuan.setBounds(10, 85, 128, 23);
		frame.getContentPane().add(chckbxJuan);
		

		// Add comboBox elements at Runtime
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addItem("Selecciona una opcion");
		comboBox.addItem("Coche");
		comboBox.addItem("Casa");
		comboBox.addItem("Viaje");
		comboBox.addItem("Barco");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(String.format("Gift selected: %s", comboBox.getSelectedItem()));
				gift = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setBounds(205, 103, 195, 27);
		frame.getContentPane().add(comboBox);
		
		JButton btnAsignarRegalos = new JButton("Asignar regalos");
		btnAsignarRegalos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gift.equals("Selecciona una opcion") || gift.isEmpty()){
					JOptionPane.showMessageDialog(null, "Selecciona un regalo");
					return;
				}
				System.out.println("====================================");
				System.out.println(String.format("pepeCheckbox value is: %s", pepeCheckbox));
				System.out.println(String.format("juanCheckbox value is: %s", juanCheckbox));
				System.out.println(String.format("rafaelCheckbox value is: %s", rafaelCheckbox));
				System.out.println(String.format("anaCheckbox value is: %s", anaCheckbox));
				System.out.println(String.format("conchisCheckbox value is: %s", conchisCheckbox));
				System.out.println(String.format("evaCheckbox value is: %s", evaCheckbox));
				System.out.println("====================================");
				
				if(pepeCheckbox){
					if(juanCheckbox && rafaelCheckbox && anaCheckbox && conchisCheckbox && evaCheckbox){
						JOptionPane.showMessageDialog(null, "Pepe no es compartible con las demas personas!");
						return;
					}
				}
				
				if(juanCheckbox){
					if(rafaelCheckbox && anaCheckbox && conchisCheckbox && evaCheckbox){
						JOptionPane.showMessageDialog(null, "Juan no es compartible con rafael, ana y conchis, pero si con eva!");
						return;
					}
					else if(rafaelCheckbox && anaCheckbox && conchisCheckbox){
						JOptionPane.showMessageDialog(null, "Juan no es compartible con rafael, ana y conchis!");
						return;
					}
					else if(rafaelCheckbox && anaCheckbox){
						JOptionPane.showMessageDialog(null, "Juan no es compartible con rafael y ana!");
						return;						
					}
					else if(rafaelCheckbox && conchisCheckbox){
						JOptionPane.showMessageDialog(null, "Juan no es compartible con rafael y conchis!");
						return;						
					}
					else if(anaCheckbox && conchisCheckbox){
						JOptionPane.showMessageDialog(null, "Juan no es compartible con ana y conchis!");
						return;						
					}
					else if(conchisCheckbox && rafaelCheckbox){
						JOptionPane.showMessageDialog(null, "Juan no es compartible con conchis y rafael!");
						return;						
					}
					else if(rafaelCheckbox){
						JOptionPane.showMessageDialog(null, "Juan no es compartible con rafael!");
						return;
					}
					else if(anaCheckbox){
						JOptionPane.showMessageDialog(null, "Juan no es compartible con ana!");
						return;
					}
					else if(conchisCheckbox){
						JOptionPane.showMessageDialog(null, "Juan no es compartible con conchis!");
						return;
					}
				}
				
				if(rafaelCheckbox){
					if(conchisCheckbox && evaCheckbox){
						JOptionPane.showMessageDialog(null, "Rafael no es compartible con conchis y eva!");
						return;
					}
					else if(conchisCheckbox){
						JOptionPane.showMessageDialog(null, "Rafael no es compartible con conchis!");
						return;
					}
					else if(evaCheckbox){
						JOptionPane.showMessageDialog(null, "Rafael no es compartible con eva!");
						return;
					}
				}
				
				if(anaCheckbox){
					if(conchisCheckbox){
						JOptionPane.showMessageDialog(null, "Ana no es compartible con conchis!");
						return;			
					}
				}
				
				if(conchisCheckbox){
					if(evaCheckbox){
						JOptionPane.showMessageDialog(null, "Conchis no es compartible con eva!");
						return;						
					}
				}
				

				JOptionPane.showMessageDialog(null, String.format("Felicidades, el regalo seleccionado es: %s", gift));
				return;				
			}
		});
		btnAsignarRegalos.setBounds(205, 174, 146, 44);
		frame.getContentPane().add(btnAsignarRegalos);
		
		JLabel lblSeleccionaALas = new JLabel("Selecciona a las personas");
		lblSeleccionaALas.setBounds(6, 19, 182, 16);
		frame.getContentPane().add(lblSeleccionaALas);
		
		JLabel lblSeleccionaElRegalo = new JLabel("Selecciona el regalo");
		lblSeleccionaElRegalo.setBounds(211, 54, 140, 16);
		frame.getContentPane().add(lblSeleccionaElRegalo);
	}
}
