
public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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
