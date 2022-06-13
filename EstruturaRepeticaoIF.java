package controle;
 import java.util.Scanner;
public class EstruturaRepeticaoIF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a media ");
		double media = entrada.nextDouble();
		
		if(media <10 && media >= 7.0) {
		    	System.out.println("Aprovado");
			    System.out.println("Parabens");
		    }
		if(media < 6.0 && media <= 5.0) {
			System.out.println("Recuperacao amigo!");
			System.out.println("Reprovado Otario");
		}
		//boolean criterioReprovacaoAtigindo = media < 4.5 && media >= 0;
		    
		if (media <4.5) {
			System.out.println("Totalmente Reprovado");
		}
		entrada.close();
	}
	
}
