package sensei;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit" );
		double celsius = scanner.nextDouble();
		
		double conversao = celsius- 32 /1.8;
		
		System.out.println("Valor de celsius " + conversao);
		
		scanner.close();
		
	}
}
