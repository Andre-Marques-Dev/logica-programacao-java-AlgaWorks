package programas;

import java.util.Scanner;

public class AlcoolOuGasolina {
	
	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o pre�o da gasolina: ");
		Double precoGasolina = entrada.nextDouble();
		
		System.out.print("Informe o pre�o do �lcool ");
		Double precoAlcool = entrada.nextDouble();				
		
		double calculo = (precoAlcool / precoGasolina);
		
		if (calculo >=0.70) {
			System.out.printf("- Neste momento abastecer com gasolina\n � mais"
					+ " vantajoso");
		} else {
			System.out.printf("- Neste momento abastecer com �lcool\n � mais"
					+ " vantajoso!");
		}		
		entrada.close();
	}
}
