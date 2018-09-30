/*
10. Escrever um programa que leia o nome de um aluno e as 
notas das três provas que ele obteve no semestre. No final
informar o nome do aluno e a sua média (aritmética).
 */
package exercicio10;
//@author Ludenberg Marques Brito Reis

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Escreva o nome do aluno: ");
        String aluno = entrada.next();
        
        System.out.println("Digite a 1ª nota do aluno:");
        double nota1 = entrada.nextDouble();
        
        System.out.println("Digite a 2ª nota do aluno");
        double nota2 = entrada.nextDouble();
        
        System.out.println("Digite a 3ª nota do aluno");
        double nota3 = entrada.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;// calculo da media aritmetica
        
        System.out.println("----------------------------------");
        System.out.println("Resultado");
        System.out.println("----------------------------------");
        System.out.println("Nome do Aluno: "+ aluno );
        System.out.printf("Sua média é: %.2f \n",media);
        System.out.println("----------------------------------\n");
        

    }
    
}
