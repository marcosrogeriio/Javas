package sensei;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu peso");
		double peso = scanner.nextDouble();
		
		System.out.println("Ditite sua Altura");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println("Seu IMC e de" + imc);
		scanner.close();
		
	}
}
