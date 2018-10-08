/*
19. Faça um programa Java com um vetor de 15 posições. 
Dado dois valores X e Y digitados pelo usuário (entre 0 e 14),
faça a soma dos elementos que estão nas respectivas posições X e Y do vetor
e imprima os valores e a soma.
 */
package exercicio19;
//@author Ludenberg Marques Brito reis 

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        
        int v[]={19,29,3,5,37,1,2,8,9,4,6,11,41,10,15};
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite o 1º valor de 0 a 14");
        int num1 = entrada.nextInt();
        System.out.println("Digite o 2º valor de 0 a 14");
        int num2 = entrada.nextInt();
       
       int total = v[num1]+ v[num2];
        System.out.println("O valor de v["+num1+"] é "+v[num1]);
        System.out.println("O valor de v["+num2+"] é "+v[num2]);
        System.out.println("A soma entre os valores contidos nos vetores v["+num1+""
                + "]e v["+num2+"] é igual a "+total);
       
    }
    
}
