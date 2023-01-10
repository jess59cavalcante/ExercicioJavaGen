package POOHERANCA;

public class heranca3em1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

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
		
		////jogo
		
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
			} 
		      {

				
				System.out.println("Você está jogando com " +getNomeJogador());
				
		        System.out.println("Seu Jogo é de:  " +getNickName());
		        
		        System.out.println("Lançamento 2023 ***** Pura Ação e Aventura");
		        
		        System.out.println( "Para todas as Idades,Você só Encontra na sua Psn!!! ");
		        
		}
			}		        
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
	
	public class TestaGame {

		public static void main(String[] args) {
			
			gamee nome = new gamee("Jessica","Harpia");
			nome.imprimirInfo();
			jogo midia = new jogo("GtaV", "Ação e Aventura","Maior de Idade", "PSN", " "," ");
			midia.visualizador();
		
				
		}
			
	}
	
			

			
