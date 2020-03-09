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
	
	private final String VALOR_INVALIDO = "VALOR INVALIDO";

	private void start() {
		
		List<String> lista = new ArrayList<String>();
		
		
		while(lista.size() < 5) {
			
			String valorRecebido = obterDados();
			// System.out.println("o valor recebido foi: " + valorRecebido);
			if(valorRecebido.isEmpty()
				||valorRecebido.contentEquals(VALOR_INVALIDO)){
				System.out.println("este valor foi descartado");
		
			}else {
				lista.add(valorRecebido);
			}
			lista.add(valorRecebido);
			
		}
		
		for(String item: lista) {
			System.out.println("o item da lista é: " + item);
		}
	}
	
	private String obterDados() {
		try {
			System.out.println("digite o valor: ");
			int valor = scanner.nextInt();
			
			return String.valueOf(valor);
			
		} catch(Exception e) {
			scanner.next();
			System.out.println("um valor invalido foi digitado");
			return "valor invalido";
		}
		
		
		
	}
}
