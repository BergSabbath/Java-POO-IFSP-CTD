//Exercicio
//1. Escreva um programa em Java que exiba a soma, a subtração, a multiplicação e a divisão de dois números.
package exercicio01javapoo;

import java.util.Scanner;

/**
 *
 * @author BergSabbath
 */
public class Exercicio01JavaPOO {

    public static void main(String[] args) {
        //declarando as variáveis
        int soma, sub, mult;
       double div;
        Scanner entrada = new Scanner (System.in);
        String resp;
      
        /* comando "do.. while" para que o programa posso ser executado
        *com varias combinações de números*/
        do {
          //comando solicitando 02 numeros ao usuário
        System.out.println("Digite o 1º numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o 2º numero: ");
        int num2 = entrada.nextInt();
        soma = num1 + num2;
        System.out.println("a soma dos dois numeros é: " + soma);
        sub = num1 - num2;
        System.out.println("a subtração dos dois numeros é: "+ sub);
        mult = num1 * num2;
        System.out.println("a multiplicação dos dois numeros é: " + mult);
        div = num1 / num2;
        System.out.println("a divisão dos dois numeros é: " + div);
        System.out.println("Você quer continuar? [s/n]");
        resp = entrada.next();
        }while (resp.equals("s"));
        
    }
    
}
