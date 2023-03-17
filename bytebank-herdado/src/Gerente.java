
//gerente é um funcionario ou gerente herda da classe funcionario assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do GERENTE");
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	protected boolean autetica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
