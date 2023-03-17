
public class testeReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Luis");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Leo");
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setNome("Pedro");
		d.setSalario(2500.0);
		
		controleBonificacao controle = new controleBonificacao();
		controle.registra(g1);
		controle.registra(d);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	}
}
