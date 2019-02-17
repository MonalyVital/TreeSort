package arquivoordena;

public class Ordenacao {

	public int[] insertionSort(int[] vetor) {
		long tempoinicial = System.currentTimeMillis();
		for (int i = 0; i < vetor.length; i++) {
			int atual = vetor[i];
			int j = i - 1;
			while (j >= 0 && vetor[j] >= atual) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = atual;
			;
		}
		long tempofinal = System.currentTimeMillis();
		long tempototal = tempofinal - tempoinicial;
		System.out.println("Tempo de Processamento de InsertionSort: " + tempototal + "ms");
		return vetor;
	}

	public int[] mergeSort(int[] array) {
		long tempoinicial = System.currentTimeMillis();
		array = MergeSort.sort(array);
		long tempofinal = System.currentTimeMillis();
		long tempototal = tempofinal - tempoinicial;
		System.out.println("Tempo de Processamento de MergeSort: " + tempototal + "ms");
		return array;
	}

	public int[] heapSort(int[] array) {
		long tempoinicial = System.currentTimeMillis();
		array = HeapSort.sort(array);
		long tempofinal = System.currentTimeMillis();
		long tempototal = tempofinal - tempoinicial;
		System.out.println("Tempo de Processamento de HeapSort: " + tempototal + "ms");
		return array;
	}

	public int[] treeSort(int[] array) {
		long tempoinicial = System.currentTimeMillis();
		
		TreeSort arv = new TreeSort();
		arv.inserir(array, 0);
		arv.caminhar();
		
		int[] arrayNormal = new int[arv.arr.size()];
	
		for(Integer i = 0; i<arv.arr.size();i++) {
			//System.out.println(arv.arr.get(i));
			arrayNormal[i] = arv.arr.get(i);
		}
		
		array = arrayNormal;
		long tempofinal = System.currentTimeMillis();
		long tempototal = tempofinal - tempoinicial;
		System.out.println("Tempo de Processamento de TreeSort: " + tempototal + "ms");
		return array;
	}

	public void imprimirVetor(int[] array) {
		for (int counter = 0; counter < (array.length - 1); counter++) {
			System.out.println(array[counter]);
		}
	}
}