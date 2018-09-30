//6. Crie um programa Java que, dado um número digitado via teclado, 
//informe se o número é par ou ímpar.

package exercicio06;

import java.util.Scanner;

/**
 *
 * @author Ludenberg Marques Brito Reis
 */
public class Exercicio06 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        int num = entrada.nextInt();
        if (num % 2 == 0){
            System.out.println("O número "+num+" é par");
        }else{
            System.out.println(" O número "+num+" é impar");
        }
    }
    
}
