import javax.swing.JOptionPane;


public class Exercicio11 {
/*
 * 11. Fazer um programa que calcula e mostra a área de um círculo, sabendo que: 
 *  Área = pi * R2
*/
    public static void main(String[] args) {
        double diameter, radius, a;
        String[] valores = {"diametro", "raio"};
        int tipo = JOptionPane.showOptionDialog(null, "Qual valor do circulo deseja inserir?", "Area do circulo", 0, 3, null, valores, valores[0]);
        if (tipo == 0) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do diametro"));
            a = Math.PI * Math.pow((diameter/2), 2); 
            JOptionPane.showMessageDialog(null, "A area do circulo é de: " + a + "cm");
        }else{
            radius = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio"));
            a = Math.PI * Math.pow(radius, 2); 
            JOptionPane.showMessageDialog(null, "A area do circulo é de: " + a + "cm");
        }
    }
}
