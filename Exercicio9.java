
import javax.swing.JOptionPane;

/*9. Fazer um programa que recebe o valor de um depósito
 e o valor da taxa de juros, calcula e mostra o valor do 
 rendimento e o valor total depois do rendimento.  */


public class Exercicio9 {
    public static void main(String[] args) {
        double valorDeposito, valorJuros;
        valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: "));

        valorJuros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa de juros (%): "));

        JOptionPane.showMessageDialog(null, "Após os juros serem aplicados o seu valor total é de: R$" + (valorDeposito + (valorDeposito * (valorJuros/100))) + "\n Valor Depositado: R$" + valorDeposito + "\n Taxa de juros: " + valorJuros + "0%" + "\n Valor do Juros : R$" + (valorDeposito + ((valorDeposito * (valorJuros/100))) - valorDeposito) , "Resultado", 1);
    }
}
