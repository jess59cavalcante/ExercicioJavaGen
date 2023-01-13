package carteira;

public class Pessoa {
	private String nome = "";
	private double metaMensal = 0.0f;
	private double custoKm = 0.2;//Manutenção + combustível + alimentação 
	private int totalDiaTrabalhado = 0;
	private int totalKmPercorrido = 0;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getMetaMensal() {
		return metaMensal;
	}
	
	public void setMetaMensal(double meta) {
		this.metaMensal = meta;
		System.out.printf("\n\t%s, Sua meta de ganho mensal agora é: R$ %.2f\n", nome, meta);
	}
	

	public double getCustoKm() {
		return custoKm;
	}

	public void setCustoKm(double custoKm) {
		this.custoKm = custoKm;
	}

	public int getTotalDiaTrabalhado() {
		return totalDiaTrabalhado;
	}

	public void setTotalDiaTrabalhado(int totalDiaTrabalhado) {
		this.totalDiaTrabalhado = totalDiaTrabalhado;
	}

	public int getTotalKmPercorrido() {
		return totalKmPercorrido;
	}

	public void setTotalKmPercorrido(int totalKmPercorrido) {
		this.totalKmPercorrido = totalKmPercorrido;
	}
	
	
}
