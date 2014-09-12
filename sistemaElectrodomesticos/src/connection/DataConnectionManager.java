package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnectionManager {

	private static DataConnectionManager instancia;
	
	public static DataConnectionManager getInstancia(){ //Metodo para obtener la única instancia
		if(instancia==null){
			instancia=new DataConnectionManager();
		}
		return instancia;
	}
	
	private static String dbUrl="jdbc:mysql://localhost:3306/electroBase";

		
	private DataConnectionManager(){}
	
	private Connection conection;
	
	public Connection getConn(){
		try {
			if(
				conection==null || !conection.isValid(3)){
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				conection=DriverManager.getConnection(dbUrl);	
			}
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conection;
	}
	
	public void CloseConn(){
		try {
			if(conection!=null && !conection.isClosed()){
				conection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}