package capaEntidades;

public class Consumo {
		
	private char consumo;
	private char letra;
	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	
	public Consumo(){}
	
	public Consumo(char con){
		letra = Character.toUpperCase(con);

		consumo = letra;
	}

	
}
