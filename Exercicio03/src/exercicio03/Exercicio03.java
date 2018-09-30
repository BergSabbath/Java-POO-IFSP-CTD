/* exercicio
 * 3. Escreva um programa em Java que eleve ao quadrado o valor de uma variável e exiba o resultado.
 */
package exercicio03;

//import static java.lang.Math.pow;// para ser usada no 2º opção
import java.util.Scanner;

/**
 *
 * @author Ludenberg marques Brito reis
 */
public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num =  entrada.nextInt();
        int Quad;
        Quad = num * num;
        System.out.println("O número "+num+" ao quadrado é igual a "+Quad);
        
        //OU o programa tbm pode ser escrito desse outra forma (2º opção)
        
        /* tem que habilitar a biblioteca "import static java.lang.Math.pow"; 
        System.out.println("Digite um numero: ");
        int num =  entrada.nextInt();
        double Quad;
        Quad = pow(num,2);
        System.out.println("O número "+num+" ao quadrado é igual a "+Quad);*/
        
        
    
    }
    
}
