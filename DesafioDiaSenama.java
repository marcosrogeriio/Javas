package controle;

import java.util.Scanner;
public class DesafioDiaSenama {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite nome do dia:");
		
		String dia = entrada.next();
		
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}else if ("segunda Feira".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}else if ("terca Feira".equalsIgnoreCase(dia) 
			   || "terça".equalsIgnoreCase(dia)) {
			System.out.println(3);  
		}else if("Quarta Feira".equalsIgnoreCase(dia)) {
			System.out.println(4); 
		}else if("Quinta Feira".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}else if("Sexta Feira".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}else if("Sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}
		
		entrada.close();
	}
}
