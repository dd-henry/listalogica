
import java.util.Scanner;
//4. Ler um número e verificar se ele é par ou ímpar. 
public class Exercicio4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número para verificar se é Impar ou Par");
    int numero = sc.nextInt();

    /*Quando o numero digitado é dividido por 2,
    se o resto da divisão for 0 ele é par
    caso seja diferente de 0 é impar
     */
    if (numero % 2 == 0){
        System.out.println(numero + " é Par");
    }else if (numero % 2 != 0) {
        System.out.println(numero + " é Impar");
        
    }else{
        System.out.println("Digite um numero inteiro");
    }
    sc.close();
    }   

}