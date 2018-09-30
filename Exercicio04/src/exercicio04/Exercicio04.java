/*Exercicio
*4. Escreva um programa em Java que, dado o raio de um círculo,
* calcule sua área. Calculo: área= PI*(raio²).
*/
package exercicio04;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Ludenberg Marques Brito reis
 */
public class Exercicio04 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio: ");
         int raio = entrada.nextInt();
         double area;
         
         area = PI *(raio*raio);
         System.out.printf("O valor da área é: %.2f \n",area);
        
    }
    
}
