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
	}}

	

