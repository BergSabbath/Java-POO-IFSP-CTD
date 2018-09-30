/*
*Elaborar um programa Java que efetue a apresentação do valor da conversão 
*em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar
*o valor da cotação do dólar e também a quantidade de dólares 
*disponíveis com o usuário.
 */
package exercicio11;

//@author Ludenberg Marques Brito Reis

import java.util.Scanner;


public class Exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        System.out.println("=======================");
        System.out.println(" Conversor de valores  ");
        System.out.println("=======================");
        System.out.println("Qual o valor da cotação do dolar (US$):");
        double cotacao = entrada.nextDouble();
        System.out.println("Quantos dolares você tem disponível?");
        double valor = entrada.nextDouble();
        
        double reais = valor*cotacao;
        
        System.out.printf("\nVocê possui %.2f reais no total \n",reais);
    }
    
}
