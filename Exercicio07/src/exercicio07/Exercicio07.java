/*
 *7. Crie um programa Java que, dado um número digitado via teclado, 
informe se o número é ou não um número primo. 
(Números primos são os números naturais que têm apenas dois divisores diferentes: o 1 e ele mesmo).
 */
package exercicio07;

import java.util.Scanner;

/**
 * @author Ludenberg Marques Brito Reis
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        int somaPrimo = 0;
        for (int i = 1; i<=num; i++){
            if (num % i == 0){
                somaPrimo += 1;
            }
        }
        if(somaPrimo == 2){
           System.out.println(num + " - é um numero primo");
        }else{
            System.out.println(num +" - Não é um numero primo");
        }
    }
    
}
