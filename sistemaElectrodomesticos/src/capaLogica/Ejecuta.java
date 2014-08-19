package capaLogica;

import capaEntidades.*;
import capaDatos.*;
public class Ejecuta {
	

	public static void agregaLavarropas(float pre, float pes, float car, char cons, String col){
		
		Lavarropas electro = new Lavarropas(pre,pes,car,cons, col);
		Datos.guardaElectrodomestico(electro);
	}	
	
	public static void agregaTelevisor(float prec,float peso,char cons, float res,String col,boolean sinto){;
		Television electro = new Television(prec,peso,cons, res,col,sinto);
	Datos.guardaElectrodomestico(electro);
}}