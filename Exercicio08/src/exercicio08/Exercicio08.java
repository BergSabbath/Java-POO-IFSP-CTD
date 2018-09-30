/*
 Crie um programa Java para determinar o consumo médio de um automóvel
sendo fornecida a distância total percorrida pelo automóvel 
e o total de combustível gasto
 */
package exercicio08;
//@author Ludenberg Marques Brito Reis

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a distância percorrida em Kilometros: ");
        double dist = entrada.nextDouble();
        System.out.println("Qual o total de combustivel gasto em litros: ");
        double comb = entrada.nextDouble();
        
        double  consMedio = dist / comb;
        
        System.out.printf("O consumo médio foi de %.2f km/l \n",consMedio);
               
    }
    
}
