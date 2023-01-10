package POOHERANCA;


public class jogo extends gamee {

	private String nomeJogo; // gtaV
	private String tipo; // ação e aventura
	private String classificacao; //Maior de idade
	private String online; // Psn
	public jogo(String nomeJogador, String nickName, String nomeJogo, String tipo, String classificacao,
			String online) {
		super(nomeJogador, nickName);
		this.nomeJogo = nomeJogo;
		this.tipo = tipo;
		this.classificacao = classificacao;
		this.online = online;
	}
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	
      public void visualizador() {
	} {
	

		
		System.out.println("Você está jogando com " +getNomeJogador());
		
        System.out.println("Seu Jogo é de:  " +getNickName());
        
        System.out.println("Lançamento 2023 ***** Pura Ação e Aventura");
        
        System.out.println( "Para todas as Idades,Você só Encontra na sua Psn!!! ");
        
        
        
        
}



		
	}
