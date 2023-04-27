package Polimorfismo;

public class Figura_retangulo extends Figura_base implements Figuras{

	Figura_retangulo(double lado1, double lado2, String nome) {
		super(lado1, lado2, nome);
		//atributo figura base:
		nomeClasse = "Retângulo";
	}

	//metodo polimorfico:
	//get diagonal:
	@Override
	public double getDiagonal() {
		//sqrt é raiz quadrada
		return Math.sqrt(Math.pow(lado2, lado1)+ Math.pow(lado2, lado1));	
	}

}
