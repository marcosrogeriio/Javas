package sensei;

import java.util.Scanner;

public class ResultadoAoQuadradoAoCubo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		double valor = scanner.nextDouble();
		
		double quadrado = Math.pow(valor,2);
		double cubo = Math.pow(valor, 3);
		
		System.out.println("O valor ao quadrado e: " + quadrado + "\n O valor ao cubo e: " + cubo);
		
		scanner.close();
	}
}
