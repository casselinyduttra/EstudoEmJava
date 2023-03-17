
public class TestaContas {

	public static void main(String[] args) {
		
		//contaCorrente e contaPoupanca instanciada
		contaCorrente cc = new contaCorrente(111, 111);
		cc.deposita(100.0);
		
		contaPoupanca cp = new contaPoupanca(222, 222);
			cp.deposita(200.0);
		
			//utilizacao do metodo transfere para transferir valores de uma conta para outra.
		cc.transfere(10.0, cp);
		
		System.out.println("cc " + cc.getSaldo());
		System.out.println("cp " + cp.getSaldo());
	}

}
;