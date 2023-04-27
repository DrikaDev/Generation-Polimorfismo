package Polimorfismo;

public class Telefone_testa {

	public static void main(String[] args) {
		
		//criar os objetos:
		Telefone_Celular celular = new Telefone_Celular();
		Telefone_Fixo fixo = new Telefone_Fixo();
		Telefone_Publico publico = new Telefone_Publico();
		
		//não é objeto, é uma variavel do tipo telefone:
		Telefone telefone = null;
		
		//pra pegar os numeros 0 1 e 2 aleatórios:
		int n = (int)(Math.random()*3.0);
		
		//mostrar qual numero pegou:
		System.out.println("O número sorteado foi: " + n);
		
		switch(n) {
		case 0: telefone = celular; break;
		case 1: telefone = fixo; break;
		case 2: telefone = publico; break;
		default: System.out.println("\nErro inesperado!");	
		}
		
		if(telefone != null) {
			telefone.disca("94545-5454");
			telefone.toca(3);
		}

	}
}
