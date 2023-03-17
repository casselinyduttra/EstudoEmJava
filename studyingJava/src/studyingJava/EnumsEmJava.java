package studyingJava;

public class EnumsEmJava {

	public static void main(String[] args) {
		
		Thread t = new Thread(() -> System.out.println("Rodando...."));
		
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
	}
}	

/*
 *As enums são uma forma orientada 
 *a objetos de lidar com os constantes.
 *Ou seja, definir constantes, valores fixos
 **/
 