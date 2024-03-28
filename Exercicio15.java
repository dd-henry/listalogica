import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        double horas, salariohora, salarioliquido, salariobruto, imposto;
        Scanner xereta = new Scanner(System.in);

        System.out.println("Digite o numero de horas trabalhadas pelo funcionario:");
        horas = xereta.nextDouble();
        System.out.println("Digite o custo da hora trabalhada pelo funcionario:");
        salariohora = xereta.nextDouble();

        salariobruto = (salariohora * horas);
        imposto = (salariobruto * 0.03);
        salarioliquido = (salariobruto - imposto);


        System.out.println("O funcionario receberá " + salarioliquido + " pelas " + horas + " horas trabalhadas");






        xereta.close();
    }
}
