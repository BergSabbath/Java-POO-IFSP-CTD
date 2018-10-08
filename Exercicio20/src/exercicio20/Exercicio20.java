/*
20. Declare um vetor de 10 posições e o preencha automaticamente 
com os 10 primeiros números impares e o escreva.
 */
package exercicio20;
 //@author Ludenberg Marques Brito Reis

public class Exercicio20 {

    public static void main(String[] args) {
        
        int v[] = new int[10];
        int impar = 1;
        
        for (int i = 0 ; i <10; i++){
        v[i] = impar;
         impar += 2;
            System.out.println("A posição v["+i+"] tem o valor " +v[i]);
        }
    }
    
}
