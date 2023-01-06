
package POO;

public class Funcionario {

		
			private String funcionarioContratar;
			private String setorAtuacao;
			private int horasMensais ;
			private String salario;


			public Funcionario(String funcionarioContratar, String setorAtuacao, int horasMensais,String salario) {
				super();
				this.funcionarioContratar = funcionarioContratar;
				this.setorAtuacao = setorAtuacao;
				this.horasMensais = horasMensais;
				this.salario = salario;
			
			}


			public String getFuncionarioContratar() {
				return funcionarioContratar;
			}


			public void setFuncionarioContratar(String funcionarioContratar) {
				this.funcionarioContratar = funcionarioContratar;
			}


			public String getSetorAtuacao() {
				return setorAtuacao;
			}


			public void setSetorAtuacao(String setorAtuacao) {
				this.setorAtuacao = setorAtuacao;
			}


			public int getHorasMensais() {
				return horasMensais;
			}


			public void setHorasMensais(int horasMensais) {
				this.horasMensais = horasMensais;
			}


			public String getSalario() {
				return salario;
			}


			public void setSalario(String salario) {
				this.salario = salario;
			
			}
			
			public void imprimirInfo(){
			
		
				System.out.println("\nCandidata: "+funcionarioContratar+"\n Função: "+setorAtuacao+"\n Carga Horaria: "+horasMensais+"\n Remuneracao: "+salario+"");
				
			
				{

	
		
	
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
				

	private String vendas;
	private String Consoles;
	private String Controle;
	private String Acessorios;
	private String Vendedor="Jessica";
	
	
	public GAMES(String vendas, String consoles, String controle, String acessorios, String vendedor) {
		super();
		this.vendas = vendas;
		Consoles = consoles;
		Controle = controle;
		Acessorios = acessorios;
		Vendedor = vendedor;
	}


	public GAMES(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
	}


	public String getVendas() {
		return vendas;
	}


	public void setVendas(String vendas) {
		this.vendas = vendas;
	}


	public String getConsoles() {
		return Consoles;
	}


	public void setConsoles(String consoles) {
		Consoles = consoles;
	}


	public String getControle() {
		return Controle;
	}


	public void setControle(String controle) {
		Controle = controle;
	}


	public String getAcessorios() {
		return Acessorios;
	}


	public void setAcessorios(String acessorios) {
		Acessorios = acessorios;
	}


	public String getVendedor() {
		return Vendedor;
	}


	public void setVendedor(String vendedor) {
		Vendedor = vendedor;
	}
	
	public void imprimirInfo() {

System.out.println("\nTudo Para a Sua Arena: "+vendas+"\n Os Melhores VideoGames: "+Consoles+"\n Controles originais dos melhores videoGame: "+Controle+"\n Mesas e suportes para seu console: "+Acessorios+"\nMelhor vendedor do Mês: "+Vendedor+"");

	

	


	public static void main(String[] args) {
		 GAMES loja = new GAMES	("\nCompre os melhores produtos","\nEscolha seu Console","\n Os originais é aqui","\nTodos Os tamanhos","\nGanhe um Brinde,se comprar com o Juarez!!");
		 
		 System.out.println("\n***Novidades 2023***:  ");
			
			loja.imprimirInfo();
				
			
			System.out.println("\n Venha conhecer:");
			loja.setVendas("\nPs5 disponivel");
			System.out.println(loja.getVendas());
			
			
			
			System.out.println("\nTodas as Marcas: ");
			loja.setConsoles("Controles e capinhas");
			System.out.println(loja.getConsoles());
			
			
			
					 
			System.out.println("\nGanhe Desconto: ");
			loja.setControle("Cooler e jogos");
			System.out.println(loja.getControle());
			
			
			System.out.println("\nFones de ouvido: ");
			loja.setAcessorios("HeadSet Todas as marcas");
			System.out.println(loja.getAcessorios());
			
			System.out.println("\nO Melhor Atendimento: ");
			loja.setVendedor("Fale com ele");
			System.out.println(loja.getVendedor());
	}
}
			