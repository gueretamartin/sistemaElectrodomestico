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
		/*char letra = this.comprobarConsumoEnergetico(consu);*/
		this.consu = new Consumo(consu);
		
	}
	
	/* public char  comprobarConsumoEnergetico(char letra){
		letra=Character.toUpperCase(letra); 
		if (letra!='A' || letra!='B' || letra!='C' || letra!='D' || letra!='E')	
			letra = 'F';  			
		return letra;
	}*/
	
	private String comprobarColor(String colo){
		
		if(colo!="NEGRO" || colo!="AZUL" || colo!="GRIS" || colo!="ROJO"){
			colo = "BLANCO";
		}
		
		return colo;
	}
	
	public String getTipo()
	{
		String tipo = "Electrodomesticos";
				return tipo;
	}
	
	public double precioFinal()
	{
		double precio_final = 0;
		
		precio_final += this.getPrecioBase();
		
		if((this.peso > 0) && (this.peso <= 19)) 
		{
			precio_final += 10;
		}
		else if ((this.peso > 19) && (this.peso <= 49))
		{
			precio_final += 50;
		}
		else if ((this.peso > 49) && (this.peso <= 79))
		{
			precio_final += 80;
		}
		else if (this.peso > 79)
		{
			precio_final += 100;
		}
		
		switch((this.consu).getConsumo())
		{
			case('A'): 
			{
				precio_final += 100;
				break;
			}
			case('B'): 
			{
				precio_final += 80;
				break;
			}
			case('C'): 
			{
				precio_final += 60;
				break;
			}
			case('D'): 
			{
				precio_final += 50;
				break;
			}
			case('E'): 
			{
				precio_final += 30;
				break;
			}
			case('F'): 
			{
				precio_final += 10;
				break;
			}
		}
		
		return precio_final; 
	}
	}

