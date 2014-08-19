package capaEntidades;

public class Consumo {
		
	private char consumo;

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	
	public Consumo(){
		consumo = 'F';
	}
	
	public Consumo(char con){
		consumo = con;
	}

	
}
