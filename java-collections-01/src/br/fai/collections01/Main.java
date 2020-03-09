package br.fai.collections01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	private Scanner scanner = new Scanner(System.in);

	private void start() {
		
		List<String> lista = new ArrayList<String>();
		
		String valorRecebido = obterDados();
		System.out.println("o valor recebido foi: " + valorRecebido);
	}
	
	private String obterDados() {
		
		System.out.println("digite o valor: ");
		
		int valor = scanner.nextInt();
		return String.valueOf(valor);
		
	}
}
