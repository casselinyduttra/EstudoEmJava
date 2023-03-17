
public class TesteTributaveis {

	public static void main(String[] args) {
		
		contaCorrente cc = new contaCorrente(222, 230);
		cc.deposita(100.0);
		
		SeguroVida sv = new SeguroVida();

		CalculadorImpostos ci = new CalculadorImpostos();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());
	}

}
