import java.util.Scanner;

public class CalculoIndeceMassaCorporal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("C�LCULO DO �NDICE DE MASSA CORPORAL");
		
		System.out.print("Digite seu peso (em Kg): ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura (em metros): ");
		Double altura = scanner.nextDouble();
		
		Double alturaAoQuadrado = altura * altura;
		
		Double indiceMassaCorporal = peso / alturaAoQuadrado;
		
		System.out.println("Seu IMC �: " + indiceMassaCorporal);
		
		scanner.close();
	}
}
