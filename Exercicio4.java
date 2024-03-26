import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número para verificar se é Impar ou Par");
    int numero = sc.nextInt();

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