package POO;

public class FuncionarioTeste {

	public static void main (String[] args) {
		
	
	Funcionario candidata = new Funcionario	("Jessica","Dev FullStack Java Pleno",40,"4500");
	

	
	System.out.println("\n***Surpresa para 2023***:  ");
	
	candidata.imprimirInfo();
		
	
	System.out.println("\nNova Função:");
	candidata.setSetorAtuacao("\nDev FullStack Java Senior");
	System.out.println(candidata.getSetorAtuacao());
	
	
	
	System.out.println("\nAlteração de Carga Horária: ");
	candidata.setHorasMensais(44);
	System.out.println(candidata.getHorasMensais());
	
	
			 
	System.out.println("\nAumento Bonificado: ");
	candidata.setSalario("200000");
	System.out.println(candidata.getSalario());
	
	
	candidata.imprimirInfo();
				
		
	}
		
}	
	

