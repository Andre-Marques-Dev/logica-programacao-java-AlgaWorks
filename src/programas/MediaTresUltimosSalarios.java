package programas;

import java.util.Scanner;

public class MediaTresUltimosSalarios {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro sal�rio: ");
		String valor1 = teclado.next().replace("," , ".");
		
		System.out.println("Informe o segundo salario: ");
		String valor2 = teclado.next().replace("," , ".");
		
		System.out.println("Informe o terceiro salario: ");
		String valor3 = teclado.next().replace("," , ".");
		
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = (salario1 + salario2 + salario3);
		
		System.out.println("A m�dia dos sal�rios �: " + soma / 3);
		
		teclado.close();
	}

}
