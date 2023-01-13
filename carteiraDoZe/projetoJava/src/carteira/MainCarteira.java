package carteira;

import java.util.Scanner;

public class MainCarteira {

	public static void main(String[] args) {
		int opcao = 0;
		int dia = 0;
		String nome;
		double meta;
		
		Pessoa motoca = new Pessoa("");
		Menu menu = new Menu();
		Carteira cart = new Carteira();
		
		if(motoca.getNome().equals("")) {
			System.out.printf("\n\tDigite seu nome: ");
			motoca.setNome(lerNextLine());
		}
		nome = motoca.getNome();
		
		do {
			menu.cabecalho(nome);
			menu.imprimeMenu();
			opcao = lerNextLine(0);
			
			if(opcao == 1) {
				menu.cabecalho(nome);
				menu.meta(motoca.getMetaMensal(), nome);
				motoca.setMetaMensal(lerNextLine(0.1));
				
				while(opcao != 0) {
					System.out.printf("\n\tDigite 9 para sair: \n\n");
					opcao = lerNextLine(0);
					
					if(opcao == 9)
						opcao = 0;
					else if(opcao == 0)
						opcao = 1;
				}
			
			}
			else if(opcao == 2) {
				while(opcao != 0) {
					menu.cabecalho(nome);
					menu.diaria(cart.getSaldoTotal(), nome);
					
					double[] media = cart.getSaldo();
					System.out.printf("\n\t%s, seu saldo atual é de: R$ %.2f\n",nome, cart.getSaldoTotal());
				
					opcao = lerNextLine(0);
					if(opcao == 1) {
						System.out.printf("\n\t%s, digite o dia: ", nome);
						dia = lerNextLine(0);
						System.out.printf("\t%s, digite o total ganho do dia: ", nome);
						cart.setSaldo(lerNextLine(0.0f),(dia - 1));
						System.out.printf("\t%s, digite o km percorrido no dia: ", nome);
						cart.setKm(lerNextLine(0),(dia - 1));
						
						while(opcao != 8) {
							System.out.printf("\n\n\tDigite 9 para sair: \n\n");
							opcao = lerNextLine(0);
							
							if(opcao == 9)
								opcao = 8;
							else if(opcao == 8)
								opcao = 1;
						}
					}
					else if(opcao == 2) {
						double[] vetorSaldo = cart.getSaldo();
						for(int i = 0; i < vetorSaldo.length; i++) {
							String zero = "";
							if(i < 9)
								zero ="0";
							else
								zero ="";
							System.out.printf("\tDia %s%d: %.2f", zero, i + 1, vetorSaldo[i]);
							if((i + 1) % 5 == 0)
								System.out.printf("\n");
							
							
						}
						while(opcao != 8) {
							System.out.printf("\n\n\tDigite 9 para sair: \n\n");
							opcao = lerNextLine(0);
							
							if(opcao == 9)
								opcao = 8;
							else if(opcao == 8)
								opcao = 1;
						}
					}
										
					if(opcao == 9)
						opcao = 0;
					else if(opcao == 0)
						opcao = 1;
				}
			}
			else if(opcao == 3) {
				if(motoca.getMetaMensal() <= 0)
					meta = 0;
				else
					meta = (cart.getSaldoTotal() - cart.getKmTotal() * motoca.getCustoKm()) / motoca.getMetaMensal() * 100;
					double ganhoLiquido = cart.getSaldoTotal() - cart.getKmTotal() * motoca.getCustoKm();
				
				System.out.printf("\n\tResultado: \n");
				System.out.printf("\n\t* Ganho total: R$ %.2f", cart.getSaldoTotal());
				System.out.printf("\t* Dias trabalhados: %d", cart.totalDia());
				System.out.printf("\t\t* Ganho por dia (média): R$ %.2f", cart.getSaldoTotal() / cart.totalDia());
				System.out.printf("\n\t* Custo total: R$ %.2f", cart.getKmTotal() * motoca.getCustoKm());
				System.out.printf("\t* Km percorrido: %.2f", cart.getKmTotal());
				System.out.printf("\t* Ganho por km (média): R$ %.2f", cart.getSaldoTotal() / cart.getKmTotal());
				System.out.printf("\n\t* Custo operacional: %.2f%%",cart.getKmTotal() * motoca.getCustoKm() * 100 /cart.getSaldoTotal());
				System.out.printf("\t* Km por dia (média): %.2f", cart.getKmTotal() / cart.totalDia());
				System.out.printf("\n\t* Ganho líquido: R$ %.2f", cart.getSaldoTotal() - cart.getKmTotal() * motoca.getCustoKm());
				
				if(motoca.getMetaMensal() > 0) {
					System.out.printf("\n\n\t%s, você atingiu %.2f%% da sua meta.", nome, meta);
					if(ganhoLiquido < motoca.getMetaMensal())
						System.out.printf("\n\tPrecisa faturar +/- R$ %.2f para "
							+ "a tingir o ganho líquido de R$ %.2f", 
							(motoca.getMetaMensal() - ganhoLiquido) * (cart.getSaldoTotal() / ganhoLiquido), motoca.getMetaMensal());
				}else
					System.out.printf("\n\n\tVocê ainda não registrou sua meta");
				
				//meta = cart.getSaldoTotal() / motoca.getMetaMensal() * 100;
				if(meta <= 99)
					System.out.printf("\n\n\t**** Sai do NetFlix e vai trabalhar! ****");
				else if(meta == 100)
					System.out.printf("\n\n\t**** Parabéns, você atingiu a meta do mês!!! ****");
				else
					System.out.printf("\n\n\t**** Assim você vai ficar rico Zé! ****");
				
				while(opcao != 8) {
					System.out.printf("\n\n\tDigite 9 para sair: \n\n");
					opcao = lerNextLine(0);
					
					if(opcao == 9)
						opcao = 8;
					else if(opcao == 8)
						opcao = 1;
				}						
			}
		}while(opcao != 9);
		System.out.println("\n\t\t********** CARTEIRA FECHADA **********\n\n");
		
	}
	
	private static String lerNextLine() {
		Scanner ler = new Scanner(System.in);
		return ler.nextLine();
	}
	
	private static int lerNextLine(int n) {
		Scanner ler = new Scanner(System.in);
		return ler.nextInt();
	}
	
	private static double lerNextLine(double n) {
		Scanner ler = new Scanner(System.in);
		return ler.nextDouble();
	}
	
}
