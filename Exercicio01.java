
import javax.swing.JOptionPane;

//1. Tendo as variáveis SALARIO, IR e SALLIQ, e considerando os valores abaixo. Informe se as expressões são verdadeiras ou falsas.

public class Exercicio01 {
    public static void main(String[] args) {
        Double Ir, Salario, Salliq, Taxa;

        //a variavel salario recebe o valor através do input JOptionPane
        Salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário"));

        Taxa = 0.05;
        Ir = Salario * Taxa;
        Salliq = Salario - Ir;

        //se o valor do salario for menor ou igual a 100 não é aplicado o imposto de renda
        if (Salario <= 100.0) {
            JOptionPane.showMessageDialog(null, "Seu salário liquido é: " + Salario);
         
        //caso seja maior que 100 é aplicada a taxa de 5%
        } else {
            JOptionPane.showMessageDialog(null, "Seu salário liquido é: " + Salliq);
        }

        /*
         * ----------------------------------------------------------
         * | 1.1) SALARIO = 100,00 __ IR = 0,00 __ SALLIQ = 100,00
         * | Expressão: SALLIQ >= 100,00 (V)
         * |  
         * | 
         * | 1.2) SALARIO = 200,00 __ IR = 10,00 __ SALLIQ = 100,00
         * | Expressão: SALLIQ < 90,00 (F)
         * | 
         * | 
         * | 1.3) SALARIO = 300,00 __ IR = 15,00 __ SALLIQ = 100,00
         * | Expressão: SALLIQ = SALARIO - IR (V)
         * ----------------------------------------------------------
         */

    }
}