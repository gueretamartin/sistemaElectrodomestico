package capaEntidades;

public class Television extends Electrodomesticos {
	
	private float resolucion;
	private boolean sintonizadorTdt;
	
	 
	
	public float getResolucion() {
		return resolucion;
	}
	public void setResolucion(float resolucion) {
		this.resolucion = resolucion;
	}
	public boolean getSintonizadorTdt() {
		return sintonizadorTdt;
	}
	public void setSintonizadorTdt(boolean sintonizadorTdt) {
		this.sintonizadorTdt = sintonizadorTdt;
	}
	
	public Television(){
		
		super();
		resolucion=20;
		sintonizadorTdt=false;
	}
	
	public Television(float pre,float pes){
		super(pre,pes);
		resolucion=20;
		sintonizadorTdt=false;
	}
	
	public Television(float prec,float peso,char cons,  float res,String col,boolean sinto)

	{
		super(prec,peso,col,cons);
		resolucion = res ;
		sintonizadorTdt = sinto;
	}
	
}
