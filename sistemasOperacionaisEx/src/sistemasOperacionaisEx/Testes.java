package sistemasOperacionaisEx;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Locale;
import java.util.Scanner;

public class Testes {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File file = new File(strPath);
		String str = "um show";
		byte[] data = str.getBytes();
		Files.write(file.toPath(), data);
		
		sc.close();
	}
}
