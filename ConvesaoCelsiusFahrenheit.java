package sensei;

import java.util.Scanner;

public class ConvesaoCelsiusFahrenheit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe valor de Celsius ");
		double celsius = scanner.nextDouble();
		
		double conversao = celsius -32 / 9.5;
		
		System.out.println("A temperatura em Fahrenheit e " + conversao);
		
		scanner.close();
	}
}
