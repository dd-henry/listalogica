import javax.swing.JOptionPane;

public class Exercicio16 {
    public static void main(String[] args) {
        double saldo;
        String[] opcoes = {"Sim", "Não"};
        saldo = 0;

              

        int op = JOptionPane.showOptionDialog(null, "Deseja fazer um deposito?", "Conta Nubank", 0, 3, null, opcoes, opcoes[0]);

        if (op == 0) {
            saldo += Double.parseDouble(JOptionPane.showInputDialog("Saldo atual: " + saldo +" \n Digite a quantia que será depositada na conta"));
            JOptionPane.showMessageDialog(null, "Saldo atual: " + saldo);
            JOptionPane.showMessageDialog(null, "Dois cheques de R$100,00 foram emitidos");
            JOptionPane.showMessageDialog(null, "Saldo atual: " + (saldo - 200 - (200 * 0.0038)));
            



            //+ (saldo - (100 * 0.0038)));
        }
        

    }
}
