/*
*17. Escreva um programa Java que, dado a idade de uma pessoa, imprima 
*uma mensagem informando se essa pessoa é uma criança (abaixo de 12 anos), 
*adolescente (entre 12 e 17 anos), adulto (entre 18 e 60 anos) ou idoso 
*(maior de 60 anos).
 */
package exercicio17;

//@author Ludenberg Marques Brito Reis
import java.util.Scanner;

 
public class Exercicio17 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = entrada.nextInt();
        if (idade <12){
            System.out.printf("Você tem %d anos, é uma criança! \n", idade);
        }else if(idade >=12 && idade<=17){
            System.out.printf("Você tem %d anos, é um adolescente! \n",idade);
        }else if (idade >=18 && idade <=60){
            System.out.printf("Você tem %d anos, é um adulto! \n", idade);
        }else{
        System.out.printf("Você tem %d anos, é um idoso\n", idade);
        }
    }
    
}
