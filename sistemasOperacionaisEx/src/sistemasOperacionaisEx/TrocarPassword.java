package sistemasOperacionaisEx;

import java.io.IOException;
import java.util.Scanner;

public class TrocarPassword {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//A IDE deve ser inicializada como adm!!!
		System.out.println("Digite o usu�rio: ");
		String user = sc.next();
		System.out.println("Digite a nova senha: ");
		String senha = sc.next();
		Runtime.getRuntime().exec("cmd /C net "+ user +" "+ senha );
		sc.close();
	}
}
