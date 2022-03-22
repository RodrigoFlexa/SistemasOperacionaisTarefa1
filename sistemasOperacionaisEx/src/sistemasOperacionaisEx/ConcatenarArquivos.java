package sistemasOperacionaisEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcatenarArquivos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<String> lista1 = lerArquivo(sc.next());
		List<String> lista2 = lerArquivo(sc.next());
		lista1.addAll(lista2);
		escreverNoArquivo(lista1, sc.next());
		sc.close();
	}

	public static List<String> lerArquivo(String path) {
		List<String> lista = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				lista.add(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return lista;
	}

	public static void escreverNoArquivo(List<String> lista, String path) {
		// o true serve para não mudar as informações que já tem no arquivo
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			for(String linha: lista) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}