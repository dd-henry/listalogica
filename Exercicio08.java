
import java.util.Scanner;
/*8. Fazer um programa que recebe três notas e seus respectivos pesos, 
calcule e mostra a média ponderada dessas notas.  */
public class Exercicio08 {
    public static void main(String[] args) {
                double nota1, nota2, nota3, peso1, peso2, peso3, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota da primeira prova");
        nota1 = sc.nextDouble();
        System.out.println("Agora digite o peso da nota da primeira prova");
        peso1 = sc.nextDouble();
        System.out.println("Digite a nota da segunda prova");
        nota2 = sc.nextDouble();
        System.out.println("Agora digite o peso da nota da segunda prova");
        peso2 = sc.nextDouble();
        System.out.println("Digite a nota da terceira prova");
        nota3 = sc.nextDouble();
        System.out.println("Agora digite o peso da nota da terceira prova");
        peso3 = sc.nextDouble();

        /*
         * formula da media ponderada: 
         *        [EXEMPLO]  (valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3)
         *                  ---------------------------------------------------------------------
         *                                   peso1 + peso2 + peso3
         */
        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        System.out.println("A sua média final é: " + media);
        sc.close();
    }
}
