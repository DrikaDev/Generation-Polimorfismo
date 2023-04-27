package Polimorfismo;

public class Figuras_testa {

	public static void main(String[] args) {
		
		Figura_quadrado fig1 = new Figura_quadrado (10, "Quadrado");
		Figura_retangulo fig2 = new Figura_retangulo (3, 4, "Retângulo 1");
		
		System.out.println(fig1.getNome() + " : " + fig1.getDiagonal());
		System.out.println(fig2.getNome() + " : " + fig2.getDiagonal());
		
	}
}
