
import java.util.Scanner;

/*7. Fazer um programa que recebe três notas, calcula e mostra a média aritmética dessas notas.  */

public class Exercicio7 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota da primeira prova");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota da segunda prova");
        nota2 = sc.nextDouble();
        System.out.println("Digite a nota da terceira prova");
        nota3 = sc.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A sua média final é: " + media);
        sc.close();
        
    }
}
