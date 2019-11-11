
public class Principal {

	public static void main(String[] args) {

		ArvoreB arvoreb = new ArvoreB();

		No no1 = new No(5);
		No no2 = new No(10);
		No no3 = new No(20);
		No no4 = new No(30);
		No no5 = new No(40);

		arvoreb.InsereNaArvore(null, no1);
		arvoreb.InsereNaArvore(no1, no2);
		arvoreb.InsereNaArvore(no1, no4);
		arvoreb.InsereNaArvore(no3, no5);

		arvoreb.InsereNaArvore(no2, null);

		arvoreb.retornaFilhosDeUmNo(no1);

		arvoreb.VerificaNoInterno(no3);
		
		System.out.println(" ");
		
		System.out.println(" ");

		// VERIFICA NÓ INTERNO
		if (arvoreb.VerificaNoInterno(no1)) {
			System.out.println("É no interno !");
		} else {
			System.out.println("Não é nó interno !");
		}

		System.out.println(" ");

		// VERIFICA NÓ EXTERNO
		if (arvoreb.VerificaNoExterno(no1)) {
			System.out.println("É nó externo !");
		} else {
			System.out.println("Não é nó externo !");
		}

		System.out.println(" ");

		System.out.println(" ");
		
		
		
		arvoreb.removeNoFolha(no1, no4);
		arvoreb.retornaFilhosDeUmNo(no1);
	}
}
