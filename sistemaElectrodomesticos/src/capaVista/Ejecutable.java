package capaVista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import java.awt.Font;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Ejecutable extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
		
	public Ejecutable() {
		
		
		
		setTitle("ELECTROSYSTEM");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ejecutable.class.getResource("/imagenes/mini005.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setBounds(100, 100, 533, 239);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.scrollbar);
		menuBar.setMargin(new Insets(2, 2, 2, 2));
		menuBar.setFont(new Font("Verdana", Font.PLAIN, 18));
		menuBar.setBounds(0, 0, 527, 33);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setFont(new Font("Verdana", Font.BOLD, 18));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
		
			
			public void actionPerformed(ActionEvent e) {
				
				System.exit(1);
			
			}}
				);		
			
		
		mntmSalir.setFont(new Font("Verdana", Font.PLAIN, 18));
		mnNewMenu.add(mntmSalir);
		
		JMenu mnOpciones = new JMenu("  Opciones");
		mnOpciones.setFont(new Font("Verdana", Font.BOLD, 18));
		menuBar.add(mnOpciones);
		
		JMenu mnNewMenu_1 = new JMenu("  Agregar ");
		
		mnNewMenu_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		mnOpciones.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("  Lavarropas");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new agregarLavarropas(Ejecutable.this,true).setVisible(true);
			
			}});
		mntmNewMenuItem_2.setFont(new Font("Verdana", Font.PLAIN, 18));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmTelevisin1 = new JMenuItem("  Televisi\u00F3n");
		mntmTelevisin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 new agregarTelevisor(Ejecutable.this,true).setVisible(true);;
			
			}});
		
		mntmTelevisin1.setFont(new Font("Verdana", Font.PLAIN, 18));
		mnNewMenu_1.add(mntmTelevisin1);
	
		
		JMenuItem mntmNewMenuItem = new JMenuItem("  Dar de baja");
		mntmNewMenuItem.setFont(new Font("Verdana", Font.PLAIN, 18));
		mnOpciones.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("  Modificar");
		mntmNewMenuItem_3.setFont(new Font("Verdana", Font.PLAIN, 18));
		mnOpciones.add(mntmNewMenuItem_3);
		
		JMenu mnListarPor = new JMenu("  Listar por");
		mnListarPor.setFont(new Font("Verdana", Font.PLAIN, 18));
		mnOpciones.add(mnListarPor);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("  Rango de importes");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new ListaR(Ejecutable.this,true).setVisible(true);
			
			}});
		 
		 
		mntmNewMenuItem_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		mnListarPor.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("  Consumo Energetico");
		mntmNewMenuItem_4.setFont(new Font("Verdana", Font.PLAIN, 18));
		mnListarPor.add(mntmNewMenuItem_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Ejecutable.class.getResource("/imagenes/fondo-madera-marron.jpg")));
		lblNewLabel.setBounds(0, 25, 517, 176);
		contentPane.add(lblNewLabel);
		
		
	}

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				 Ejecutable frame = new Ejecutable();
				 frame.setVisible(true);
				 frame.setSize(533,239);
			      frame.setLocationRelativeTo(null);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
	});
}
}
