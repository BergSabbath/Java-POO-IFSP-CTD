/*
Escrever um programa que leia o nome de um vendedor,o seu salário fixo e o 
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu 
nome, o salário fixo e salário no final do mês.
 */
package exercicio09;
//@author Ludenberg Marques Brito Reis

import java.util.Scanner;

 public class Exercicio09 {
     
     
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o nome do vendedor:");
        String nome = entrada.nextLine();
        System.out.println("Qual o valor do seu salário fixo:");
        Double salMen = entrada.nextDouble();
        System.out.println("Qual foi o total de vendas efetuadas no mês");
        int vend = entrada.nextInt();
        double comissao = salMen *  0.15;//calculo da comissão por venda, 15% do salario por venda realizada
        double salFin = salMen + vend * comissao;// salário final = salario mensal + as comissões por venda
        System.out.println("----------------------------------");
        System.out.println("Resultado");
        System.out.println("----------------------------------");
        System.out.println("Nome do vendedor: "+ nome );
        System.out.printf("Salário fixo: %.2f \n",salMen);
        System.out.println("Numero de vendas no mês: " +vend);
        System.out.printf("Salário ao final do mês: %.2f \n", salFin);
        System.out.println("----------------------------------\n");
    }
    
}
