package sistemasOperacionaisEx;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NomesDatasDiretorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o diretório: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("Pastas nos diretório: ");
		System.out.println();
		for (File fl : folders) {
			System.out.println(fl.getName() + " ,data de criação: " + resgatarData(fl));
		}
		sc.close();
	}

	public static String resgatarData(File file) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		BasicFileAttributes bfa;
		String dataCriacao = "0";
		try {
			bfa = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
			FileTime tempo = bfa.creationTime();
			dataCriacao = sdf.format(new Date(tempo.toMillis()));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return dataCriacao;
	}
}
