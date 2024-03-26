import javax.swing.JOptionPane;
/*
10. Fazer um programa que calcula e mostra a área de um triângulo, sabendo que: 
Área = (base *altura)/2.
 */

public class Exercicio10 {
    public static void main(String[] args) {
        int Base, Altura;

        Base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triangulo (cm)"));
        Altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triangulo (cm)"));

        JOptionPane.showMessageDialog(null, "A area do triangulo é: " + ((Base * Altura)/2) + "cm", "Calculo da area", 3);
    }
}
