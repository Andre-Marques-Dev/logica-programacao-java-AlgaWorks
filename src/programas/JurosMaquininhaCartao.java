package programas;

import java.util.Scanner;

public class JurosMaquininhaCartao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo do pagamento\n [1 = � vista / 2 = a prazo]: ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		if(pagamentoAVista) { // inserir o valor de nega��o, e o c�dico vai executar examente igual estava antes.
			
		}else {
			juros = 10.0;
		}
		
		Double acrescimo = (valorProduto * juros) / 100.0;
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor total: " + valorTotal);		
		scanner.close();
	}

}
