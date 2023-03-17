
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente chico = new Gerente();
		chico.setNome("chico");
		chico.setCpf("06041247520");
		chico.setSalario(2600.00);
		
		System.out.println(chico.getNome());
		System.out.println(chico.getBonificacao());

	}

}
