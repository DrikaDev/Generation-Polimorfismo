package Polimorfismo;

public abstract class Telefone {
	
	//atributo
	private String tipo;
	
	//dois metodos abstratos pq a classe é abstrata:
	abstract public void disca(String numero);
	abstract public void toca(int numToques);
	
	//construtor:
	public Telefone(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	//get e set:
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
