package POOHERANCA;

public class console extends gamee {

	private String videoGame;//playStation5
	private String processador; //AMD Ryzen
	private String acessorios; // cooler resfriador
	private String controle;// analogico
	public console(String nomeJogador, String nickName, String videoGame, String processador, String acessorios,
			String controle) {
		super(nomeJogador, nickName);
		this.videoGame = videoGame;
		this.processador = processador;
		this.acessorios = acessorios;
		this.controle = controle;
	}
	public String getVideoGame() {
		return videoGame;
	}
	public void setVideoGame(String videoGame) {
		this.videoGame = videoGame;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public String getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	public String getControle() {
		return controle;
	}
	public void setControle(String controle) {
		this.controle = controle;
	}
	
	
	public void visualizador() {
		
		
		System.out.println("Você está jogando com " +getNomeJogador());
		
        System.out.println("Codinome: " +getNickName());
        
        System.out.println("O melhor aparelho de todos os tempos " +getVideoGame()+ "e processador de ultima geração" +getProcessador());
        
        System.out.println( "Acompanha Cooler resfriador" +getAcessorios()+ "e controle "+getControle());
       
        
}
        
        

	
	
}

		
	
	
	
	