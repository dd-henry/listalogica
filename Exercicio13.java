import javax.swing.JOptionPane;

public class Exercicio13 {
    public static void main(String[] args) {
        double pnumero, snumero, potencia;        
        
        JOptionPane.showMessageDialog(null, "Vamos fazer um calculo de potencia!!!");
        pnumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero base"));
        snumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o expoente"));

        potencia = Math.pow(pnumero, snumero);

        JOptionPane.showMessageDialog(null, pnumero + "^" + snumero + " = " + potencia, "Resultado", 0);
    }
}
