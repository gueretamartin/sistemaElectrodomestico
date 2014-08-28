package capaDatos;

import java.util.ArrayList;
import capaEntidades.*;


public class Datos {
										/* Create a new aa a a a  ArrayList of appliance */
	
	
	static ArrayList<Electrodomesticos> electrodomesticos = new ArrayList<Electrodomesticos>();


										/* return all the objects */ 
	
		public static ArrayList<Electrodomesticos> getElectrodomesticos() {
		return electrodomesticos;
	}
		
		public static void setElectrodomesticos(
				ArrayList<Electrodomesticos> electrodomesticos) {
			Datos.electrodomesticos = electrodomesticos;
		}
		
		
		
								/* return that between at rangeMin and rangeMax */
		
		public static ArrayList<Electrodomesticos> getPorRangoDeImporte(float precmin, float precmax) {
			for(int i = 0; i< electrodomesticos.size(); i++){
		         if(electrodomesticos.get(i).getPrecioBase()>precmin &&  electrodomesticos.get(i).getPrecioBase()<precmax){
		        	electrodomesticos.add(electrodomesticos.get(i));

		         }}
			return electrodomesticos;
		}
										
											/* Add a new appliance */
		
		public static  void guardaElectrodomestico(Electrodomesticos electro)
			{
		electrodomesticos.add(electro);
			}
	
	
	
		
		
	public void eliminarElectrodomestico(Electrodomesticos electro)
	{};
	public void modificarElectrodomestico(Electrodomesticos electro)
	{}

	
	
	 public ArrayList<Electrodomesticos> GetAll()
	    {
	        return electrodomesticos;
	    }


	
	
	/*
	 * muestraPersonas(electrodomesticos);
	 * 
	 * 
	 * 
	 * public static void muestraPersonas(ArrayList<Electrodomesticos> electrodomesticos)
	{
		for(int i = 0; i< electrodomesticos.size(); i++)
            System.out.println(electrodomesticos.get(i).getCol().getColor()); 
    }*/
	}	


