import java.util.Scanner;

public class TipoTexto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Ol� " + nome + "!");
		
		scanner.close();
		
		Character variavelChar = 'A';
		System.out.println(variavelChar);
	}

}
