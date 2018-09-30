/*
 16. Escreva um programa Java que leia um conjunto de 20 números inteiros e 
mostre qual foi o maior e o menor valor fornecido.
 */
package exercicio16;
 //@author Ludenberg Marques Brito Reis
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num, maior = -99999999, menor= 99999999;
       
        for (int i = 1; i<=20;i++){
        System.out.println("Escreva o "+i+"º número:");
            num = entrada.nextInt();
            
            if (num>= maior){
            maior = num;
            }
            if (num <= menor){
            menor= num;
            }
        }
        System.out.println("O maior numero digitado foi "+ maior);
        System.out.println("O menor numero digitado foi "+ menor);
        
    }
    
}
