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

package SegundaExperienciaJava;

import java.util.Scanner;

public class Idade0301 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
      
		int menorIdade21=0, maiorIdade50=0, idade=0;

        while(idade>= 0)
        {
            System.out.printf("Digite uma idade: ");
            idade = leia.nextInt();

            if(idade <21 && idade > 0)
            	
            {
                menorIdade21 += 1;
     }
           
            
            if(idade > 50)
            {
                maiorIdade50 += 1;
            }
        }
        System.out.println("Total de pessoas menores de 21 anos: "+menorIdade21);
        System.out.println("Total de pessoas maiores de 50 anos: "+maiorIdade50);

	}

}


package SegundaExperienciaJava;

import java.util.Scanner;

public class DoWhile5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
        int soma=0,numero;
        System.out.println("Digite um número: ");

        do
     
            {
            numero = leia.nextInt();
                if (numero>0)
                {
                    soma = numero + soma;
                }
            }
        while (numero!= 0);
        System.out.println("\nA soma dos números digitados foi: "+soma);

    }



	}



