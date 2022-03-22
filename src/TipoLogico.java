
public class TipoLogico {
	
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalse = false;
		System.out.println("Variável falsa: " + variavelFalse);
		
		System.out.println("----------------------------");
		
		Integer idade = 20;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		// System.out.println("Pode tirar carteira? " + podeTirarCarteira);
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Você pode tirar carteira. ");
		}else {
			System.out.println("Infelimente, você não pode tirar carteira.");
		}						
	}
}
