
import javax.swing.JOptionPane;
/*6. Fazer um programa que recebe três números inteiros, calcula e mostra a soma desses 
números.
*/
public class Exercicio6 {
    public static void main(String[] args) {
        int NumeroUm, NumeroDois, NumeroTres;
        NumeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        NumeroDois = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        NumeroTres = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));
        JOptionPane.showMessageDialog(null, NumeroUm + " + " + NumeroDois + " + " + NumeroTres + " = " + (NumeroDois + NumeroTres + NumeroUm));
    }
}
