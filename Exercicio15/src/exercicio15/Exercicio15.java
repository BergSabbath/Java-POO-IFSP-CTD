/*
Faça um programa Java que imprima todos os números inteiros de 1 a n, 
sendo n um valor inteiro fornecido pelo usuário.
 */
package exercicio15;
//@author BergSabbath

import java.util.Scanner;


public class Exercicio15 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você quer contar até qual número?");
        int n = entrada.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("numero "+i);   
        }
        
        
    }
    
}
