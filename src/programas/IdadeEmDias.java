package programas;

import java.util.Scanner;

public class IdadeEmDias {
	
	public static void main(String[] args) {
		
		/*
		   Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
			mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
			(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int dias, meses, anos;
		
		System.out.println("Informe a sua idade em anos: ");
		anos = entrada.nextInt();
		
		System.out.println("Informe a sua idade em meses: ");
		meses = entrada.nextInt();
		
		System.out.println("Informe a sua idade em dias: ");
		dias = entrada.nextInt();
				
		int idade =  ((anos * 365) + (meses * 30) + (dias * 1));
		
		System.out.println("A sua idade expressa em dias é: " + idade + " dias de vida");
		
		entrada.close();
				
	}

}
