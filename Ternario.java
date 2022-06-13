package fudamentos;

public class Ternario {
	public static void main(String[] args) {
		
		
	double media = 6.0;
	String resultadoInicial = media >= 7.0 ? "Aprovado" : "Provavel Recuperacao";
	String resultadoFinal = media >= 5.0 ? "Em Recuperacao" : "Reprovado";
	
	System.out.println("Media Inicial do aluno seria: " + resultadoInicial);
	System.out.println("Media Final seria: " + resultadoFinal);
	}
}
