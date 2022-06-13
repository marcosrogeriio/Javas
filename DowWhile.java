package controle;

import java.util.Scanner;

public class DowWhile {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			 String texto = "por favor";
			 
			 do {
				 System.out.println("Voce precisa falar" + "\n palavras magicas");	
				 System.out.println("Quer sair?");
				 texto = entrada.nextLine();
			 }while(!texto.equalsIgnoreCase("por favor"));
			 
			 System.out.println("Obrigado Amigo");
			entrada.close();

  }
}