package SegundaExperienciaJava;

import java.util.Scanner;

public class Diatres {

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
			int num,contPar=0,contImpar=0,x;
			
		
		for (x=1;x<=10;x++) {
			System.out.println("\nEscolha um numero Aleatorio: ");
			num = leia.nextInt();
			
			if(num %2==0) {
				contPar++;
			
			}
			
			else 
			{
				contImpar++;
			
	}
		
}
			System.out.println("\n A quantidade de numero par foi: "+contPar);
			System.out.println("\n A quantidade de numero impar foi: "+contImpar);
	}
	
}

