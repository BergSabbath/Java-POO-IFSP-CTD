/*Exercicio
*2. Escreva um programa em Java que, dadas duas variáveis, a e b, sendo que a = 5 e b = 9, 
*troque e exiba os valores de a e b, ou seja, a deverá a valer 9 e b deverá valer 5.*/

package exercicio02;
/**
 *
 * @author Ludenberg Marques Brito Reis
 */
public class Exercicio02 {
    public static void main(String[] args) {
        
        int a = 5, b = 9, aux;
        System.out.println("As variáveis a = "+ a+ " e b = "+b);
        //com o auxilio de uma variavel auxiliar.. os valores são trocados
        aux = a; 
        a = b;
        b = aux;
        System.out.println("agora estarão com valores trocados. ");
        System.out.println("o valor de a será: ");
        System.out.println(a);
        System.out.println("O valor de b será: ");
        System.out.println(b);
        
    }
    
}
