import java.util.Scanner;

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = entrada.nextDouble();
		
		System.out.print("Digite a quantidade passada pelo cliente: ");
		Double valorPassadoPeloCliente = entrada.nextDouble();
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		System.out.println("Troco: " + resultado);
		
		entrada.close();
	}

}
	