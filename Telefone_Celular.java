package Polimorfismo;

//celular é uma herança do telefone:
public class Telefone_Celular extends Telefone{
	
	//não vai ter atributo nenhum
	
	//construtor
	public Telefone_Celular() {
		super("Telefone Celular");
	}
	
	//anotação que confirma que o toca e o disca é um metodo polimorfico: @Override
	
	//implementar o toca:
	@Override
	public void toca(int codToque) {
		switch(codToque) {
		case 1:
			System.out.println("\nDingDong");
			break;
		case 2:
			System.out.println("\nTrimmm");
			break;
			default:
			System.out.println("Vrum vrum");
		}
	}
	
	//implementar o disca:
	@Override
	public void disca(String numero) {
		System.out.println("\nO número " + numero + " é um celular.");
	}
}
