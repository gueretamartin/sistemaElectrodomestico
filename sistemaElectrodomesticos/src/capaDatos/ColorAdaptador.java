package capaDatos;

import capaEntidades.Color;
import connection.DataConnectionManager;
import java.sql.*;
import java.util.ArrayList;

public class ColorAdaptador {
	

	public static ArrayList<Color> getColores(){
		
		ArrayList<Color> cls= new ArrayList<Color>();
		
		String sql="SELECT idColor, color FROM color";
		Statement sentencia=null;
		ResultSet rs=null;
		
		
		try 
		{			
			sentencia = DataConnectionManager.getInstancia().getConn().createStatement();
			rs = sentencia.executeQuery(sql);
			
			while(rs.next())
			{
				Color color = new Color(rs.getString("color"));
				color.setIdColor(rs.getInt("idColor"));
				
				cls.add(color);
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
				if(sentencia!=null /*&& !sentencia.isClosed()*/)
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
				
		return cls;
	}
	
}
