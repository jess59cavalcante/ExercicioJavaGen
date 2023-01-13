package carteira;

public class Menu {
	public void cabecalho(String nome) {
		System.out.printf("\n\t==================== CARTEIRA DO(A) %s ====================\n", nome);
	}
	
	public static void imprimeMenu() {
		System.out.printf("\n\t\t1 - Registrar Meta"
						+ "\n\t\t2 - Carteira"
						+ "\n\t\t3 - Ver Resultado"
						+ "\n\t\t9 - Sair"
						+ "\n\t============================================================="
						);
		System.out.printf("\n\tDigite uma opção: \n\n");
	}
	
	public static void meta(double meta, String nome) {
		System.out.printf("\n\t\tSua meta mensal atual: R$ %.2f"
						+ "\n\t======================================================="
						, meta);
		System.out.printf("\n\t%s, Digite uma meta para sua renda mensal: \n\n", nome);
		
	}
	
	public static void diaria(double saldo, String nome) {
		System.out.printf("\n\t\tSaldo: R$ %.2f"
						+ "\n\n\tDigite:"
						+ "\n\t1 - Registrar diária"
						+ "\n\t2 - Ver extrato"
						+ "\n\t9 - Sair"
						+ "\n\t==========================================================="
						, saldo);
	}
}
