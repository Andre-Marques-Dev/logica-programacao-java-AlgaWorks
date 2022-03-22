package EstruturasDeDecisao;

import java.util.Scanner;

public class UtilizandoIfEncadeado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = (peso <= 60.0) && (peso > 0);
		Boolean pesoMedia = (peso > 60.0) && (peso <= 90.0);
		Boolean pesoPesado = peso > 90.0;
		
		if(pesoLeve) {
			System.out.println("O lutador é peso leve.");
		}else if(pesoMedia) {
			System.out.println("O lutador é peso médio.");
		}else if(pesoPesado) {
			System.out.println("O lutador é peso pesado.");
		}else {
			System.out.println("O lutador não se encaixa em categoria alguma.");
		}
		
		scanner.close();
		
		}				
	}


