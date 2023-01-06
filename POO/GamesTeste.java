package POO;

public class GamesTeste {

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
			
			
			loja.imprimirInfo();
	}

}
