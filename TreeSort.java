package arquivoordena;

import java.util.ArrayList;

public class TreeSort {
	private No root; // raiz
	int tam;
	ArrayList<Integer> arr = new ArrayList<Integer>();

	public TreeSort() {
		root = null;
	} // inicializa arvore

	public void inserir(int vet[], int pos) {
		No novo = new No(); // cria um novo Nó
		novo.item = vet[pos]; // atribui o valor recebido ao item de dados do Nó
		novo.dir = null;
		novo.esq = null;

		if (root == null) {
			root = novo;
			tam = vet.length;
		} else { // se nao for a raiz
			No atual = root;
			while (true) {
				if (novo.item <= atual.item) { // ir para esquerda
					if (atual.esq == null) {
						atual.esq = novo;
						break;
					} else {
						atual = atual.esq;
					}
				} // fim da condição ir a esquerda
				else { // ir para direita
					if (atual.dir == null) {
						atual.dir = novo;
						break;
					} else {
						atual = atual.dir;
					}
				} // fim da condição ir a direita
			} // fim do laço while
		} // fim do else não raiz

		if (pos < tam - 1)
			this.inserir(vet, pos + 1);
	}

	public void caminhar() {
		System.out.print("\n Exibindo em ordem crescente: ");
		inOrder(root);
		System.out.print("\n Exibindo em ordem decrescente: ");
		inDecr(root);
		System.out.print("\n Valor minimo: " + min().item);
		System.out.println("\n Valor maximo: " + max().item);
	}

	public void inOrder(No atual) {
		if (atual != null) {
			inOrder(atual.esq);
			System.out.print(atual.item + " ");
			arr.add(atual.item);
			inOrder(atual.dir);
		}
	}

	public void inDecr(No atual) {
		if (atual.dir != null) {
			inDecr(atual.dir);
		}
		System.out.print(atual.item + " ");
		if(atual.esq != null)
			inDecr(atual.esq);
		
	}

	public No min() {
		No atual = root;
		No anterior = null;
		while (atual != null) {
			anterior = atual;
			atual = atual.esq;
		}
		return anterior;
	}

	public No max() {
		No atual = root;
		No anterior = null;
		while (atual != null) {
			anterior = atual;
			atual = atual.dir;
		}
		return anterior;
	}
	
}
