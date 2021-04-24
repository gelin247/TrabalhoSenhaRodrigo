package br.edu.univas.main;

import java.io.IOException;

import br.edu.univas.vo.FolderSave;
import br.edu.univas.vo.Senha;
import br.edu.univas.vo.View;

public class StartApp {

	public static void main(String[] args) throws IOException {
		View preferencias = new View();
		Senha senha = new Senha();

		System.out.println("BEM VINDO AO GERADOR DE SENHAS");
		System.out.println("PRECISAMOS DE ALGUNS DADOS SOBRE A SENHA DESEJADA: ");

		preferencias.cadastro();
		senha.randomSize(preferencias.getTamMin(), preferencias.getTamMax());

		senha.passwordGenerator(senha.getTamanho(), preferencias.generateSeed());

		FolderSave.generateFile(senha.getSenha());

	}
}
