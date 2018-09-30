/*
 * 5. Escreva um programa em Java que, dada a equação do segundo grau, 
 * encontre os possíveis valores para x.
 */
package exercicio05;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Ludenberg Marques Brito Reis
 */
public class Exercicio05 {

    public static void main(String[] args) {
        
        System.out.println("Dada a equação do 2º grau a.X² + b.X + c = 0.");
        System.out.println("Digite os valores de a, b e c para saber os possiveis valores de \"X\":");
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de \"a\": ");//x = – b ± √Δ
      //                                                        2·a
        int a = entrada.nextInt();
        System.out.print("Digite o valor de \"b\": ");
        int b = entrada.nextInt();
        System.out.print("Digite o valor de \"c\": ");
        int c = entrada.nextInt();
        
        System.out.println(a+".X² + "+b+".X + "+c+" = 0");
        double delta =  Math.pow(b,2) -4 * (a * c);
        System.out.println("Delta será igual a "+delta);
        if (delta < 0){
            System.out.println("Não existem raízes nos numeros reais para esta equação");
        }else{
       
            double x1 = (-b + sqrt(delta))/(2*a);
            double x2 = (-b - sqrt(delta))/(2*a);
            System.out.printf("As raízes são: \"x1\"= %.2f e \"x2\" = %.2f \n",x1,x2);
        }
      
    }
    
}
