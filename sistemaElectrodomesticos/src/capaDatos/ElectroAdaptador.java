package capaDatos;

import java.util.ArrayList;

import connection.DataConnectionManager;
import capaEntidades.Color;
import capaEntidades.Consumo;
import capaEntidades.Electrodomesticos;
import capaEntidades.Lavarropas;
import capaEntidades.Television;
import capaDatos.ColorAdaptador;

import java.sql.*;

public class ElectroAdaptador {

	
	
	public static ArrayList<Electrodomesticos> getTodos(){
		
		ArrayList<Electrodomesticos> electros = new ArrayList<Electrodomesticos>();
		
		String sql = "SELECT idElectrodomestico, precioBase, peso, carga, resolucion, sintonizadorTdt, idConsumo, idColor FROM electrodomesticos";
		Statement sentencia=null;
		ResultSet rs=null;
		
		try{
			sentencia = DataConnectionManager.getInstancia().getConn().createStatement();
			rs = sentencia.executeQuery(sql);
			
			while(rs.next()){
				Electrodomesticos el;
				Color clr = new ColorAdaptador().getColorById(rs.getInt("idColor"),false);
			}
		
		
		
		
		
		
		
		
		}catch (SQLException e) 
		{
			e.printStackTrace();
		}
		}
	



}
		
	
	
	

