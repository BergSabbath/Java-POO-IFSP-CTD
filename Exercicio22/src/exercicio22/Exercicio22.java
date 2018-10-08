/*
Faça um programa Java. Crie um vetor bidimensional (matriz) de 
tamanhho 11x6. Faça uma estrutura de repetição para imprimir 
cada célula com o valor da multiplicação da linha pela coluna. 
Imprima a matriz completa ao final.
 */
package exercicio22;
//@author BergSabbath
 public class Exercicio22 {

    public static void main(String[] args) {
       int v[][] = new int [11][6];
       
       for (int i = 0; i < 11; i++ ){
           for (int j = 0 ; j <6; j++){
            v[i][j]=i*j;   
           }
       }
           for (int i=0;i<11;i++){
               for(int j=0;j<6;j++){
       System.out.println("v["+i+"]["+j+"] = " +v[i][j]);
               }   
           }
    }
    
}
