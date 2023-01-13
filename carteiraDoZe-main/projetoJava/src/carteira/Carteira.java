package carteira;

public class Carteira {
	private double[] saldo =
//           0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30
			{150,100,200,180,120,170,0,100,200,200,150,0,100,100,100,200,200,150,0,200,180,250,150,199,200, 0, 100, 150, 200, 200, 200};
//           1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31
	private double saldoTotal = 0.0f;
	
	private int[] km =
//           0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30
			{100,100,100,100,100,120,150,0,100,200,150,250,200,140,0,120,40,50,30,40,80, 0,100,30,50,40,30,60, 0,40,45};
	private int kmTotal = 0;

	public double[] getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo, int linha) {
		this.saldo[linha] = saldo;
	}
	
	public double getSaldoTotal() {
		saldoTotal = 0;
		for(int linha = 0; linha < saldo.length; linha++) {
			this.saldoTotal += saldo[linha];
		}
		
		return saldoTotal;
	}
	
	public int[] getKm() {
		return km;
	}

	public void setKm(int km, int linha) {
		this.km[linha] = km;
	}

	public double getKmTotal() {
		kmTotal = 0;
		for(int linha = 0; linha < km.length; linha++) {
			this.kmTotal += km[linha];
		}
		return kmTotal;
	}
	
	public int totalDia() {
		int contador = 0;
		for(int linha = 0; linha < saldo.length; linha++) {
			if(saldo[linha] != 0)
				contador++;
		}
		return contador;
	}

}
