package br.edu.univas.vo;

import java.util.Random;

public class Senha {

	private String senha = "";
	private int size;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTamanho() {
		return size;
	}

	public void setTamanho(int tamanho) {
		this.size = tamanho;
	}

	public void passwordGenerator(int size, String seedPass) {
		Random aleatorio = new Random();
		int generatedPass;
		for (int i = 0; i < size; i++) {
			generatedPass = aleatorio.nextInt(seedPass.length() - 1);
			senha = senha + seedPass.charAt(generatedPass);
		}
	}

	public int randomSize(int min, int max) {

		Random aleatorio = new Random();
		setTamanho(aleatorio.nextInt((max - min) + 1) + min);

		return size;

	}
}
