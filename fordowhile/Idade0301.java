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
