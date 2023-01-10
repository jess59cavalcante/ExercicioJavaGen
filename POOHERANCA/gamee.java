package POOHERANCA;

public class gamee {


	private String NomeJogador;
	private String NickName;
	
	public gamee(String nomeJogador, String nickName) {
		super();
		NomeJogador = nomeJogador;
		NickName = nickName;
	
	}

	public String getNomeJogador() {
		return NomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		NomeJogador = nomeJogador;
	}

	public String getNickName() {
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}
	
	public void imprimirInfo(){
	
	System.out.println("Olá "+getNomeJogador());
	
	System.out.println("Seu NickName: "+getNickName());
	
	
	}
}
