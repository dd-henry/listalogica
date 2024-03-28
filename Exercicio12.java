import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double numero, quadrado, cubo, raiz;
        Scanner xereta = new Scanner(System.in);
        System.out.println("Digite um numero positivo:");
        numero = xereta.nextDouble();

        quadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);
        raiz = Math.sqrt(numero);

        if (numero >= 0) {
            System.out.println(numero + " ao quadrado = " + quadrado);
            System.out.println(numero + " ao cubo = " + cubo);
            System.out.println("raiz de " + numero + " = " + raiz);
        }else{
            System.out.println("Digite um numero positivo");
        }

        
        xereta.close();

    }
}
