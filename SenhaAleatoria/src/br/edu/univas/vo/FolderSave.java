package br.edu.univas.vo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FolderSave {

	public static void generateFile(String senha) throws IOException {

		Scanner scanner = new Scanner(System.in);

		String path = "";

		System.out.println("Escolha aonde deseja salvar a senha gerada: ");

		path = scanner.nextLine();

		FileWriter arquivo = new FileWriter(path + "\\secret_password.txt");
		PrintWriter saveFile = new PrintWriter(arquivo);
		saveFile.print(senha);
		System.out.println("Senha gerada com sucesso!");
		arquivo.close();
		scanner.close();

	}

}
