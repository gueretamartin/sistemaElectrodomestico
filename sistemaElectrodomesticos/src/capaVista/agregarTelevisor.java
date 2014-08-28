package capaVista;

import java.awt.EventQueue;





import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;

import java.awt.Toolkit;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.SystemColor;

import javax.swing.border.EtchedBorder;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import capaLogica.Ejecuta;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class agregarTelevisor extends JDialog {
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t4;
	private JTextField t6;
	private JRadioButton rdbtnNewRadioButton;
	private JComboBox con;

	float prec;
	float peso;
	char cons;
	float res;
	String col;
	boolean sinto;
	
	
	public agregarTelevisor(JFrame hola, boolean modal) {
		
		super(hola,modal);
		setBounds(100, 100, 585, 556);
		this.setLocationRelativeTo(hola);
		setTitle("Agregar nuevo Televisor");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Martin\\Desktop\\TP1 - AGOSTO\\mini005.png"));
				this.setLocationRelativeTo(hola);

		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane.setBounds(4, 10, 558, 59);
		contentPane.add(layeredPane);
		
		JLabel lblAgregarNuevoTelevisor = new JLabel("Agregar nuevo televisor");
		lblAgregarNuevoTelevisor.setFont(new Font("Verdana", Font.PLAIN, 24));
		lblAgregarNuevoTelevisor.setBounds(129, 11, 427, 37);
		layeredPane.add(lblAgregarNuevoTelevisor);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane_1.setBounds(98, 80, 377, 375);
		contentPane.add(layeredPane_1);
		
		JLabel lblNewLabel = new JLabel("Precio Base");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 14, 174, 28);
		layeredPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(10, 72, 99, 28);
		layeredPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Consumo");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(10, 123, 145, 33);
		layeredPane_1.add(lblNewLabel_2);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblColor.setBounds(17, 237, 99, 28);
		layeredPane_1.add(lblColor);
		
		JLabel lblNewLabel_4 = new JLabel("Resolucion");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(10, 181, 161, 24);
		layeredPane_1.add(lblNewLabel_4);
		
		JLabel lblSintonizadorTdt = new JLabel("Sintonizador TDT");
		lblSintonizadorTdt.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblSintonizadorTdt.setBounds(10, 283, 195, 59);
		layeredPane_1.add(lblSintonizadorTdt);
		
		t1 = new JTextField();
		t1.setFont(new Font("Verdana", Font.PLAIN, 22));
		t1.setBounds(140, 14, 130, 33);
		layeredPane_1.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Verdana", Font.PLAIN, 22));
		t2.setBounds(140, 69, 130, 33);
		layeredPane_1.add(t2);
		t2.setColumns(10);
		
		t4 = new JTextField();
		t4.setFont(new Font("Verdana", Font.PLAIN, 22));
		t4.setBounds(140, 122, 130, 33);
		layeredPane_1.add(t4);
		t4.setColumns(10);
		
		t6 = new JTextField();
		t6.setFont(new Font("Verdana", Font.PLAIN, 22));
		t6.setBounds(140, 182, 130, 28);
		layeredPane_1.add(t6);
		t6.setColumns(10);
		
		
		String[] valores= new String[]{"NEGRO","BLANCO","AZUL","ROJO","GRIS" } ;
		 con = new JComboBox(valores);
		con.setFont(new Font("Verdana", Font.PLAIN, 22));
		con.setBounds(140, 231, 144, 41);
		layeredPane_1.add(con);
		
		ButtonGroup group = new ButtonGroup();
	    
	    JLayeredPane layeredPane_2 = new JLayeredPane();
	    layeredPane_2.setBounds(207, 295, 142, 40);
	    layeredPane_1.add(layeredPane_2);
	    
	    rdbtnNewRadioButton = new JRadioButton("SI");
	    rdbtnNewRadioButton.setBounds(7, 10, 54, 23);
	    layeredPane_2.add(rdbtnNewRadioButton);
	    rdbtnNewRadioButton.setFont(new Font("Verdana", Font.PLAIN, 22));
	    group.add(rdbtnNewRadioButton);
	    
	    JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(" NO");
	    rdbtnNewRadioButton_1.setBounds(66, 10, 67, 23);
	    layeredPane_2.add(rdbtnNewRadioButton_1);
	    rdbtnNewRadioButton_1.setFont(new Font("Verdana", Font.PLAIN, 22));
	    group.add(rdbtnNewRadioButton_1);
	    
	    JLabel label = new JLabel("U$S");
	    label.setFont(new Font("Verdana", Font.PLAIN, 22));
	    label.setBounds(280, 24, 46, 20);
	    layeredPane_1.add(label);
	    
	    JLabel label_1 = new JLabel("Kg");
	    label_1.setFont(new Font("Verdana", Font.PLAIN, 22));
	    label_1.setBounds(280, 72, 46, 29);
	    layeredPane_1.add(label_1);
	    
	    
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				carga();
				cerrar();
			}
				
				
				
				/*
				if(txt=="SI"){boolean sinto = true;}
				else {boolean sinto= false;}*/
				
			}
		);
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnNewButton.setBounds(49, 466, 150, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnNewButton_1.setBounds(209, 466, 150, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnNewButton_2.setBounds(369, 466, 150, 34);
		contentPane.add(btnNewButton_2);
	}
	
	
	public void cerrar(){
		this.setVisible(false);
		int num = JOptionPane.showConfirmDialog(null, "¿Desea agregar un nuevo Televisor?", null, JOptionPane.YES_NO_OPTION);
		if(num==JOptionPane.YES_OPTION){limpiar(); this.setVisible(true);}
		else {this.setVisible(false);}
	}
	
	public void limpiar(){
	t1.setText(null);;
	t2.setText(null);;
	t4.setText(null);;
	t6.setText(null);;

	}
	
	
	public void carga(){
		
		
		int num =1;
		try {
			prec = Float.parseFloat(t1.getText());
			peso = Float.parseFloat( t2.getText());
			String var = t4.getText(); 
			cons = var.charAt(0); 
			res = Float.parseFloat(t6.getText());
			col = (String)con.getSelectedItem(); 
			if(rdbtnNewRadioButton.isSelected()) 
			sinto = true;
			else  sinto= false;
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "¡Ingresa todos los valores!");
			num = 0;
			e.printStackTrace();
		} catch (NumberFormatException e){
			num=0;
			JOptionPane.showMessageDialog(null, "¡Ingresa todos los valores y de la forma correcta!");
		}
	
		if (num!=0) Ejecuta.agregaTelevisor(prec, peso, cons, res, col,sinto);} 

	


public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
				agregarTelevisor frame = new agregarTelevisor(new JFrame(), true);
			
				frame.addWindowListener(new java.awt.event.WindowAdapter() {

					public void windowClosing(java.awt.event.WindowEvent e) {
					System.exit(0);
					}
					});
					frame.setVisible(true);
					}
					});
					}
	}