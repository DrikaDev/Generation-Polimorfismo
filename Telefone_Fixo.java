package Polimorfismo;

public class Telefone_Fixo extends Telefone {

	// construtor
	public Telefone_Fixo() {
		super("Telefone Fixo");
	}

	@Override
	public void toca(int numToques) {
		
		for(int i=0; i<numToques; i++) {
			System.out.println("\nTrimmmm");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando: " + numero);
	}
}
