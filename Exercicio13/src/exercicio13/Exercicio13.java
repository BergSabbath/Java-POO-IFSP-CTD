/*
 Faça um programa Java que receba três notas, calcule e mostre a média 
aritmética entre elas. Caso a media aritmética seja maior ou igual 
a 6 imprima uma mensagem dizendo que o aluno está aprovado, 
caso a média seja inferior a 6, imprima uma mensagem dizendo 
que o aluno está reprovado.
 */
package exercicio13;
//@author Ludenberg Marques Brito Reis

import java.util.Scanner;

 public class Exercicio13 {

     public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a 1ª nota:");
        double n1 = entrada.nextInt();
        System.out.println("Digite a 2ª nota:");
        double n2 = entrada.nextInt();
        System.out.println("Digite a 3ª nota:");
        double n3 = entrada.nextInt();
        double media = (n1+n2+n3)/3;
        
         System.out.printf("A média do aluno é %.2f\n",media);
         if (media >= 6){
             System.out.println("O aluno está aprovado!!!");
         }else{
             System.out.println("O aluno está reprovado");
         }
            
        
             
    }
    
}
