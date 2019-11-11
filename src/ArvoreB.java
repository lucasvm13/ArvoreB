
public class ArvoreB {

	private No raiz;

	public int noRaiz() {
		return raiz.valor;
	}

	public void InsereNaArvore(No pai, No filho) {
		if (raiz == null) {
			raiz = filho;
		} else {
			if (pai.filhoDir == null) {
				if (pai.filhoEsq == null) {
					pai.filhoEsq = filho;
				} else {
					pai.filhoDir = filho;
					filho.raiz = filho;
				}
			}
		}
	}

	public void retornaFilhosDeUmNo(No no) {

		System.out.print("Filhos do nó " + no.valor + " : ");

		if ((no.filhoDir == null) && (no.filhoEsq == null)) {
			System.out.print(" Esse nó não tem filhos ! ");
		} else if (no.filhoEsq == null) {
			System.out.println(no.filhoDir.valor);
		} else if (no.filhoDir == null) {
			System.out.println(no.filhoEsq.valor);
		} else {
			System.out.println(no.filhoEsq.valor + " " + no.filhoDir.valor);
		}
	}

	public boolean VerificaNoInterno(No no) {
		if (no.filhoEsq != null) {
			return true;
		} else if (no.filhoDir != null) {
			return true;
		}
		return false;
	}

	public boolean VerificaNoExterno(No no) {
		if ((no.filhoEsq == null) && (no.filhoDir == null)) {
			return true;
		}
		return false;
	}

	public void removeNoFolha(No pai, No no) {
		if (VerificaNoExterno(no)) {
			if ((pai.filhoEsq.equals(no) && pai.filhoEsq != null)) {
				pai.filhoEsq = null;
			} else {
				if ((pai.filhoDir.equals(no) && pai.filhoDir != null)) {
					pai.filhoDir = null;
				}
			}
		}

	}

	public void retornaFilhoEsquerdaDireita(No pai) {
		if (pai.filhoEsq == null) {
			System.out.println("Não tem filhos a esquerda");
			System.out.println("Filho a direita: " + pai.filhoDir.valor);
		} else {
			if (pai.filhoDir == null) {
				System.out.println("Filho a esquerda: " + pai.filhoEsq.valor);
				System.out.println("Não tem filhos a direita");

			} else {
				System.out.println("Filho a esquerda: " + pai.filhoEsq.valor);
				System.out.println("Filho a direita: " + pai.filhoDir.valor);
			}
		}

	}

}
