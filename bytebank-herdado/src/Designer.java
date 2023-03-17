
public class Designer extends Funcionario{
	
	public double getBonificacao() {
		return 200;
	}

	@Override
	protected boolean autetica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
