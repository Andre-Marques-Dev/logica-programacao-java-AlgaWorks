
public class TipoLogico {
	
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Vari�vel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalse = false;
		System.out.println("Vari�vel falsa: " + variavelFalse);
		
		System.out.println("----------------------------");
		
		Integer idade = 20;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		// System.out.println("Pode tirar carteira? " + podeTirarCarteira);
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Voc� pode tirar carteira. ");
		}else {
			System.out.println("Infelimente, voc� n�o pode tirar carteira.");
		}						
	}
}
