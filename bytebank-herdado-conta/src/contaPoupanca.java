
public class contaPoupanca extends Conta {

	public contaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}

//criação do constutor da classe contaCorrente, 
//repassando os parametros para a classe mae atraves do super();