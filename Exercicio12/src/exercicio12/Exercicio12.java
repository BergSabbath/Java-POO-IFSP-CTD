/*
*Fazer um programa Java para receber um número e verificar se está 
*entre 0 e 100. Se estiver na faixa, imprimir: "Você digitou um número
*entre 0 e 100", Senão estiver na faixa, imprimir:" Você digitou um número
*fora da faixa entre 0 e 100.
 */
package exercicio12;
//@author BergSabbath

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();
        if (num >= 0 && num <= 100){
            System.out.println("Você digitou um número entre 0 e 100");
        }else{
            System.out.println("Você digitou um número fora da faixa de 0 a 100");
        }
        
    }
    
}
