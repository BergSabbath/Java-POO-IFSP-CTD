/*
Faça um programa Java que calcule e imprima o somatório dos valores 
armazenados em um vetor de 100 elementos.
 */
package exercicio21;
//@author Ludenberg Marques Brito Reis
public class Exercicio21 {

    public static void main(String[] args) {
        
        int vetor[] = new int[100];
        int mult = 3;
        int tot = 0;
        for (int i =0 ; i<100;i++){
            vetor[i]= mult;
            tot += mult;
            /* se quiser exibir na tela os valores:
            System.out.println("vetor["+i+"] = "+mult);*/
            
    //o vetor recebe multiplos de 3
            mult +=3;
        }
        System.out.println("O somatório dos valores contidos no vetor de 100 posições"
                + " com multiplos de 3 é "+tot);
        
    }
    
}
