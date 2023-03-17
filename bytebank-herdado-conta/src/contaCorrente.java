
public class contaCorrente extends Conta implements Tributavel{

		public contaCorrente(int agencia, int numero){
			super(agencia, numero); //chamada do construtor da classe mae
		}
		
		@Override //anotacao na configuracao do codigo java, essa anotacao é para o compilador
		public boolean saca(double valor) {
		double valorSacar = valor + 0.20;
		return super.saca(valorSacar);
		}

		@Override
		public void deposita(double valor) {
			super.saldo += valor;
		}

		@Override
		public double getValorImposto() {
			return super.saldo * 0.01;
		}
}

// criação do constutor da classe contaCorrente, 
//repassando os parametros para a classe mae atraves do super(); 