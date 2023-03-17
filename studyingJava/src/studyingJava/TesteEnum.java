package studyingJava;

public class TesteEnum {

	public static void main(String[] args) {
		//prioridade é uma classe
		//min e max sao objetos dessa class
		
		PrioridadeEnum pMi = PrioridadeEnum.MIN;
		PrioridadeEnum pNor = PrioridadeEnum.NORMAL;
		PrioridadeEnum pMax = PrioridadeEnum.MAX;
		
		System.out.println(pMi.name()); // imprimi o nome do objeto na classe prioridade
		System.out.println(pMax.name());

		System.out.println(pMi.ordinal());
		System.out.println(pMax.ordinal());

		System.out.println(pMi.getValor());
		System.out.println(pMax.getValor());
		System.out.println(pNor.getValor());
		

	}

}
