package programas;

import java.util.Scanner;

public class CardapioPizzaria {
	
	public static void main(String[] args) {
		
	
	String[] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto"};
	
	System.out.println("Escolha o sabor: ");
	
	for(int i = 0; i < cardapio.length; i++) {
		System.out.println("[" + i + "]" + cardapio[i]);
		
	}
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite o n?mero referente ao sabor: ");
	Integer saborEscolhido = scanner.nextInt();
	
	System.out.println("Voc? escolheu o sabor: " + cardapio[saborEscolhido]);
	
	scanner.close();

  }	
}
