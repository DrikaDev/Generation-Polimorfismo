package Polimorfismo;

//multipla herança - tem duas mães:
public class Figura_quadrado extends Figura_base implements Figuras{

	//construtor:
	Figura_quadrado(double lado, String nome) {
		super(lado, lado, nome);
		//não é atributo do quadrado, ele vem do Figura_base.
		nomeClasse = "Quadrado";
	}
	
	//metodo polimorfico:
	//get diagonal:
	@Override
	public double getDiagonal() {
		return Math.sqrt(2)*lado1;
	}
	
}
