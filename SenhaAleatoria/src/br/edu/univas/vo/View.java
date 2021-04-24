package br.edu.univas.vo;

import java.util.Scanner;

public class View {
	private int tamMax;
	private int tamMin;
	private int letraMin;
	private int letraMai;
	private int numeros;
	private int special;
	Scanner scanner = new Scanner(System.in);

	public int getTamMax() {
		return tamMax;
	}

	public void setTamMax(int tamMax) {
		this.tamMax = tamMax;
	}

	public int getTamMin() {
		return tamMin;
	}

	public void setTamMin(int tamMin) {
		this.tamMin = tamMin;
	}

	public int getLetraMin() {
		return letraMin;
	}

	public void setLetraMin(int letraMin) {
		this.letraMin = letraMin;
	}

	public int getLetraMai() {
		return letraMai;
	}

	public void setLetraMai(int letraMai) {
		this.letraMai = letraMai;
	}

	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	public int getSpecial() {
		return special;
	}

	public void setSpecial(int special) {
		this.special = special;
	}

	public void cadastro() {

		System.out.println("Qual o tamanho mínimo de senha que deseja?\n");
		setTamMin(scanner.nextInt());

		System.out.println("Qual o tamanho máximo de senha que deseja?\n");
		setTamMax(scanner.nextInt());

		System.out.println("Deseja que contenha letras maiusculas?\n1-SIM	2-NÃO");
		setLetraMai(scanner.nextInt());

		System.out.println("Deseja que contenha letras minusculas?\n1-SIM	2-NÃO");
		setLetraMin(scanner.nextInt());

		System.out.println("Deseja que contenha números?\n1-SIM	2-NÃO");
		setNumeros(scanner.nextInt());

		System.out.println("Deseja que contenha caracteres especiais?\n1-SIM	2-NÃO");
		setSpecial(scanner.nextInt());
	}

	public String generateSeed() {
		String seedMai = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String seedMin = "abcdefghijklmnopqrstuvxyzw";
		String seedNum = "123456789";
		String seedSpecial = ":!@#$%&*";
		String seedPass = "";

		if (letraMai == 1) {
			seedPass = seedPass + seedMai;
		}
		if (letraMin == 1) {
			seedPass = seedPass + seedMin;

		}
		if (numeros == 1) {
			seedPass = seedPass + seedNum;
		}
		if (special == 1) {
			seedPass = seedPass + seedSpecial;
		}
		return seedPass;
	}
}
