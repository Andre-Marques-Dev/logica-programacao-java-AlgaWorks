package vetores;

public class VetoresMaisDe2Dimensoes {
	
	public static void main(String[] args) {
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {1000.0, 3000.0, 2700.0};

		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro};
		
		Double[][][] faturamentoQuiquenal = new Double[][][] {faturamentoAnual};
		
		
//		for (int i = 0; i < faturamentoAnual.length; i++) {
//			System.out.println("Mês: " + (i + 1));
//			
//			Double[] mes = faturamentoAnual[i];
//			
//			for(int y = 0; y < mes.length; y++) {
//				Double dia = mes[y];
//				System.out.println("Dia: " + (y + 1) + ": "+ dia);
//			}
//		}
		
	}
}