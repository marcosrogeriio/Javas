package fudamentos;
import java.util.Scanner;


public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2"== "s");
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		
		String s3 = entrada.next();
		System.out.println("2" == s3);
	
																					
		System.out.println("2".equals(s3));
		entrada.close();
	}
}
																			