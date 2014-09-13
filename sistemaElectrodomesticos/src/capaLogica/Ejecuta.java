package capaLogica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import capaEntidades.*;
import capaDatos.*;

public class Ejecuta  {
	private static ArrayList<Electrodomesticos> elecs;

	public static void agregaLavarropas(float pre, float pes, float car, char cons, String col){
		
		Lavarropas electro = new Lavarropas(pre,pes,car,cons, col);
		Datos.guardaElectrodomestico(electro);
	}	
	
	public static void agregaTelevisor(float prec,float peso,char cons, float res,String col,boolean sinto)
	{
		Television electro = new Television(prec,peso,cons, res,col,sinto);
	Datos.guardaElectrodomestico(electro);
	}
	
	
	
	
	public  ArrayList<Electrodomesticos> getOrden(){
		elecs = Datos.getElectrodomesticos();

		Collections.sort(elecs,	new Comparator<Electrodomesticos>() {
		public int compare(Electrodomesticos o1, Electrodomesticos o2)
			{
				return o1.getTipo().compareTo(o2.getTipo());
			}});
	return elecs;
	}

	
	
	public static void eliminarElec(Electrodomesticos electroActual) {
		Datos.eliminarElectro(electroActual);
		
	}

	public static String[] getColores() {
		ArrayList<Color> cls= capaDatos.ColorAdaptador.getColores();
		String col1 = cls.get(0).getColor();
		String col2 = cls.get(1).getColor();
		String col3 = cls.get(2).getColor();
		String col4 = cls.get(3).getColor();
		String col5 = cls.get(4).getColor();
		String[] valores= new String[]{col1,col2,col3,col4,col5} ;
		return valores;
	}}

	

