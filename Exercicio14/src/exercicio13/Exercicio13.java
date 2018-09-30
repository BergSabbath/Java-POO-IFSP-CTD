/*
exercicio 14 
Faça um programa Java que calcule e imprima as tabuadas de 1 a 10.
 */
package exercicio13;

import java.util.Scanner;
//@author Ludenberg Marques Brito Reis
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //O problema foi feito de 02 formas:
        
        //1ª forma:
        
        int total;
        String resp;
        do{
            System.out.println("Qual a tabuada vc quer saber?");
              int num = entrada.nextInt();
        for (int i = 1; i<= 10 ;i++){
           total = num * i;
            System.out.println(num + " x "+i+" = "+total);
        }
            System.out.println("Quer saber outra tabuada? Digite \"s\" para continuar ou qualquer outra tecla para sair.");
            resp = entrada.next();
        }while(resp.equals("s"));
        System.out.println("Até a próxima!!");
        
        //2ª forma:
        
        /*System.out.println("qual a tabuada vc quer saber?");
        int num = entrada.nextInt();
        int mul =1;
        while(mul<=10 ){
            int total = num * mul;
            System.out.println(num +" x "+ mul+" = "+total);
            mul++;
            
        }*/
    }
    
}
