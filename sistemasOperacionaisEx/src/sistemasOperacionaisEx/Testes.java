package sistemasOperacionaisEx;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Testes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
		System.out.println("AbsolutePath: " + path.getAbsolutePath());
		sc.close();
	}
}
