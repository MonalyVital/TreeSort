package arquivoordena;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ArquivoGera {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\monal\\OneDrive\\�rea de Trabalho\\PAA\\arquivo.txt");

		if (!arquivo.exists()) {
//cria um arquivo (vazio)
			arquivo.createNewFile();
		}

//caso seja um diretório, é possível listar seus arquivos e diretórios
		File[] arquivos = arquivo.listFiles();

//escreve no arquivo
		FileWriter fw = new FileWriter(arquivo, true);

		BufferedWriter bw = new BufferedWriter(fw);
//inicializa gerador de numeros aleatórios
		Random gerador = new Random();

//gera aleatorio e grava com ;
		for (long x = 0; x < 100; x++)
			bw.write(gerador.nextInt(100) + ";");
		bw.newLine();

		bw.close();
		fw.close();
	}

}