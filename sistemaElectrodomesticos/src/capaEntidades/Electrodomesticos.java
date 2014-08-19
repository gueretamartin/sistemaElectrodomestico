package capaEntidades;

public class Electrodomesticos {
	
	private float precioBase;
	private float peso;
	private Color col;
	private Consumo consu;
	
	
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public Consumo getConsu() {
	return consu;
	}
	public void setConsu(Consumo consu) {
		this.consu = consu;
	}
	public Color getCol() {
		return col;
	}
	public void setCol(Color col) {
		this.col = col;
	}
	
	
	/* Constructor por defecto */
	
	public Electrodomesticos()
	
	{
		precioBase=100;
		peso=5;
		col = new Color();
		consu=new Consumo();
		
	};
		
	public Electrodomesticos(float p, float pe)
	
	{
		precioBase = p ;
		peso = pe;
		col = new Color();
		consu=new Consumo();
		
	}
	
	public Electrodomesticos(float p, float pe, String colo, char consu)
	
	{
		;
		precioBase = p ;
		peso = pe;
		this.col = new Color(comprobarColor(colo));
		this.consu = new Consumo(this.comprobarConsumoEnergetico(consu));
		
	}
	
	public char  comprobarConsumoEnergetico(char letra){
		if (letra!='A' || letra!='B' || letra!='C' || letra!='D' || letra!='E')	
		{	letra = 'F'; } 			
		return letra;
	}
	
	private String comprobarColor(String colo){
		
		if(colo!="NEGRO" || colo!="AZUL" || colo!="GRIS" || colo!="ROJO"){
			colo = "BLANCO";
		}
		
		return colo;
		}}

