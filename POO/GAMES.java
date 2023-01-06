package POO;

public class GAMES {

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

	
	}
}
	
	
