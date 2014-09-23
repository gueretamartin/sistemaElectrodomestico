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


			while(rs.next())
			{
				Electrodomesticos el;
				
				Color clr = new ColorAdaptador().getColorById(rs.getInt("idColor"),false);
				Consumo consu = new ConsumoAdaptador().getConsumoPorID(rs.getInt("idConsumo"),false);
				
				if(rs.getDouble("carga") == 0)
				{					
					el = new Television(rs.getFloat("precioBase"),rs.getFloat("peso"), consu.getConsumo(), rs.getFloat("resolucion"), clr.getColor(), rs.getBoolean("sintonizadorTdt"));
				}
				else
				{
					el = new Lavarropas(rs.getFloat("precioBase"),rs.getFloat("peso"), rs.getFloat("carga"), consu.getConsumo(),clr.getColor());					
				}
				el.setIdElectro(rs.getInt("idElectrodomestico"));
				electros.add(el);
				
			}					
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
				}
				if(sentencia!=null && !sentencia.isClosed())
				{
					sentencia.close();
				}
				DataConnectionManager.getInstancia().CloseConn();
			}
			catch (SQLException sqle)
			{
				sqle.printStackTrace();
			}
		}		
		return electros;
	}
		
		
		
		
		
		
		
}
		
	
	
	

