package programas;

import java.util.Scanner;

public class AlcoolOuGasolina {
	
	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o preço da gasolina: ");
		Double precoGasolina = entrada.nextDouble();
		
		System.out.print("Informe o preço do Álcool ");
		Double precoAlcool = entrada.nextDouble();				
		
		double calculo = (precoAlcool / precoGasolina);
		
		if (calculo >=0.70) {
			System.out.printf("- Neste momento abastecer com gasolina\n é mais"
					+ " vantajoso");
		} else {
			System.out.printf("- Neste momento abastecer com Àlcool\n é mais"
					+ " vantajoso!");
		}		
		entrada.close();
	}
}
