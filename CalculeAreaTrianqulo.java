package sensei;

import java.util.Scanner;

public class CalculeAreaTrianqulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Base");
		double base = scanner.nextDouble();
		
		System.out.println("Digite valor da Altura ");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) /2;
		System.out.println("A area do trianqulo e:" + area);
		
		scanner.close();
	}
}
