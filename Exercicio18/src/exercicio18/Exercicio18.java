/*
18. Faça um programa Java com um vetor de 10 posições e preencha o vetor. 
Dado um valor X digitado pelo usuário, procure o valor no vetor e retorne 
a posição onde o valor está, ou, caso não seja encontrado, informe “Valor não encontrado”.
 */
package exercicio18;
//@author Ludenberg Marques Brito Reis

import java.util.Scanner;

 public class Exercicio18 {

    public static void main(String[] args) {    
        
        Scanner entrada = new Scanner(System.in);
          
        int v[]= {10,7,3,1,5,2,4,6,9,8};
        
        System.out.println("Digite um valor de 1 a 10: ");
        int num = entrada.nextInt();
        
        for (int i=0;i<10;i++){
            if (v[i]==num){
                System.out.println(" O valor "+num+" foi encontrado na posição v["+i+"]");
            }
        }
        if (v[0]!= num && v[1]!= num && v[2]!=num && v[3]!=num && v[4]!=num && v[5]!=num && v[6]!=num && v[7]!=num && v[8]!=num && v[9]!=num ) {
            System.out.println("Valor não encontrado");
        }
        
        //Outra forma é utilizando o switch(porém, muito maior o codigo)
        /*switch (num){
            case 1:
                 System.out.println("Este valor está na posição v[3]");
                 break;
            case 2:
                System.out.println("Este valor está na posição v[5]");
                break;
            case 3:
                System.out.println("Este valor está na posição v[2]");
                break;
            case 4:
                System.out.println("Este valor está na posição v[6]");
                break;
            case 5:
                System.out.println("Este valor está na posição v[4]");
                break;
            case 6:
                System.out.println("Este valor está na posição v[7]");
                break;
            case 7:
                System.out.println("Este valor está na posição v[1]");
                break;
            case 8:
                System.out.println("Este valor está na posição v[9]");
                break;
            case 9:
                System.out.println("Este valor está na posição v[8]");
                break;
            case 10:
                System.out.println("Este valor está na posição v[0]");
                break;
            default:
                 System.out.println("Este valor não foi encontrado, pois existem "
                         + "apenas valores de 1 a 10.");   
        }*/
       
    }
    
}
