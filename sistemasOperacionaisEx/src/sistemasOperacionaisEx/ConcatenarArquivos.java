package sistemasOperacionaisEx;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcatenarArquivos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo 1: ");
		List<String> lista1 = lerArquivo(sc.next());
		System.out.println("Digite o caminho do arquivo 2: ");
		List<String> lista2 = lerArquivo(sc.next());
		lista1.addAll(lista2);
		System.out.println("Digite onde deseja e qual o nome do arquivo a ser criado:");
		Boolean sucess = criarArquivo(lista1, Path.of(sc.next()));
		if(sucess == true) {
			System.out.println("O arquivo foi criado com sucesso");
		}
		sc.close();
	}
	
	public static List<String> lerArquivo(String path) {
		File file = new File(path);
		List<String> lista = new ArrayList<>();
		try {
			 lista = Files.readAllLines(file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	}

	public static boolean criarArquivo(List<String> lista, Path path) {
		try(BufferedWriter bw = Files.newBufferedWriter(path);){
			for(String linha: lista) {
				bw.write(linha);
				bw.newLine();
			}
			return true;
		}catch(IOException e){
			return false;
		}
	}
}