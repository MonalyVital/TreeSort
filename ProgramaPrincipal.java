package arquivoordena;
 
import java.io.IOException;
 
public class ProgramaPrincipal {
 
    public static void main(String[] args) throws IOException {
 
        Arquivo arquivo = new Arquivo();
        Ordenacao ordenar = new Ordenacao();
        int[] arrayDesordenado = new int[10000];
        int[] arrayOrdenado = new int[10000];
        
        arrayDesordenado = arquivo.lerArquivo("C:\\Users\\monal\\OneDrive\\Área de Trabalho\\PAA\\database.txt");
        
        arrayOrdenado = ordenar.treeSort(arrayDesordenado);
        arrayOrdenado = ordenar.insertionSort(arrayDesordenado);
        arrayOrdenado = ordenar.mergeSort(arrayDesordenado);
        arrayOrdenado = ordenar.heapSort(arrayDesordenado);
        
        arquivo.gravarArquivo("C:\\Users\\monal\\OneDrive\\Área de Trabalho\\PAA\\databaseOrdenada.txt", arrayOrdenado);
    }
}