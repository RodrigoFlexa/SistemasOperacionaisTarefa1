package sistemasOperacionaisEx;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TrocandoNomeNoDiretorio {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o caminho do diretório:");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);

		for (File fl : folders) {
			String novoNome = "L" + fl.getName().substring(1);
			File novoFile = new File(fl.getParent() + "\\" + novoNome);
			fl.renameTo(novoFile);
		}
		sc.close();
	}
}
