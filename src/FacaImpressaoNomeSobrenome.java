import java.util.Scanner;

public class FacaImpressaoNomeSobrenome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Olá " + nome + " " + sobrenome + "!");
		
		scanner.close();
	}


}
