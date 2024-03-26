package logica;

import javax.swing.JOptionPane;

public class Exercicio1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Double Ir, Salario, Salliq, Taxa;

        Salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário"));

        Taxa = 0.05;
        Ir = Salario * Taxa;
        Salliq = Salario - Ir;

        if (Salario <= 100.0) {
            JOptionPane.showMessageDialog(null, "Seu salário liquido é: " + Salario);

        } else {
            JOptionPane.showMessageDialog(null, "Seu salário liquido é: " + Salliq);
        }

        /*
         * 
         * 1.1) SALARIO = 100,00 __ IR = 0,00 __ SALLIQ = 100,00
         * Expressão: SALLIQ >= 100,00 (V)
         * 
         * 
         * 1.2) SALARIO = 200,00 __ IR = 10,00 __ SALLIQ = 100,00
         * Expressão: SALLIQ < 90,00 (F)
         * 
         * 
         * 1.3) SALARIO = 300,00 __ IR = 15,00 __ SALLIQ = 100,00
         * Expressão: SALLIQ = SALARIO - IR (V)
         * 
         */

    }
}