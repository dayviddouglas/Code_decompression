package Descompressao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um texto comprimido..."
				+ " Exemplo: 13A3H2E1M");
		String textoUsuario = entrada.nextLine();
		Descompressao d = new Descompressao();
		System.out.println("O texto descomprimido ficou: "+ d.descomprimir(textoUsuario));
		entrada.close();
	}

}
