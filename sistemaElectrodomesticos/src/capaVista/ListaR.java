package capaVista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;

import capaEntidades.*;
import capaLogica.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListaR extends JDialog {

	
	private static final long serialVersionUID = 1L;
	private JTable table;
	private String[] columnas = {"Descripción", "Precio (U$S)", "Color", "Peso (kg)", "Consumo", "Carga (kg)", "Resol. (in)", "TDT"};
	private DefaultTableModel miModelo = new DefaultTableModel(null,columnas); 
	private JTextField ranMin;
	private JTextField ranMax;
	private Character[] letras = {' ','A','B','C','D','E','F'};
	private ArrayList<Electrodomesticos> elecs;
	private JComboBox cmbConsumo;

	
	
	public ListaR() {
		setBounds(100, 100, 571, 393);
		getContentPane().setLayout(null);
		
		

		table = new JTable(miModelo);
		table.setBackground(Color.LIGHT_GRAY);
		table.setBounds(10, 119, 535, 225);
		getContentPane().add(table);
		
		ranMin = new JTextField();
		ranMin.setFont(new Font("Verdana", Font.PLAIN, 22));
		ranMin.setBounds(103, 10, 55, 26);
		getContentPane().add(ranMin);
		ranMin.setColumns(10);
		
		ranMax = new JTextField();
		ranMax.setFont(new Font("Verdana", Font.PLAIN, 22));
		ranMax.setBounds(103, 38, 55, 26);
		getContentPane().add(ranMax);
		ranMax.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ran Min");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 21));
		lblNewLabel.setBounds(6, 13, 86, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ran Max");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(7, 40, 92, 20);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("$");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(162, 12, 46, 20);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("$");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(162, 40, 46, 20);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Consumo");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(216, 23, 101, 26);
		getContentPane().add(lblNewLabel_4);
		
		JComboBox cmbConsumo = new JComboBox(letras);
		cmbConsumo.setBounds(326, 29, 54, 20);
		getContentPane().add(cmbConsumo);
		
		final JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listar();
					
					btnNewButton.setEnabled(false);
			}	
	});
		
		btnNewButton.setEnabled(false);
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 9));
		btnNewButton.setBounds(414, 85, 89, 23);
		getContentPane().add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 9));
		btnNewButton_1.setBounds(303, 85, 101, 23);
		getContentPane().add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Listar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listar();
				btnNewButton_1.setEnabled(true);
				btnNewButton.setEnabled(true);
			}

		
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 9));
		btnNewButton_2.setBounds(204, 85, 89, 23);
		getContentPane().add(btnNewButton_2);
		
	
	}

	private void Listar() {
		
		LimpiarTabla();
		elecs = Ejecuta.getElectrodomesticos();
				
		try
		{
			  	/* RECORRE EL ARREGLO DE ELECTRODOMESTICOS */
			
			for(int i = 0; i < elecs.size(); i++)
			{				
					/*  VALIDA QUE SELECCIONE EL CONSUMO Y NO SELECCIONE RANGOS DE IMPORTE	 */
				
				if (!((Character)cmbConsumo.getSelectedItem() == ' '))
				{
					if((ranMin.getText().isEmpty()) && (ranMax.getText().isEmpty()))
					{	
						/* VALIDA QUE EL CARACTER QUE INGRESO SEA EL CORRECTO */
						
						if(elecs.get(i).getConsu().getConsumo() == (Character)cmbConsumo.getSelectedItem())
						{					
									/* PREGUNTA SI ES LAVARROPAS O TV */
							
							if (elecs.get(i) instanceof capaEntidades.Television)
							{
								String[] electroActual = {elecs.get(i).getTipo(),String.valueOf(elecs.get(i).precioFinal()),elecs.get(i).getCol().getNombre(),
										String.valueOf(elecs.get(i).getPeso()),String.valueOf(elecs.get(i).getConsu().getConsumo())," ",
										String.valueOf(((capaEntidades.Television)elecs.get(i)).getResolucion()), ((capaEntidades.Television)elecs.get(i)).getTDT()};
								miModelo.addRow(electroActual);
							}
							else if (elecs.get(i) instanceof capaEntidades.Lavarropas)
							{
								String[] electroActual = {elecs.get(i).getTipo(),String.valueOf(elecs.get(i).precioFinal()),elecs.get(i).getCol().getColor(),
										String.valueOf(elecs.get(i).getPeso()),String.valueOf(elecs.get(i).getConsu().getConsumo()), String.valueOf(((capaEntidades.Lavarropas)elecs.get(i)).getCarga()),
										" "," "};
								miModelo.addRow(electroActual);
							}
						}
					}
					else if (!(ranMin.getText().isEmpty()) && !(ranMax.getText().isEmpty()))
					{
						if(elecs.get(i).getConsu().getConsumo() == (Character)cmbConsumo.getSelectedItem() && (elecs.get(i).precioFinal() > Float.parseFloat(txtMin.getText())) && (elecs.get(i).precioFinal() < Float.parseFloat(txtMax.getText())))
						{
							if (elecs.get(i) instanceof capaEntidades.Television)
							{
								String[] electroActual = {elecs.get(i).getTipo(),String.valueOf(elecs.get(i).precioFinal()),elecs.get(i).getCol().getColor(),
										String.valueOf(elecs.get(i).getPeso()),String.valueOf(elecs.get(i).getConsu().getConsumo())," ",
										String.valueOf(((capaEntidades.Television)elecs.get(i)).getResolucion()), ((capaEntidades.Television)elecs.get(i)).getTDT()};
								miModelo.addRow(electroActual);
							}
							else if (elecs.get(i) instanceof capaEntidades.Lavarropas)
							{
								String[] electroActual = {elecs.get(i).getTipo(),String.valueOf(elecs.get(i).precioFinal()),elecs.get(i).getCol().getNombre(),
										String.valueOf(elecs.get(i).getPeso()),String.valueOf(elecs.get(i).getConsumo().getLetra()), String.valueOf(((Entidades.Lavarropas)elecs.get(i)).getCarga()),
										" "," "};
								miModelo.addRow(electroActual);
							}
						}
					}
				}
				else if(!(txtMin.getText().isEmpty()) && !(txtMax.getText().isEmpty()))
				{
					if((elecs.get(i).precioFinal() > Float.parseFloat(txtMin.getText())) && (elecs.get(i).precioFinal() < Float.parseFloat(txtMax.getText())))
					{
						if (elecs.get(i) instanceof Entidades.Television)
						{
							String[] electroActual = {elecs.get(i).getTipo(),String.valueOf(elecs.get(i).precioFinal()),elecs.get(i).getCol().getNombre(),
									String.valueOf(elecs.get(i).getPeso()),String.valueOf(elecs.get(i).getConsumo().getLetra())," ",
									String.valueOf(((Entidades.Television)elecs.get(i)).getResolucion()), ((Entidades.Television)elecs.get(i)).getTDT()};
							miModelo.addRow(electroActual);
						}
						else if (elecs.get(i) instanceof Entidades.Lavarropas)
						{
							String[] electroActual = {elecs.get(i).getTipo(),String.valueOf(elecs.get(i).precioFinal()),elecs.get(i).getCol().getNombre(),
									String.valueOf(elecs.get(i).getPeso()),String.valueOf(elecs.get(i).getConsumo().getLetra()), String.valueOf(((Entidades.Lavarropas)elecs.get(i)).getCarga()),
									" "," "};
							miModelo.addRow(electroActual);
						}
					}
				}
			}
		}
		catch (NumberFormatException ne)
		{
			JOptionPane.showMessageDialog(null, "Verifique que los números ingresados como mínimo y máximo sean válidos.", "Error en el formato de números", JOptionPane.ERROR_MESSAGE);
		}
	
	
	
	
	
	
	
	}
	
	
	

	public void LimpiarTabla()
	{
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		while(modelo.getRowCount()>0)
			{
				modelo.removeRow(0);			
			}
	}
	
	
public static void main(String[] args) {
	try {
		ListaR dialog = new ListaR();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
	} catch (Exception e) {
		e.printStackTrace();
	}
}	
}
